package com.docketproject.notaryoffice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.docketproject.notaryoffice.dto.CertificateDTO;

import reactor.core.publisher.Mono;

@Service
public class CertificateService {
	
	@Autowired
	private WebClient webClient;

	public List<CertificateDTO> findAllFromApi() {
		
		Mono<List<CertificateDTO>> monoListCetificate = this.webClient
			.method(HttpMethod.GET)
			.uri("/api/v1/certidoes").retrieve()
			.bodyToMono(new ParameterizedTypeReference<List<CertificateDTO>>() {});
		
		return monoListCetificate.block();
	}
}
