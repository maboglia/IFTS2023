package com.boglia.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "libri")
public class Libro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int	id; 
	
	private String titolo;
	private double prezzo ;
	private int pagine ;
	private int editoreId;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	public int getPagine() {
		return pagine;
	}
	public void setPagine(int pagine) {
		this.pagine = pagine;
	}
	public int getEditoreId() {
		return editoreId;
	}
	public void setEditoreId(int editoreId) {
		this.editoreId = editoreId;
	}
	
	
	
}
