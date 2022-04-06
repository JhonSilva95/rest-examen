package com.fonyou.examen.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fonyou.examen.dto.CalificacionDto;
import com.fonyou.examen.services.CalificacionService;

@RestController
@RequestMapping(path = "/calificaciones", consumes = "application/json", produces = "application/json")
public class CalificacionController {

	@Autowired
	private CalificacionService calificacionServices;

	@GetMapping
	public List<CalificacionDto> calificaciones() {
		return calificacionServices.calificaciones();
	}
}
