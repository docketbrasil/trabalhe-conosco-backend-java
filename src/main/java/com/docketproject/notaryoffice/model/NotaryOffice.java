package com.docketproject.notaryoffice.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class NotaryOffice implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id", referencedColumnName = "id")
	private Address address;

	@OneToMany(mappedBy = "notaryOffice", cascade = CascadeType.ALL)
	private List<Certificate> certificates;

	public NotaryOffice() {
	}

	public NotaryOffice(Long id, String name, Address address, List<Certificate> certificates) {
		this.id = id;
		this.name = name;
		this.address = address;
		certificates.forEach(x -> addCertificate(x));
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Certificate> getCertificates() {
		return certificates;
	}

	public void addCertificate(Certificate certificate) {
		if (certificate != null)
			if (certificates == null)
				certificates = new ArrayList<Certificate>();
		
		this.certificates.add(certificate);
		certificate.setNotaryOffice(this);
	}
}