package com.boglia.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boglia.entities.Libro;

public interface LibroDAO extends JpaRepository<Libro, Integer> {

}
