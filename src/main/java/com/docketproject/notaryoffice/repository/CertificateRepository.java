package com.docketproject.notaryoffice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.docketproject.notaryoffice.model.Certificate;

@Repository
public interface CertificateRepository extends JpaRepository<Certificate, Long>{

}
