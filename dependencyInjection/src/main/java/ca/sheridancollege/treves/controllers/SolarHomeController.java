package ca.sheridancollege.treves.controllers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ca.sheridancollege.treves.beans.Config;
import ca.sheridancollege.treves.beans.SolarHome;

@Controller
public class SolarHomeController {
	@GetMapping("solarhome/index")
	public String index() {
		return ("solarhome/index");
	}

	@PostMapping("/solarhome/working")
	public String working(@RequestParam String style, @RequestParam int size, @RequestParam int index,
			@RequestParam String cardinal_direction, @RequestParam String heating_type, Model model) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		SolarHome solarhome = context.getBean("solarhome", SolarHome.class);
		solarhome.setStyle(style);
		solarhome.setSize(size);
		solarhome.setIndex(index);
		solarhome.setCardinalDirection(cardinal_direction);
		solarhome.setHeatingType(heating_type);

		model.addAttribute(solarhome);
		return ("solarhome/working");
	}
}
