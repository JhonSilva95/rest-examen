package com.fonyou.examen.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fonyou.examen.dto.PreguntaDTO;
import com.fonyou.examen.models.Pregunta;
import com.fonyou.examen.repositories.ExamenRepository;
import com.fonyou.examen.repositories.PreguntaRepository;

@Service
public class PreguntaServices {

	@Autowired
	PreguntaRepository preguntaRepository;
	@Autowired
	ExamenRepository examenRepository;

	public List<PreguntaDTO> listaPreguntas() {
		List<Pregunta> preguntas =  preguntaRepository.findAll();
		List<PreguntaDTO> preguntaDTOs = new ArrayList<PreguntaDTO>();
		
		PreguntaDTO preguntaDTO;
		for (Pregunta pregunta : preguntas) {
			preguntaDTO = new PreguntaDTO();
			preguntaDTO.setId(pregunta.getId());
			preguntaDTO.setExamenId(pregunta.getExamenId());
			preguntaDTO.setOpcionUno(pregunta.getOpcionUno());
			preguntaDTO.setOpcionDos(pregunta.getOpcionDos());
			preguntaDTO.setOpcionTres(pregunta.getOpcionTres());
			preguntaDTO.setOpcionCuatro(pregunta.getOpcionCuatro());
			preguntaDTO.setRespuesta(pregunta.getRespuesta());
			preguntaDTO.setPregunta(pregunta.getPregunta());
			preguntaDTOs.add(preguntaDTO);
		}
		
		return preguntaDTOs;
	}

	public PreguntaDTO guardarPregunta(PreguntaDTO preguntaDTO) {
		//Examen examen = examenRepository.getById(preguntaDTO.getExamenId());

		Pregunta pregunta = new Pregunta();
		pregunta.setExamenId(preguntaDTO.getExamenId());
		pregunta.setOpcionUno(preguntaDTO.getOpcionUno());
		pregunta.setOpcionDos(preguntaDTO.getOpcionDos());
		pregunta.setOpcionTres(preguntaDTO.getOpcionTres());
		pregunta.setOpcionCuatro(preguntaDTO.getOpcionCuatro());
		pregunta.setPregunta(preguntaDTO.getPregunta());
		pregunta.setRespuesta(preguntaDTO.getRespuesta());

		pregunta = preguntaRepository.save(pregunta);
		preguntaDTO.setId(pregunta.getId());
		return preguntaDTO;
	}

	public List<Pregunta> getPreguntasById(Long id) {
		return preguntaRepository.findByExamenId(id);
	}
}
