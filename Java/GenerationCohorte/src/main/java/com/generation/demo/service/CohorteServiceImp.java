package com.generation.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generation.demo.model.Cohorte;
import com.generation.demo.repository.CohorteRepository;

@Service
public class CohorteServiceImp implements CohorteService{

	
	CohorteRepository cohorteRepository;
	
	//CohorteService cohorteService = new CohorteServiceImp();
	
	public CohorteServiceImp(@Autowired CohorteRepository cohorteRepository) {
		this.cohorteRepository = cohorteRepository;
	}
	
	@Override
	public Cohorte getCohorte(Integer id) {
		// TODO Auto-generated method stub
		Optional<Cohorte> cohorte =  cohorteRepository.findById(id);
		return cohorte.orElse(null);
	}

	@Override
	public List<Cohorte> conseguirCohorte() {
		// TODO Auto-generated method stub
		return cohorteRepository.findAll();
	}

	@Override
	public Cohorte saveCohorte(Cohorte cohorte) {
		// TODO Auto-generated method stub
		return cohorteRepository.save(cohorte);
	}

	@Override
	public List<Cohorte> getCohortesByCiudad(String ciudad) {
		return cohorteRepository.findByCiudad(ciudad); 
		}

	

}
