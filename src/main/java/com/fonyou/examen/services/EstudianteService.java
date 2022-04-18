package com.fonyou.examen.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fonyou.examen.models.Estudiante;
import com.fonyou.examen.repositories.EstudianteRepository;

@Service
public class EstudianteService {
	@Autowired
	private EstudianteRepository estudianteRespository;
	
	public Estudiante guardarEstudiante(Estudiante estudiante) {
		return estudianteRespository.save(estudiante);
	}
	
	public List<Estudiante> listarEstudiantes() {
		return estudianteRespository.findAll();
	}
	

}
