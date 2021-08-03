package com.docketproject.notaryoffice.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.docketproject.notaryoffice.dto.NotaryOfficeDTO;
import com.docketproject.notaryoffice.exception.ObjectNotFoundException;
import com.docketproject.notaryoffice.model.Address;
import com.docketproject.notaryoffice.model.NotaryOffice;
import com.docketproject.notaryoffice.repository.NotaryOfficeRepository;

@Service
public class NotaryOfficeService {

	@Autowired
	private NotaryOfficeRepository repository;

	public NotaryOffice findById(Long id) {
		Optional<NotaryOffice> obj = repository.findById(id);
		NotaryOffice notaryOffice = obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + NotaryOffice.class.getName(), null));

		return notaryOffice;
	}

	@Transactional
	public NotaryOffice insert(NotaryOfficeDTO objDto) {
		NotaryOffice obj = fromDTO(objDto);
		return repository.save(obj);
	}

	public NotaryOffice update(NotaryOfficeDTO objDto) {
		NotaryOffice obj = fromDTO(objDto);
		return repository.save(obj);
	}

	public void delete(Long id) {
		findById(id);
		repository.deleteById(id);
	}

	public List<NotaryOffice> findAll() {
		List<NotaryOffice> list = repository.findAll();
		return list;
	}

	private NotaryOffice fromDTO(NotaryOfficeDTO objDto) {
		return new NotaryOffice(objDto.getId(), objDto.getName(), fillAddress(objDto), objDto.getCertificates());
	}

	private Address fillAddress(NotaryOfficeDTO objDto) {
		Address address = new Address();
		address.setEmail(objDto.getEmail());
		address.setPhoneNumber(objDto.getPhone());
		address.setStreet(objDto.getStreet());
		address.setCity(objDto.getCity());
		address.setCountry(objDto.getCountry());
		return address;
	}
}
