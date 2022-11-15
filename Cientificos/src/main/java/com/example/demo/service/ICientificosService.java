package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Cientificos;

public interface ICientificosService {
	public List<Cientificos> listarCientificos();
	
	public Cientificos guardarCientifico(Cientificos cientifico);
	
	public Cientificos cientificoXId(String DNI);
	
	public Cientificos actualizarCientifico(Cientificos cientifico);
	
	public void eliminarCientifico(String DNI);
}
