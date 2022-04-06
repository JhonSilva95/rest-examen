package com.fonyou.examen.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fonyou.examen.models.Respuesta;

@Repository
public interface RespuestaRepository extends JpaRepository<Respuesta, Long> {

	Respuesta findByEstudianteIdAndPreguntaId(Long estudianteId, Long preguntaId);

}
