package com.alumnos.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "alumno")
public class Alumno {
	
	@Id
	private Long num_control;
	
	private String nombre;
	private Double prom_general;
	
	
	public Alumno() {
		super();
	}
	
	public Alumno(Long num_control, String nombre, Double prom_general) {
		this.num_control = num_control;
		this.nombre = nombre;
		this.prom_general = prom_general;
	}
	
	
	public Long getNum_control() {
		return num_control;
	}
	public void setNum_control(Long num_control) {
		this.num_control = num_control;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Double getProm_general() {
		return prom_general;
	}
	public void setProm_general(Double prom_general) {
		this.prom_general = prom_general;
	}
	
	
	
}
