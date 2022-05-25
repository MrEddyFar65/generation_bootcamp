package com.pokemon;

public class Charmander extends Pokemon implements TipoFuego, TipoVolador{

	public Charmander(int id, int edad, int nivel, String nombre, boolean evolution) {
		super(id, edad, nivel,nombre, evolution);
	}
	
	public void lanzaLlamas() {
		System.out.println("Fuegoooooo");
	}
	
	public void araniazo() {
		System.out.println("ai te aranie");
	}
	
	public void volar() {
		System.out.println("vuela alv");
	}
}
