package com.fonyou.examen.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fonyou.examen.models.Examen;
@Repository
public interface ExamenRepository extends JpaRepository<Examen, Long> {

}
