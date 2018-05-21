package ua.com.smartmultistory.controller.pagesController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EntryPageController {

	@GetMapping("/entry_page")
	String getView(Model model) {
		return "entry_page";
	}

}