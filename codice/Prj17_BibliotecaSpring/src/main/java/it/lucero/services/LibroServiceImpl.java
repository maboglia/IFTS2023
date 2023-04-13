package it.lucero.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.lucero.entities.Libro;
import it.lucero.repositories.LibroDAO;

@Service
public class LibroServiceImpl implements LibroService {

	@Autowired
	LibroDAO dao;

	@Override
	public List<Libro> getLibri() {
		return dao.findAll();
	}

	@Override
	public List<Libro> getLibriByClassificazione(String classificazione) {
		return dao.findByClassificazione(classificazione);
	}

	@Override
	public List<String> getClassificazioni() {
		Set<String> classificazione = new TreeSet<String>();
		for (Libro libro : getLibri()) {
			classificazione.add(libro.getClassificazione());
		}
		return new ArrayList<>(classificazione);
	}

	@Override
	public Libro addLibro(Libro l) {
		return dao.save(l);
	}
}