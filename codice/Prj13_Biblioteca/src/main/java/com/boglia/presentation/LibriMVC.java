package com.boglia.presentation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boglia.entities.Libro;
import com.boglia.services.LibroService;

@Controller
@RequestMapping("")
public class LibriMVC {

	@Autowired
	private LibroService service;
	
	
	@GetMapping("libri")
	public String getLibri(Model m){
		
		m.addAttribute("elencoLibri", service.dammiTuttiILibri());

		return "vistaLibri";
	}
	
}
