package com.generation.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.demo.model.Cohorte; 

@Repository
public interface CohorteRepository extends JpaRepository<Cohorte,Integer>{

	
}
