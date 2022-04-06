package com.fonyou.examen.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fonyou.examen.dtos.PreguntaDTO;
import com.fonyou.examen.models.Pregunta;
import com.fonyou.examen.services.PreguntaServices;

@RestController
@RequestMapping(path = "/preguntas", consumes = "application/json", produces = "application/json")
public class PreguntaController {

	@Autowired
	private PreguntaServices preguntaServices;
	
	@PostMapping
	public PreguntaDTO guardarPregunta(@Valid @RequestBody PreguntaDTO pregunta) {
		return preguntaServices.guardarPregunta(pregunta);
	}
	
	@GetMapping
	public List<PreguntaDTO> listarPreguntas(){
		return preguntaServices.listaPreguntas();
	}
	
	
}
