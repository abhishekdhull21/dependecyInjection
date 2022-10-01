package ca.sheridancollege.treves.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HomeController {

	@GetMapping("greeting")
	public String getuserData() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("index");
		return "index.html";
	}
}
