package ua.com.smartmultistory.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

	// inject via application.properties
	@Value("${welcome.message:test}")
	private String message = "Hello World";

	@GetMapping("/test")
	String getView(Model model) {
		model.addAttribute("msg", "Hello there, This message has been injected from the controller method");
		return "welcome";
	}

}