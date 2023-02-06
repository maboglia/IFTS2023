package model;

import java.time.LocalDate;

public abstract class Dipendente {

	static int contatore = 1;
	
	double pagaBase;
	
	int nMat;
	String nome;
	String cognome;
	LocalDate dataAssunzione;
	
	
	public Dipendente(String nome, String cognome) {
		this.nMat = contatore++;
		this.nome = nome;
		this.cognome = cognome;
		this.dataAssunzione = LocalDate.now();
		this.pagaBase = 5;
	}
	
	public abstract double getStipendio();

	@Override
	public String toString() {
		return "Dipendente [nMat=" + nMat + ", nome=" + nome + ", cognome=" + cognome + ", dataAssunzione="
				+ dataAssunzione + "]";
	}
	
	
	
}
