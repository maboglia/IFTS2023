package com.boglia.model;

public class Moto {

	private String marca;
	private String modello;
	private double prezzo;
	
	public Moto() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Moto(String marca, String modello, double prezzo) {
		super();
		this.marca = marca;
		this.modello = modello;
		this.prezzo = prezzo;
	}



	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModello() {
		return modello;
	}
	public void setModello(String modello) {
		this.modello = modello;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Moto [marca=");
		builder.append(marca);
		builder.append(", modello=");
		builder.append(modello);
		builder.append(", prezzo=");
		builder.append(prezzo);
		builder.append("]");
		return builder.toString();
	}
	
	
}
