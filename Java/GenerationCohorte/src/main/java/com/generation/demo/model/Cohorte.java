package com.generation.demo.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cohorte")
public class Cohorte {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_cohorte;
	
	@Column(nullable = false)
	private Integer numero_cohorte;
	
	@Column(nullable = false)
	private String ciudad;

	
	@OneToMany(mappedBy = "cohorte")
	private List<Alumno> alumnos;
	
	@OneToOne(mappedBy = "cohorte")
	private Instructor instructor;
	
	
	
	//Getter and Setters
	public Integer getId_cohorte() {
		return id_cohorte;
	}

	public void setId_cohorte(Integer id_cohorte) {
		this.id_cohorte = id_cohorte;
	}

	public Integer getNumero_cohorte() {
		return numero_cohorte;
	}

	public void setNumero_cohorte(Integer numero_cohorte) {
		this.numero_cohorte = numero_cohorte;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	public List<Alumno> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(List<Alumno> alumnos) {
		this.alumnos = alumnos;
	}

	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}

	
}
