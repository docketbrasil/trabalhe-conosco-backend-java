package com.docketproject.notaryoffice.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Certificate implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;

	@ManyToOne
	@JoinColumn(name = "notaryoffice_id")
	private NotaryOffice notaryOffice;

	public Certificate() {
	}

	public Certificate(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public NotaryOffice getNotaryOffice() {
		return notaryOffice;
	}

	public void setNotaryOffice(NotaryOffice notaryOffice) {
		this.notaryOffice = notaryOffice;
	}
}
