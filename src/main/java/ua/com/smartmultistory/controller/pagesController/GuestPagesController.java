package ua.com.smartmultistory.controller.pagesController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.savedrequest.RequestCache;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GuestPagesController {

	@Autowired
	private RequestCache requestCache;

	@GetMapping("/")
	String getPresentation(Model model) {
		return "presentation_page";
	}

	@GetMapping("/howToJoin")
	String getHowToJoin(Model model) {
		return "howToJoin_page";
	}

	//login
	@GetMapping("/login")
	String getLogin(@RequestParam(value = "error", required = false) String error,
					@RequestParam(value = "logout", required = false) String logout,
					Model model) {
		model.addAttribute("error", error != null);
		model.addAttribute("logout", logout != null);
		return "entry_page";
	}

//
//	@GetMapping("/error")
//	public String getError(Model model) {
//		model.addAttribute("time", new Date(System.currentTimeMillis()));
//		model.addAttribute("error", "error...");
//		model.addAttribute("message", "message...");
//		return "error_page";
//	}
}