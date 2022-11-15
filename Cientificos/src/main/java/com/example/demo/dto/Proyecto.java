package com.example.demo.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="proyecto")
public class Proyecto {

	@Id
	String id;
	
	@Column(name="nombre")
	String nombre;
	
	@Column(name="horas")
	int horas;
	
	@OneToMany
	@JoinColumn(name="id")
	List<Asignado_A> asignado_a;
	
	public Proyecto() {
		
	}
	
	public Proyecto(String id, int horas, String nombre, List<Asignado_A> aux) {
		this.id=id;
		this.horas=horas;
		this.nombre=nombre;
		this.asignado_a=aux;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public List<Asignado_A> getAsignado_a() {
		return asignado_a;
	}

	public void setAsignado_a(List<Asignado_A> asignado_a) {
		this.asignado_a = asignado_a;
	}

	@Override
	public String toString() {
		return "Proyecto [id=" + id + ", nombre=" + nombre + ", horas=" + horas + ", asignado_a=" + asignado_a + "]";
	}
}
