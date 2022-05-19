package com.generation.model;

import java.util.HashMap;
import java.util.Map;

public class Dog {

	private String nombre;
	private String raza;
	private String height;
	private int edad;
	private String color;
	public static int contador;
	private int id;
	
	private static Map<Integer, String> humano = new HashMap<Integer, String>(); 
	
	public Dog(String nombre, String raza, String height, int edad, String color, int id) {
		
		this.nombre = nombre;
		this.raza = raza;
		this.height = height;
		this.edad = edad;
		this.color = color;
		this.id = Dog.contador++;
	}
	
	public static String buscarHumano(Integer key) { return "El nombre de este humano es: " + humano.get(key); } 
	
	
	//Getters y Setters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	
	//Override
	
	public static int getContador() {
		return contador;
	}


	public static void setContador(int contador) {
		Dog.contador = contador;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public static String getHumano(Integer key) {
		return humano.get(key);
	}


	public  void setHumano(String value) {
		Dog.humano.put(this.id, value);
	}

	
	

	public String toString(){
		return "Perro [nombre " + nombre + ", raza " + raza + ", tamanio " + height + ", edad " + edad + ", color "+ color+"]";
	}
	
}
