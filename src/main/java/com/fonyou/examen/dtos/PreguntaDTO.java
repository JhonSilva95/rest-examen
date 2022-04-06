package com.fonyou.examen.dtos;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonAutoDetect
@JsonSerialize
public class PreguntaDTO {

	private Long id;
	@NotNull
	private Long examenId;
	@NotEmpty
	private String pregunta;
	@NotEmpty
	private String opcionUno;
	@NotEmpty
	private String opcionDos;
	@NotEmpty
	private String opcionTres;
	@NotEmpty
	private String opcionCuatro;
	@NotNull
	private Integer respuesta;
	private Integer puntaje;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getExamenId() {
		return examenId;
	}

	public void setExamenId(Long examenId) {
		this.examenId = examenId;
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

	public void setRespuesta(Integer respuesta) {
		this.respuesta = respuesta;
	}

	public Integer getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(Integer puntaje) {
		this.puntaje = puntaje;
	}

}
