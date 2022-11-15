package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IAsignadoDAO;
import com.example.demo.dto.Asignado_A;

@Service
public class AsignadoServiceImpl implements IAsignadoService {
	@Autowired
	IAsignadoDAO iAsignadoDAO;
	
	@Override
	public List<Asignado_A> listarAsignados() {
		// TODO Auto-generated method stub
		return iAsignadoDAO.findAll();
	}

	@Override
	public Asignado_A guardarAsignado(Asignado_A asignado) {
		// TODO Auto-generated method stub
		return iAsignadoDAO.save(asignado);
	}

	@Override
	public Asignado_A asignadoXId(int id) {
		// TODO Auto-generated method stub
		return iAsignadoDAO.findById(id).get();
	}

	@Override
	public Asignado_A actualizarAsignado(Asignado_A asignado) {
		// TODO Auto-generated method stub
		return iAsignadoDAO.save(asignado);
	}

	@Override
	public void eliminarAsignado(int id) {
		// TODO Auto-generated method stub
		iAsignadoDAO.deleteById(id);
		
	}
}
