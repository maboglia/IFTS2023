package it.lucero.services;

import java.util.List;

import it.lucero.entities.Libro;

public interface LibroService {
	
	List<Libro> getLibri();
	List<Libro> getLibriByClassificazione(String classificazione);
	List<String> getClassificazioni();
	Libro addLibro(Libro l);
}