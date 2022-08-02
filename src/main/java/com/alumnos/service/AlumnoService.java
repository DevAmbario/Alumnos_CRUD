package com.alumnos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alumnos.model.Alumno;
import com.alumnos.repository.AlumnoRepository;

@Service
public class AlumnoService {
	
	
	@Autowired
	private AlumnoRepository alumnoRepository;
	
	
	
	public Alumno create (Alumno alumno) {
		return alumnoRepository.save(alumno);
	}
	
	public List<Alumno> getAllAlumnos(){
		return alumnoRepository.findAll();
	}
	
	public void delete (Alumno alumno) {
		alumnoRepository.delete(alumno);
	}
	
	public Optional<Alumno> findById(Long numControl){
		return alumnoRepository.findById(numControl);
	}

}
