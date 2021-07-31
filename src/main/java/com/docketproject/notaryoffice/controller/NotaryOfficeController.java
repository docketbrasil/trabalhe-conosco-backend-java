package com.docketproject.notaryoffice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.docketproject.notaryoffice.dto.NotaryOfficeDTO;
import com.docketproject.notaryoffice.service.NotaryOfficeService;

@Controller
@RequestMapping("notaryoffice")
public class NotaryOfficeController {

	@Autowired
	private NotaryOfficeService service;
	
	@GetMapping("form")
	public String notaryOfficeView() {
		return "notaryOffice";
	}

	@PostMapping("create")
	public String createNotaryOffice(NotaryOfficeDTO objDto) {
		service.insert(objDto);
		return "notaryOffice";
	}
}
