package it.lucero.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.lucero.entities.Libro;
import it.lucero.services.LibroService;

@RestController
@RequestMapping("api")
public class LibriREST {
	
	@Autowired
	private LibroService service;
	
	@GetMapping("classificazioni")
	List<String> getClassificazioni(){
		return service.getClassificazioni();
	}
	
	@GetMapping
	List<Libro> getLibri(){
		return service.getLibri();
	}
	
	@GetMapping("libri/{classificazione}")
	List<Libro> getLibriByClassificazione(@PathVariable String classificazione){
		return service.getLibriByClassificazione(classificazione);
	}
	
	@PostMapping("libri")
	Libro addLibro(@RequestBody Libro l) {
		return service.addLibro(l);
	}
}
