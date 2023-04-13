package it.lucero.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import it.lucero.entities.Libro;

public interface LibroDAO extends JpaRepository<Libro, Integer> {
	
	List<Libro> findByClassificazione(String classificazione);

}
