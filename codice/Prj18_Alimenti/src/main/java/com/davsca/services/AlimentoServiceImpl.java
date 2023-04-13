package com.davsca.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.davsca.entities.Alimento;
import com.davsca.repos.AlimentoDAO;

@Service
public class AlimentoServiceImpl implements AlimentoService {
	
	@Autowired
	private AlimentoDAO dao;
	
	@Override
	public List<Alimento> getAlimenti() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public List<String> getCategorie() {
		Set<String> categorie = new TreeSet<>();
		for (Alimento alimento : getAlimenti()) {
			categorie.add(alimento.getCategoria());
		}
		return new ArrayList<>(categorie);
	}

	@Override
	public List<Alimento> getAlimentiByCategoria(String categoria) {
		
		return dao.findByCategoria(categoria);
	}
	
}
