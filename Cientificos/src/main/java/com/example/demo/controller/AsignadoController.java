package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Asignado_A;
import com.example.demo.service.AsignadoServiceImpl;

@RestController
@RequestMapping("/api")
public class AsignadoController {
	@Autowired
	AsignadoServiceImpl asignadoServiceImpl;
	
	@GetMapping("/asignado")
	public List<Asignado_A> listarAsignados(){
		return asignadoServiceImpl.listarAsignados();
	}
	
	@PostMapping("/asignado")
	public Asignado_A salvarAsignado(@RequestBody Asignado_A asignado) {
		return asignadoServiceImpl.guardarAsignado(asignado);
	}
	
	@GetMapping("/asignado/{id}")
	public Asignado_A asignadoXId(@PathVariable(name="id")int id) {
		
		Asignado_A asignado_x_id = new Asignado_A();
		asignado_x_id = asignadoServiceImpl.asignadoXId(id);
		System.out.println("Asignado XID: "+asignado_x_id);
		return asignado_x_id;
	}
	
	@PutMapping("/asignado/{id}")
	public Asignado_A actualizarAsignado(@PathVariable(name="id")int id,@RequestBody Asignado_A asignado) {
		
		Asignado_A asignado_seleccionado= new Asignado_A();
		Asignado_A asignado_actualizado= new Asignado_A();
		
		asignado_seleccionado= asignadoServiceImpl.asignadoXId(id);
		
		asignado_seleccionado.setCientifico(asignado.getCientifico());
		asignado_seleccionado.setProyecto(asignado.getProyecto());
		asignado_seleccionado.setId(asignado.getId());
		
		asignado_actualizado = asignadoServiceImpl.actualizarAsignado(asignado_seleccionado);
		
		System.out.println("El asignado actualizado es: "+ asignado_actualizado);
		
		return asignado_actualizado;
	}
	
	@DeleteMapping("/asignado/{id}")
	public void eliminarAsignado(@PathVariable(name="id")int id) {
		asignadoServiceImpl.eliminarAsignado(id);
	}
}
