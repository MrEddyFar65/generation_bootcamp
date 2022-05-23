package com.pokemon;

public class Pokemon {

	private int id;
	private int edad;
	private int nivel;
	private String nombre;
	private boolean evolution;
	
	public Pokemon(int id, int edad, int nivel, String nombre, boolean evolution) {
		
		this.id = id;
		this.edad = edad;
		this.nivel = nivel;
		this.nombre = nombre;
		this.evolution = evolution;
	}
	
	public void comer() {
		System.out.println(nombre+ " esta tragando");
	}
	
	public void atacar() {
		System.out.println(nombre+ " esta atacando");
	}
	
	public void dormir() {
		System.out.println("ZZZZZ");
	}
	
}
