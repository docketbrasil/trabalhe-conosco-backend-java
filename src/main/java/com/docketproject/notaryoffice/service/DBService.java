package com.docketproject.notaryoffice.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.docketproject.notaryoffice.model.Address;
import com.docketproject.notaryoffice.model.Certificate;
import com.docketproject.notaryoffice.model.NotaryOffice;
import com.docketproject.notaryoffice.repository.AddressRepository;
import com.docketproject.notaryoffice.repository.CertificateRepository;
import com.docketproject.notaryoffice.repository.NotaryOfficeRepository;

@Service
public class DBService {

	@Autowired
	private NotaryOfficeRepository notaryOfficeRepository;

	@Autowired
	private AddressRepository addressRepository;

	@Autowired
	private CertificateRepository certificateRepository;

	public void instantiateTestDatabase() {

		Certificate cft1 = new Certificate(null, "3rd Copy of Marriage Certificate");

		Address ad1 = new Address(null, "l5uz8hpown@temporary-mail.net", "646-840-7896", "4338 Forest Avenue",
				"New York", "USA");

		NotaryOffice nf1 = new NotaryOffice(null, "The Professional Notary.", ad1, Arrays.asList(cft1));

		ad1.setNotaryOffice(nf1);
		cft1.setNotaryOffice(nf1);

		notaryOfficeRepository.save(nf1);
		certificateRepository.save(cft1);
		addressRepository.save(ad1);
	}
}
