package com.docketproject.notaryoffice.utils;

import java.util.HashMap;
import java.util.Map;

import com.docketproject.notaryoffice.dto.NotaryOfficeDTO;
import com.docketproject.notaryoffice.service.CertificateService;

public class ControllerUtils {

	public static Map<String, Object> fillMap(CertificateService certificateService) {
		Map<String, Object> mapModels = new HashMap<>();
		mapModels.put("certificates", certificateService.findAllFromApi());
		mapModels.put("notaryOfficeDTO", new NotaryOfficeDTO());
		return mapModels;
	}
}
