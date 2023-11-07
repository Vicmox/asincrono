package com.ufps.asincrono.dto;

import java.time.LocalDate;

public class ClienteDTO {

	private Long id;
	private String nombre;
	private String apellido;
	private String email;
	private LocalDate fecha_inscripcion;
	
	public ClienteDTO() {
		super();
	}

	public ClienteDTO(Long id, String nombre, String apellido, String email, LocalDate fecha_inscripcion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.fecha_inscripcion = fecha_inscripcion;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getFecha_inscripcion() {
		return fecha_inscripcion;
	}

	public void setFecha_inscripcion(LocalDate fecha_inscripcion) {
		this.fecha_inscripcion = fecha_inscripcion;
	}
}
