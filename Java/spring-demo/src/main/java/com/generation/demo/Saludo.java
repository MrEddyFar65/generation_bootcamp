package com.generation.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class Saludo {
	
	//Peticiones Web
	//GET, POST,

	@GetMapping("/saludo")
	public String saludo() {
		return "Hola que pedo";
	}
	
	@GetMapping("/springtest")
	public String springtest() {
		return "Funcionando.....";
	}
	
}
