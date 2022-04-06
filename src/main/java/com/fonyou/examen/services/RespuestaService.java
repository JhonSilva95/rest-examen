package com.fonyou.examen.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fonyou.examen.dto.RespuestaDTO;
import com.fonyou.examen.dtos.PreguntaDTO;
import com.fonyou.examen.models.Examen;
import com.fonyou.examen.models.Pregunta;
import com.fonyou.examen.models.Respuesta;
import com.fonyou.examen.repositories.ExamenRepository;
import com.fonyou.examen.repositories.PreguntaRepository;
import com.fonyou.examen.repositories.RespuestaRepository;

@Service
public class RespuestaService {

	@Autowired
	private RespuestaRepository respuestaRepository;
	@Autowired
	private PreguntaRepository preguntaRepository;
	@Autowired
	private ExamenRepository examenRepository;

	public RespuestaDTO guardarRespuesta(RespuestaDTO rDto) {
		Respuesta respuesta = new Respuesta();
		respuesta.setEstudianteId(rDto.getEstudianteId());
		respuesta.setPreguntaId(rDto.getPreguntaId());
		respuesta.setRespuesta(rDto.getRespuesta());
		respuesta = respuestaRepository.save(respuesta);

		Pregunta pregunta = preguntaRepository.getById(respuesta.getPreguntaId());
		Examen examen = examenRepository.getById(pregunta.getExamenId());

		rDto.setId(respuesta.getId());
		rDto.setExamen(examen.getNombre());
		rDto.setPregunta(pregunta.getPregunta());
		return rDto;
	}

	public List<RespuestaDTO> lista() {
		List<Respuesta> respuestas = respuestaRepository.findAll();
		List<RespuestaDTO> respuestaDTOs = new ArrayList<RespuestaDTO>();
		RespuestaDTO respuestaDTO;
		for (Respuesta respuesta : respuestas) {
			respuestaDTO = new RespuestaDTO();
			Pregunta pregunta = preguntaRepository.getById(respuesta.getPreguntaId());
			Examen examen = examenRepository.getById(pregunta.getExamenId());
			respuestaDTO.setPregunta(pregunta.getPregunta());
			respuestaDTO.setEstudianteId(respuesta.getEstudianteId());
			respuestaDTO.setExamen(examen.getNombre());
			respuestaDTOs.add(respuestaDTO);

		}

		return respuestaDTOs;
	}

	public Respuesta findByEstudianteIdAndPreguntaId(Long estudianteId, Long preguntaId) {
		return respuestaRepository.findByEstudianteIdAndPreguntaId(estudianteId, preguntaId);
	}

}
