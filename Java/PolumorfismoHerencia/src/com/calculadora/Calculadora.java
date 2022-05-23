package com.calculadora;

public class Calculadora {

	private int a;
	private int b;
	private int result;
	public Calculadora(int a, int b) {
		this.a = a;
		this.b = b;
		
	}
	
	public void sumar() {
		result = a + b;
		System.out.println("La suma es: " + result);
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	
	
}
