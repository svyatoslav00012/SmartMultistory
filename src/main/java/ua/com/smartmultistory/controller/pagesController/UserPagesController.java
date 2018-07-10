package ua.com.smartmultistory.controller.pagesController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserPagesController {

	@GetMapping("/home")
	String getHome(Model model) {
		return "home_page";
	}

	@GetMapping("/brief")
	String getBrief(Model model) {
		return "brief_page";
	}

	@GetMapping("/chat")
	String getChat(Model model) {
		return "chat_page";
	}

	@GetMapping("/counters")
	String getCounters(Model model) {
		return "counters_page";
	}

	@GetMapping("/notice")
	String getNotice(Model model) {
		return "notice_page";
	}

	@GetMapping("/tracking")
	String getTracking(Model model) {
		return "tracking_page";
	}

}