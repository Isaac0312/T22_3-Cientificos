package com.example.demo.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="asignado_a")
public class Asignado_A {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private int id;
	
	@ManyToOne
	@JoinColumn(name="proyecto_id")
	Proyecto proyecto;
	
	@ManyToOne
    @JoinColumn(name = "cientifico_dni")
    Cientificos cientifico;
	
	public Asignado_A() {
		
	}
	
	public Asignado_A(int id, Proyecto project, Cientificos cientifico) {
		this.id=id;
		this.proyecto=project;
		this.cientifico=cientifico;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Proyecto getProyecto() {
		return proyecto;
	}

	public void setProyecto(Proyecto proyecto) {
		this.proyecto = proyecto;
	}

	public Cientificos getCientifico() {
		return cientifico;
	}

	public void setCientifico(Cientificos cientifico) {
		this.cientifico = cientifico;
	}

	@Override
	public String toString() {
		return "Asignado_A [id=" + id + ", proyecto=" + proyecto + ", cientifico=" + cientifico + "]";
	}
}
