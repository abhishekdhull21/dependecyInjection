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
import ca.sheridancollege.treves.beans.Student;

@Controller
public class HomeController {

	@GetMapping("/")
	public String login() {
		return "index.html";
	}

	@PostMapping("/welcome")
	public String welcome(@RequestParam String username, @RequestParam String password, Model model) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Student student = context.getBean("student", Student.class);
		Message message = context.getBean("message", Message.class);
		message.console(student.toString());
		if (username.equals(student.getName()) && password.endsWith(student.getStudentNumber())) {
			model.addAttribute("student", student);
			return "welcome.html";
		}
		model.addAttribute("error", "Please enter correct credentials");
		return "index.html";

	}
}
