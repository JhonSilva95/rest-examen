package com.fonyou.examen.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.fonyou.examen.models.Estudiante;
import com.fonyou.examen.services.EstudianteService;

@RestController
@RequestMapping(path = "/estudiantes", consumes = "application/json", produces = "application/json")
public class EstudianteController {

	@Autowired
	private EstudianteService estudianteService;
	
	@PostMapping
	public Estudiante guardarEstudiante(@RequestBody Estudiante estudiante) {
		return estudianteService.guardarEstudiante(estudiante);
	}
	
	@GetMapping
	public List<Estudiante> listarEstudiante(){
		return estudianteService.listarEstudiantes();
	}
	
	
}
