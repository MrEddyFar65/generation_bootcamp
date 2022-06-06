package com.generation.demo;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/mandardatos")
public class MandarDatos {
	
	@GetMapping("/saludo")
	public String buenas() {
		return "Te vuelvo a saludar BABOSO";
	}
	
	@GetMapping("/mandarsaludos")
	public String mandarS(@RequestParam(value = "nombre", defaultValue = "anonymous") String nombre) {
		return "Buenos Dias amigazo " + nombre;
	}
}
