package com.boglia.services;

import java.util.List;

import com.boglia.entities.Prenotazione;
import com.boglia.entities.Tratta;

public interface ViaggiService {

	Prenotazione addPrenotazione(Prenotazione p);
	
	List<Prenotazione> getPrenotazioni();
	List<Tratta> getTratte();
	
	Prenotazione getPrenotazioneById(int id);
	Tratta getTrattaById(int id);
	
}
