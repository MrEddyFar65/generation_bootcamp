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
	public void comer(String comida) {
		System.out.println(nombre+ " esta tragando " + comida);
	}
	
	public void atacar() {
		System.out.println(nombre+ " esta atacando");
	}
	
	public void dormir() {
		System.out.println("ZZZZZ");
	}

	//getter and setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isEvolution() {
		return evolution;
	}

	public void setEvolution(boolean evolution) {
		this.evolution = evolution;
	}
	
	
	//public abstract void saludado(String mensaje);
	
}
