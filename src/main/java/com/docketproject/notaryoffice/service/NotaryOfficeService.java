package com.docketproject.notaryoffice.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	public NotaryOffice insert(NotaryOffice notaryOffice) {
		return repository.save(notaryOffice);
	}

	public NotaryOffice update(NotaryOffice obj) {
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
}
