package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Asignado_A;

public interface IAsignadoService {

	public List<Asignado_A> listarAsignados();
	
	public Asignado_A guardarAsignado(Asignado_A asignado_a);
	
	public Asignado_A asignadoXId(int id);
	
	public Asignado_A actualizarAsignado(Asignado_A asignado_a);
	
	public void eliminarAsignado(int id);
}
