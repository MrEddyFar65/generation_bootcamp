package com.generation.demo.service;

import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImp1 implements PersonService {

	@Override
	public String registro(String nombre) {
		return "el wey " + nombre + " se ha registrado";
	}
}
