package com.docketproject.notaryoffice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.docketproject.notaryoffice.model.NotaryOffice;

@Repository
public interface NotaryOfficeRepository extends JpaRepository<NotaryOffice, Long>{

}
