package com.boglia.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boglia.entities.Prenotazione;

public interface PrenotazioneDAO extends JpaRepository<Prenotazione, Integer> {

}
