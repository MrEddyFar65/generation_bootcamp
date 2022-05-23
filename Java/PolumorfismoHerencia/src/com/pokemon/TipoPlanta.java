package com.pokemon;

public class TipoPlanta extends Pokemon {

	int numeroHojas;
	
	public TipoPlanta(int id, int edad, int nivel, String nombre, boolean evolution, int numeroHojas) {
		super(id, edad, nivel, nombre, evolution);
		this.numeroHojas = numeroHojas;
	
	}
	
	
	public void evenenar() {
		System.out.println("Envenenado");
	}
}
