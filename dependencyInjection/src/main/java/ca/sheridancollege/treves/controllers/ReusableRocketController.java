package ca.sheridancollege.treves.controllers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ca.sheridancollege.treves.beans.Config;
import ca.sheridancollege.treves.beans.Message;
import ca.sheridancollege.treves.beans.ReusableRocket;
import ca.sheridancollege.treves.beans.Student;

@Controller
public class ReusableRocketController {
	@GetMapping("reusablerocket/index")
	public String index() {
		return ("reusablerocket/index");
	}

	@PostMapping("/reusablerocket/working")
	public String working(@RequestParam String name, @RequestParam int height, @RequestParam int capacity,
			@RequestParam int reuses, Model model) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		ReusableRocket reusableRocket = context.getBean("reusablerocket", ReusableRocket.class);
		Student student = context.getBean("student", Student.class);
		Message message = context.getBean("message", Message.class);
		message.console(student.toString());
		reusableRocket.setCapacity(capacity);
		reusableRocket.setHeight(capacity);
		reusableRocket.setName(name);
		reusableRocket.setReuses(reuses);
		model.addAttribute("reusablerocket", reusableRocket);
		return ("reusablerocket/working");
	}
}
