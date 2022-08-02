package com.alumnos.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.net.URI;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alumnos.model.Alumno;
import com.alumnos.service.AlumnoService;

@RestController
@RequestMapping ("/api/alumnos")
public class AlumnoREST {
	
	@Autowired
	private AlumnoService alumnoService;
	
	@PostMapping
	private ResponseEntity<Alumno> guardar(@RequestBody Alumno alumno){
		Alumno temporal = alumnoService.create(alumno);
		
		try {
			
			return ResponseEntity.created(new URI("/api/alumno"+temporal.getNum_control())).body(temporal);
			
		}catch (Exception e) {
			
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
			
		}
	}
	
	@GetMapping
	private ResponseEntity<java.util.List<Alumno>> listarTodosLosAlumnos(){
		
		return ResponseEntity.ok(alumnoService.getAllAlumnos());
		
	}
	
	@DeleteMapping
	private ResponseEntity<Void> eliminarAlumno (@RequestBody Alumno alumno){
		
		alumnoService.delete(alumno);
		return ResponseEntity.ok().build();
	}
	
	
	@GetMapping (value = "{numControl}")
	private ResponseEntity<Optional<Alumno>> listarAlumnosPorNumControl (@PathVariable ("numControl") Long numControl){
		
		return ResponseEntity.ok(alumnoService.findById(numControl));
	}
	
	
	

}
