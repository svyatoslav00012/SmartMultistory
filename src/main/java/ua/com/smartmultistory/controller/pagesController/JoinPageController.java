package ua.com.smartmultistory.controller.pagesController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JoinPageController {

	@GetMapping("/join_page")
	String getView(Model model) {
		return "join_page";
	}

}