package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IProyectoDAO;
import com.example.demo.dto.Proyecto;

@Service
public class ProyectoServiceImpl implements IProyectoService {
	@Autowired
	IProyectoDAO iProyectoDAO;
	
	@Override
	public List<Proyecto> listarProyectos() {
		// TODO Auto-generated method stub
		return iProyectoDAO.findAll();
	}

	@Override
	public Proyecto guardarProyecto(Proyecto proyecto) {
		// TODO Auto-generated method stub
		return iProyectoDAO.save(proyecto);
	}

	@Override
	public Proyecto proyectoXId(String id) {
		// TODO Auto-generated method stub
		return iProyectoDAO.findById(id).get();
	}

	@Override
	public Proyecto actualizarProyecto(Proyecto proyecto) {
		// TODO Auto-generated method stub
		return iProyectoDAO.save(proyecto);
	}

	@Override
	public void eliminarProyecto(String id) {
		// TODO Auto-generated method stub
		iProyectoDAO.deleteById(id);
		
	}
}