package com.generation.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Colecciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> miArray = new ArrayList<String>();
		
		List<Integer> nuevaList = new ArrayList<Integer>();
		
		nuevaList.add(14);
		nuevaList.add(7);
		nuevaList.add(5);
		nuevaList.add(88);
		
		String mirei = "saludos";
		
		System.out.println(mirei.length());
		
		miArray.add("Pedro");
		miArray.add("Andres");
		miArray.add("Imaeh");

		System.out.println(miArray);
	
		
		Integer num1 = 10;
		
		System.out.println(!(num1 instanceof Integer));
		
		
		
		
		
		
		
		
		System.out.println(nuevaList);
		System.out.println(nuevaList.size());
		System.out.println(miArray.get(1).length());
		
		imprimir(miArray);
	}
	
	
	public static void imprimir(Collection coleccion) {
		
		for(Object elemento : coleccion) {
			System.out.println("Elemento " + elemento);
		}
		
	}
	

}
