package com.fonyou.examen.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fonyou.examen.models.Pregunta;
@Repository
public interface PreguntaRepository extends JpaRepository<Pregunta, Long> {

}
