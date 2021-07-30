package com.docketproject.notaryoffice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NotaryOfficeController {

	@GetMapping("/notaryoffice")
	public String notaryOfficeView(Model model) {
		model.addAttribute("name", "Closed");
		return "notaryOffice";
	}
}
