package com.fonyou.examen.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Estudiante {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(unique = true, nullable = false)
	private Long id;
	private String nombre;
	private Integer Edad;
	private String ciudad;
	private Date zonaHoraria;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getEdad() {
		return Edad;
	}
	public void setEdad(Integer edad) {
		Edad = edad;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public Date getZonaHoraria() {
		return zonaHoraria;
	}
	public void setZonaHoraria(Date zonaHoraria) {
		this.zonaHoraria = zonaHoraria;
	}
	
	
	
	
}
