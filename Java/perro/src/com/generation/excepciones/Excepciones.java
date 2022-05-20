package com.generation.excepciones;

public class Excepciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float n = 0.001f;
		float m = (Integer) null;
		
		float division;
		
		try {
			division = n/m;
		}catch(ArithmeticException ex) {
			division = 3;
		}catch (NullPointerException nu){ 
			division = 0.0f; 
			System.out.println("Error: " + nu.getMessage()); 
			}finally{ 
				System.out.println("Ya estuvo"); } 
		System.out.println(division); 
		System.out.println(division);
	}

}
