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

import com.example.demo.dto.Cientificos;
import com.example.demo.service.CientificosServiceImpl;

@RestController
@RequestMapping("/api")
public class CientificosController {
	@Autowired
	CientificosServiceImpl cientificosServiceImpl;
	
	@GetMapping("/cientificos")
	public List<Cientificos> listarCientificos(){
		return cientificosServiceImpl.listarCientificos();
	}
	
	@PostMapping("/cientificos")
	public Cientificos salvarCientifico(@RequestBody Cientificos cientifico) {
		return cientificosServiceImpl.guardarCientifico(cientifico);
	}
	
	@GetMapping("/cientificos/{id}")
	public Cientificos cientificoXId(@PathVariable(name="DNI")String DNI) {
		
		Cientificos cientifico_x_id = new Cientificos();
		cientifico_x_id = cientificosServiceImpl.cientificoXId(DNI);
		System.out.println("Cientifico XID: "+cientifico_x_id);
		return cientifico_x_id;
	}
	
	@PutMapping("/cientificos/{id}")
	public Cientificos actualizarCientifico(@PathVariable(name="DNI")String DNI,@RequestBody Cientificos cientifico) {
		
		Cientificos cientifico_seleccionado= new Cientificos();
		Cientificos cientifico_actualizado= new Cientificos();
		
		cientifico_seleccionado= cientificosServiceImpl.cientificoXId(DNI);
		
		cientifico_seleccionado.setDNI(cientifico.getDNI());
		cientifico_seleccionado.setNom_apels(cientifico.getNom_apels());
		
		cientifico_actualizado = cientificosServiceImpl.actualizarCientifico(cientifico_seleccionado);
		
		System.out.println("El cientifico actualizado es: "+ cientifico_actualizado);
		
		return cientifico_actualizado;
	}
	
	@DeleteMapping("/cientificos/{id}")
	public void eliminarCientifico(@PathVariable(name="DNI")String DNI) {
		cientificosServiceImpl.eliminarCientifico(DNI);
	}
}
