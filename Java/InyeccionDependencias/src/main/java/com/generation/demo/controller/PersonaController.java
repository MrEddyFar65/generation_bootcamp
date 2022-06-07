package com.generation.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.generation.demo.service.PersonaServiceImp1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping; 

@RestController
@RequestMapping("/api")
public class PersonaController {

	private PersonaServiceImp1 personaServiceImp1;
	
	@Autowired
	public PersonaController(PersonaServiceImp1 personaServiceImp1) {
		this.personaServiceImp1 = personaServiceImp1;
	}
	
	@GetMapping("/saludo")	
	public String saludo() {
		return "Hola";
	}
	
	@GetMapping("/registro")
	public String refistro(@RequestParam(value = "nombre", defaultValue = "anonymous")String nombre) {
		

		return personaServiceImp1.registro(nombre);
	}


}
