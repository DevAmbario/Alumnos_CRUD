package com.alumnos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alumnos.model.Alumno;

public interface AlumnoRepository extends JpaRepository<Alumno, Long>{

}
