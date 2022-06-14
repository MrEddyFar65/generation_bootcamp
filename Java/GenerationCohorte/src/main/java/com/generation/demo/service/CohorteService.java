package com.generation.demo.service;

import java.util.List;

import com.generation.demo.model.Cohorte;

public interface CohorteService {

	
	//leer
	Cohorte getCohorte(Integer id);//leer una sola cohorte con el id indicado
	
	List<Cohorte> conseguirCohorte(); //leer todas las cohortes
	
	List<Cohorte> getCohortesByCiudad(String ciudad);
	//Escribir
	Cohorte saveCohorte(Cohorte cohorte);//guardar la cohorte enviada
	
	
	

}
