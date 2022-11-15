package com.example.demo.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="cientificos")
public class Cientificos {

	@Id
	private String DNI;
	
	@Column(name="nom_apels")
	private String nom_apels;
	
	@OneToMany
	@JoinColumn(name="DNI")
	List<Asignado_A> asignado_a;
	
	public Cientificos() {
		
	}
	
	public Cientificos(String dni, String nom_apels, List<Asignado_A> aux) {
		this.DNI=dni;
		this.nom_apels=nom_apels;
		this.asignado_a=aux;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getNom_apels() {
		return nom_apels;
	}

	public void setNom_apels(String nom_apels) {
		this.nom_apels = nom_apels;
	}

	public List<Asignado_A> getAsignado_a() {
		return asignado_a;
	}

	public void setAsignado_a(List<Asignado_A> asignado_a) {
		this.asignado_a = asignado_a;
	}

	@Override
	public String toString() {
		return "Cientificos [DNI=" + DNI + ", nom_apels=" + nom_apels + ", asignado_a=" + asignado_a + "]";
	}
}
