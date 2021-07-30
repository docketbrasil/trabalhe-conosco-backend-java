package com.docketproject.notaryoffice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.docketproject.notaryoffice.model.Adress;

@Repository
public interface AdressRepository extends JpaRepository<Adress, Long>{

}
