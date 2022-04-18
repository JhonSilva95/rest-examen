package com.fonyou.examen.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fonyou.examen.dto.CalificacionDto;
import com.fonyou.examen.models.Estudiante;
import com.fonyou.examen.models.Examen;
import com.fonyou.examen.models.Pregunta;
import com.fonyou.examen.models.Respuesta;

@Service
public class CalificacionService {

	@Autowired
	private ExamenService examenService;

	@Autowired
	private PreguntaServices preguntaServices;

	@Autowired
	private EstudianteService estudiantService;

	@Autowired
	private RespuestaService respuestaService;

	public List<CalificacionDto> calificaciones() {
		List<CalificacionDto> calificaciones = new ArrayList<CalificacionDto>();
		List<Examen> examenes = examenService.listarExamen();
		List<Estudiante> estudiantes = estudiantService.listarEstudiantes();

		for (Estudiante estudiante : estudiantes) {
			CalificacionDto calificacionDto = new CalificacionDto();
			

			for (Examen examen : examenes) {
				List<Pregunta> preguntas = preguntaServices.getPreguntasById(examen.getId());
				float puntosPregunta;
				if (preguntas.isEmpty()) {
					puntosPregunta = 0f;
				} else {
					puntosPregunta = 100 / preguntas.size();
				}

				float calificacion = 0;
				for (Pregunta pregunta : preguntas) {
					Respuesta respuesta = respuestaService.findByEstudianteIdAndPreguntaId(estudiante.getId(), pregunta.getId());
					if (respuesta != null && (respuesta.getRespuesta() == pregunta.getRespuesta())) {
						calificacion += puntosPregunta;
					}
				}

				calificacionDto.setEstudianteId(estudiante.getId());
				calificacionDto.setEstudiante(estudiante.getNombre());
				calificacionDto.setExamen(examen.getNombre());
				calificacionDto.setCalificacion(calificacion);
			}

			//
			calificaciones.add(calificacionDto);
		}

		return calificaciones;
	}

}
