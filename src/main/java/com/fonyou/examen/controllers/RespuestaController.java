package com.fonyou.examen.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fonyou.examen.dto.RespuestaDTO;
import com.fonyou.examen.services.RespuestaService;

@RestController
@RequestMapping(path = "/respuestas", consumes = "application/json", produces = "application/json")
public class RespuestaController {

	@Autowired
	private RespuestaService respuestaService;
	
	@PostMapping
	public RespuestaDTO guardarPregunta(@Valid @RequestBody RespuestaDTO respuestaDTO) {
		return respuestaService.guardarRespuesta(respuestaDTO);
	}
	
	@GetMapping
	public List<RespuestaDTO> listar(){
		return respuestaService.lista();
	}
	
	
}
