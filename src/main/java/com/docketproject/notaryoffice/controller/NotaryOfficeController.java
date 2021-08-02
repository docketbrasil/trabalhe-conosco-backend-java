package com.docketproject.notaryoffice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.docketproject.notaryoffice.dto.NotaryOfficeDTO;
import com.docketproject.notaryoffice.service.CertificateService;
import com.docketproject.notaryoffice.service.NotaryOfficeService;
import com.docketproject.notaryoffice.utils.ControllerUtils;

@Controller
@RequestMapping("notaryOffice")
public class NotaryOfficeController {

	@Autowired
	private NotaryOfficeService notaryOfficeService;

	@Autowired
	private CertificateService certificateService;

	@GetMapping("form")
	public String notaryOfficeView(Model model) {
		model.addAllAttributes(ControllerUtils.fillMap(certificateService));
		return "notaryOffice";
	}

	@PostMapping("create")
	public String createNotaryOffice(@ModelAttribute NotaryOfficeDTO notaryOfficeDTO, Model model) {
		model.addAttribute("certificates", certificateService.findAllFromApi());
		notaryOfficeService.insert(notaryOfficeDTO);
		return "notaryOffice/form";
	}
}
