package ua.com.smartmultistory.controller.pagesController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CountersPageController {

	@GetMapping("/counters_page")
	String getView(Model model) {
		return "counters_page";
	}

}