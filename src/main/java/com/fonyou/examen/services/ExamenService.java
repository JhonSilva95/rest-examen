package com.fonyou.examen.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fonyou.examen.models.Examen;
import com.fonyou.examen.repositories.ExamenRepository;

@Service
public class ExamenService {
	
	@Autowired
	private ExamenRepository examenRepository;
	
	public Examen crearExamen(Examen examen) {		
		return examenRepository.save(examen);
	}

	public List<Examen> listarExamen() {
		return examenRepository.findAll();
	}
}
