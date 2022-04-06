package com.fonyou.examen.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fonyou.examen.models.Examen;
import com.fonyou.examen.services.ExamenService;

@RestController
@RequestMapping(path = "/examen", consumes = "application/json", produces = "application/json")
public class ExamenController {
	
	@Autowired
	private ExamenService examenService;
	
	
	@PostMapping
	public Examen crearExamen(@Valid @RequestBody Examen examen) {
		return examenService.crearExamen(examen);
	}
	
	@GetMapping
	public List<Examen> listarExamen(){
		return examenService.listarExamen();
	}
	
}
