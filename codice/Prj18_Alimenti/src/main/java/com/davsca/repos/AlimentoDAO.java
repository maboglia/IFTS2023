package com.davsca.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.davsca.entities.Alimento;


public interface AlimentoDAO extends JpaRepository<Alimento, Integer> {
	List<Alimento> findByCategoria(String categoria);
}
