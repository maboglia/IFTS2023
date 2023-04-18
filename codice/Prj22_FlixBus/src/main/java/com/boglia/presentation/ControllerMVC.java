package com.boglia.presentation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.boglia.entities.Prenotazione;
import com.boglia.services.ViaggiService;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("")
public class ControllerMVC {

	@Autowired
	private ViaggiService service;
	
	
	@GetMapping(value = {"index", "login", "/"})
	public String home(Model m, HttpSession session  ) {

		if (session.getAttribute("loggato")!=null) {
			System.out.println("Utente loggato");
		} else {
			m.addAttribute("titolo", "Pagina di login");
			return "login";
		}
		
		return "redirect:lista";
	}
	
	@GetMapping(value = {"lista", "elenco"})
	public String lista(Model m) {
		
		m.addAttribute("titolo", "Elenco delle tratte disponibili");
		
		m.addAttribute("tratte", service.getTratte());
		
		return "lista";
	}
	
	@GetMapping(value = {"prenota/{id}", "acquista/{id}"})
	public String prenota(@PathVariable int id,Model m) {
		
		m.addAttribute("titolo", "Informazioni sul viaggio e prenotazione");
		
		m.addAttribute("viaggio", service.getTrattaById(id));
		
		return "prenota";
	}

	@GetMapping(value = {"conferma/{id}"})
	public String conferma(@PathVariable int id,Model m) {
		
		m.addAttribute("titolo", "Conferma della prenotazione");
		
		m.addAttribute("dati", service.getPrenotazioneById(id));
		
		return "conferma";
	}

	@GetMapping(value = {"prenotazioni"})
	public String prenotazioni(Model m) {
		
		m.addAttribute("titolo", "Elenco delle prenotazioni");
		
		m.addAttribute("elenco", service.getPrenotazioni());
		
		return "prenotazioni";
	}

	@PostMapping("login")
	public String doLogin(@RequestParam(name = "username") String username,
			@RequestParam(name = "password") String password, HttpSession session ) {
		
//		System.out.println(username);
//		System.out.println(password);
		
		if (username.equals("mauro") && password.equals("12345") ) {
			session.setAttribute("loggato", "mauro");
		}
			
		
		return "redirect:/";
		
	}
	
	
	@PostMapping("conferma")
	public String doConferma(Prenotazione p) {
		System.out.println("metodo prenotazione confermata");
		Prenotazione prenotazione=null;
		if (p != null) {
			prenotazione = service.addPrenotazione(p);
		}
		
		return "redirect:conferma/"+prenotazione.getId();
	}
	
}
