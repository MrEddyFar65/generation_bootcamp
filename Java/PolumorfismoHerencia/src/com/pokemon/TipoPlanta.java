package com.pokemon;

public class TipoPlanta extends Pokemon {

	int numeroHojas;
	
	public TipoPlanta(int id, int edad, int nivel, String nombre, boolean evolution, int numeroHojas) {
		super(id, edad, nivel, nombre, evolution);
		this.numeroHojas = numeroHojas;
	
	}
	
	
	public void envenenar() {
		System.out.println(getNombre() + " Envenenado");
	}

	public void paralizar() {
		System.out.println(getNombre() + " Paralizo");
	}


	//Getter and Setter
	public int getNumeroHojas() {
		return numeroHojas;
	}


	public void setNumeroHojas(int numeroHojas) {
		this.numeroHojas = numeroHojas;
	}
	
	public void saludado(String mensaje) {
		System.out.println("saludado");
	}
	
}
