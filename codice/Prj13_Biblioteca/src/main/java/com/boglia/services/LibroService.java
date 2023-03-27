package com.boglia.services;

import java.util.List;

import com.boglia.entities.Libro;

public interface LibroService {

	Libro addLibro(Libro l);
	
	List<Libro> dammiTuttiILibri();
	Libro getLibroById(int id);
	
	List<Libro> getLibriByEditore(int editore_id);
}
