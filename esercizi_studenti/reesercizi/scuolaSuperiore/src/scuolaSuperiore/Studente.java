package scuolaSuperiore;

import java.time.LocalDate;
import java.util.Scanner;

public class Studente extends Classe {
	private String nome;
	private String cognome;
	private LocalDate dateDiNascita;
	private String luogoDiNascita;

	public Studente() {
		super();
	}

	public Studente(String nome, String cognome, LocalDate dateDiNascita, String luogoDiNascita) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.dateDiNascita = dateDiNascita;
		this.luogoDiNascita = luogoDiNascita;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public LocalDate getDateDiNascita() {
		return dateDiNascita;
	}

	public void setDateDiNascita(LocalDate dateDiNascita) {
		this.dateDiNascita = dateDiNascita;
	}

	public String getLuogoDiNascita() {
		return luogoDiNascita;
	}

	public void setLuogoDiNascita(String luogoDiNascita) {
		this.luogoDiNascita = luogoDiNascita;
	}

	public static String inserisci(String s) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(s);
		s = scanner.nextLine();
		return s;
	}
	public static LocalDate inserisciData(String s) {
		System.out.println(s);
		Scanner scanner = new Scanner(System.in);
		int anno = scanner.nextInt();
		int mese = scanner.nextInt();
		int giorno = scanner.nextInt();
		LocalDate dataDiNascita = LocalDate.of(anno, mese, giorno);
		return dataDiNascita;
	}
	@Override
	public String toString() {
		return "Studente [nome=" + nome + ", cognome=" + cognome + ", dateDiNascita=" + dateDiNascita
				+ ", luogoDiNascita=" + luogoDiNascita + "]";
	}

}