package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ICientificosDAO;
import com.example.demo.dto.Cientificos;

@Service
public class CientificosServiceImpl implements ICientificosService {
	@Autowired
	ICientificosDAO iCientificosDAO;
	
	@Override
	public List<Cientificos> listarCientificos() {
		// TODO Auto-generated method stub
		return iCientificosDAO.findAll();
	}

	@Override
	public Cientificos guardarCientifico(Cientificos cientifico) {
		// TODO Auto-generated method stub
		return iCientificosDAO.save(cientifico);
	}

	@Override
	public Cientificos cientificoXId(String DNI) {
		// TODO Auto-generated method stub
		return iCientificosDAO.findById(DNI).get();
	}

	@Override
	public Cientificos actualizarCientifico(Cientificos cientifico) {
		// TODO Auto-generated method stub
		return iCientificosDAO.save(cientifico);
	}

	@Override
	public void eliminarCientifico(String DNI) {
		// TODO Auto-generated method stub
		iCientificosDAO.deleteById(DNI);
		
	}
}
