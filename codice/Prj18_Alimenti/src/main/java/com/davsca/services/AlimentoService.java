package com.davsca.services;

import java.util.List;

import com.davsca.entities.Alimento;

public interface AlimentoService {
	List<Alimento>getAlimenti();
	List<String>getCategorie();
	List<Alimento>getAlimentiByCategoria(String categoria);
}
