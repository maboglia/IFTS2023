package com.boglia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boglia.entities.Prenotazione;
import com.boglia.entities.Tratta;
import com.boglia.repos.PrenotazioneDAO;
import com.boglia.repos.TrattaDAO;

@Service
public class ViaggiServiceImpl implements ViaggiService {

	@Autowired 
	private PrenotazioneDAO daoPrenotaz;
	
	@Autowired
	private TrattaDAO daoTratta;
	
	
	@Override
	public Prenotazione addPrenotazione(Prenotazione p) {
		return daoPrenotaz.save(p);
	}

	@Override
	public List<Prenotazione> getPrenotazioni() {
		return daoPrenotaz.findAll();
	}

	@Override
	public List<Tratta> getTratte() {
		return daoTratta.findAll();
	}

	@Override
	public Prenotazione getPrenotazioneById(int id) {
		return daoPrenotaz.getReferenceById(id);
	}

	@Override
	public Tratta getTrattaById(int id) {
		return daoTratta.getReferenceById(id);
	}

}
