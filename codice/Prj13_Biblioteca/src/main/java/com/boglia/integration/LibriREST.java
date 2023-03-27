package com.boglia.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boglia.entities.Libro;
import com.boglia.services.LibroService;

@RestController
@RequestMapping("api")
public class LibriREST {

	@Autowired
	private LibroService service;
	
	
	@GetMapping("libri")
	public List<Libro> getLibri(){
		return service.dammiTuttiILibri();
	}
	
}
