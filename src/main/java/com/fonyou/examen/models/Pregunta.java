package com.fonyou.examen.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pregunta {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(unique = true, nullable = false)
	private Long id;	
	private Long examenId;
	private String pregunta;
	private String opcionUno;
	private String opcionDos;
	private String opcionTres;
	private String opcionCuatro;
	private Integer respuesta;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPregunta() {
		return pregunta;
	}
	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}
	public String getOpcionUno() {
		return opcionUno;
	}
	public void setOpcionUno(String opcionUno) {
		this.opcionUno = opcionUno;
	}
	public String getOpcionDos() {
		return opcionDos;
	}
	public void setOpcionDos(String opcionDos) {
		this.opcionDos = opcionDos;
	}
	public String getOpcionTres() {
		return opcionTres;
	}
	public void setOpcionTres(String opcionTres) {
		this.opcionTres = opcionTres;
	}
	public String getOpcionCuatro() {
		return opcionCuatro;
	}
	public void setOpcionCuatro(String opcionCuatro) {
		this.opcionCuatro = opcionCuatro;
	}
	public Integer getRespuesta() {
		return respuesta;
	}
	public void setRespuesta(Integer respusta) {
		this.respuesta = respusta;
	}
	public Long getExamenId() {
		return examenId;
	}
	public void setExamenId(Long examenId) {
		this.examenId = examenId;
	}
	
	
}
