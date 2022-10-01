package ca.sheridancollege.treves.controllers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ca.sheridancollege.treves.Volume;
import ca.sheridancollege.treves.beans.Config;
import ca.sheridancollege.treves.beans.Message;
import ca.sheridancollege.treves.beans.Student;

@Controller
public class VolumeController {

	@PostMapping("/volume")
	public String formPost(@RequestParam int height, @RequestParam int width, @RequestParam int length, Model model) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Volume volume = context.getBean("volume", Volume.class);
		Student student = context.getBean("student", Student.class);
		Message message = context.getBean("message", Message.class);
		message.console(student.toString());
		volume.setHeight(height);
		volume.setLength(length);
		volume.setWidth(width);
		model.addAttribute("volume", volume);
		return "results.html";
	}
}
