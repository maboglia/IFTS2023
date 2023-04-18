package com.boglia.presentation;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("")
public class ControllerMVC {

	//collegare il service
	
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
		
		return "lista";
	}
	
	@GetMapping(value = {"prenota/{id}", "acquista/{id}"})
	public String prenota(@PathVariable int id,Model m) {
		
		m.addAttribute("titolo", "Informazioni sul viaggio e prenotazione");
		
		return "prenota";
	}

	@GetMapping(value = {"conferma/{id}"})
	public String conferma(@PathVariable int id,Model m) {
		
		m.addAttribute("titolo", "Conferma della prenotazione");		
		
		return "conferma";
	}

	@GetMapping(value = {"prenotazioni"})
	public String prenotazioni(Model m) {
		
		m.addAttribute("titolo", "Elenco delle prenotazioni");
		
		return "prenotazioni";
	}

	@PostMapping("login")
	public String doLogin(@RequestParam(name = "username") String username,
			@RequestParam(name = "password") String password, HttpSession session ) {
		
		System.out.println(username);
		System.out.println(password);
		
		if (username.equals("mauro") && password.equals("12345") ) {
			session.setAttribute("loggato", "mauro");
		}
			
		
		return "redirect:/";
		
	}
}
