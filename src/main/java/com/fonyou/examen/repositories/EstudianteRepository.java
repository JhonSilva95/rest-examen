package com.fonyou.examen.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fonyou.examen.models.Estudiante;
@Repository
public interface EstudianteRepository extends JpaRepository<Estudiante, Long> {

}
