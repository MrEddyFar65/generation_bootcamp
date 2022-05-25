package com.pokemon;

public class Chikorita extends TipoPlanta {
	int numeroCuernitos;
	
	
	public Chikorita(int id, int edad, int nivel, String nombre, boolean evolution, int numeroHojas,int numeroCuernitos) {

	
		
		super(id, edad, nivel,nombre, evolution, numeroHojas);
		this.numeroCuernitos = numeroCuernitos;
	}
	
	public void latigo() {
		System.out.println(getNombre() + " solto un madrazo" );
	}

	public int getNumeroCuernitos() {
		return numeroCuernitos;
	}

	public void setNumeroCuernitos(int numeroCuernitos) {
		this.numeroCuernitos = numeroCuernitos;
	}
	
	
}
