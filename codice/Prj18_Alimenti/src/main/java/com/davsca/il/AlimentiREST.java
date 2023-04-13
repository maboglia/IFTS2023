package com.davsca.il;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.davsca.entities.Alimento;
import com.davsca.services.AlimentoService;

@RestController
@RequestMapping("api")
public class AlimentiREST {
	@Autowired
	private AlimentoService service;
	
	@GetMapping("categorie")
	List<String>getCategorie(){
		return service.getCategorie();
	}
	
	@GetMapping
	List<Alimento> getAlimenti(){
		return service.getAlimenti();
	}
	
	@GetMapping("alimenti/{categoria}")
	List<Alimento> getAlimentiByCategoria(@PathVariable String categoria){
		return service.getAlimentiByCategoria(categoria);
	}
}
