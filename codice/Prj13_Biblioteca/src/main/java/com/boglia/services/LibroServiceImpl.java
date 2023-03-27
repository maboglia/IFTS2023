package com.boglia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boglia.entities.Libro;
import com.boglia.repos.LibroDAO;

@Service
public class LibroServiceImpl implements LibroService {

	@Autowired 
	private LibroDAO dao;
	
	
	@Override
	public Libro addLibro(Libro l) {
		
		return dao.save(l);
	}

	@Override
	public List<Libro> dammiTuttiILibri() {
		
		return dao.findAll();
	}

	@Override
	public Libro getLibroById(int id) {
		
		return dao.findById(id).get();
	}

	@Override
	public List<Libro> getLibriByEditore(int editore_id) {
		// TODO Auto-generated method stub
		return null;
	}

}
