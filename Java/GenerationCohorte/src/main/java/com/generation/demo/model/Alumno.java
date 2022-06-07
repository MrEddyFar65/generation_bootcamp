package com.generation.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="alumno")
public class Alumno {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_alumno;
	
	@Column(nullable = false)
	private String nombre_alumno;
	
	@Column(nullable = false)
	private int edad;
	

	@Column(nullable = false)
	private String correo;
	
	
	@ManyToOne
	@JoinColumn(nullable = false, name = "cohorte_id")
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY) 
	private Cohorte cohorte;



	//Getter and Setters
	public int getId_alumno() {
		return id_alumno;
	}


	public void setId_alumno(int id_alumno) {
		this.id_alumno = id_alumno;
	}


	public String getNombre_alumno() {
		return nombre_alumno;
	}


	public void setNombre_alumno(String nombre_alumno) {
		this.nombre_alumno = nombre_alumno;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}


	public Cohorte getCohorte() {
		return cohorte;
	}


	public void setCohorte(Cohorte cohorte) {
		this.cohorte = cohorte;
	}
	
	
	
}
