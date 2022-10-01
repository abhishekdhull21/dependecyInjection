package ca.sheridancollege.treves.controllers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ca.sheridancollege.treves.beans.Config;
import ca.sheridancollege.treves.beans.HybridCar;
import ca.sheridancollege.treves.beans.Message;
import ca.sheridancollege.treves.beans.SolarHome;
import ca.sheridancollege.treves.beans.Student;

@Controller
public class HybridCarController {
	@GetMapping("hybridcar/index")
	public String index() {
		return ("hybridcar/index");
	}

	@PostMapping("/hybridcar/working")
	public String working(@RequestParam String make, @RequestParam String carmodel, @RequestParam int year,
			@RequestParam String engine_type, @RequestParam double index, Model model) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		HybridCar hybridCar = context.getBean("hybridcar", HybridCar.class);
		Student student = context.getBean("student", Student.class);
		Message message = context.getBean("message", Message.class);
		message.console(student.toString());
		hybridCar.setEngineType(engine_type);
		hybridCar.setIndex(year);
		hybridCar.setMake(make);
		hybridCar.setModel(carmodel);
		hybridCar.setYear(year);

		model.addAttribute("hybridcar", hybridCar);
		return ("hybridcar/working");
	}
}
