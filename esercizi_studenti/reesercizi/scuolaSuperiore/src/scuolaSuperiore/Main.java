package scuolaSuperiore;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		LocalDate dataDiNascita;
		String nome, cognome, luogoDiNascita;
		boolean c1 = false, c2 = false, c3 = false;

		System.out.println("inserire numero di studenti per classe");
		int dimensione = scanner.nextInt();
		Studente[] studenti = new Studente[dimensione];

		for (int i = 0; i < dimensione; i++) {
			nome = Studente.inserisci("CLASSE 1\ninserisci nome");
			cognome = Studente.inserisci("inserisci cognome");
			dataDiNascita = Studente.inserisciData("inserisci data di nascita: anno, mese, giorno");
			luogoDiNascita = Studente.inserisci("inserisci luogo di nascita");
			studenti[i] = new Studente(nome, cognome, dataDiNascita, luogoDiNascita);
			for(int j = 0; j<i;j++) {
				if(studenti[j].getDateDiNascita().getYear() == studenti[j+1].getDateDiNascita().getYear()) {
					c1 = true;
				}
			}
		}
		Classe classe1 = new Classe("5A", 2004, studenti);
		System.out.println("numero di studenti classe 1" + classe1.getStudenti().length);
		if(c1 == true) {
			System.out.println("e sono presenti studenti bocciati");
		}
		System.out.println(classe1);

		for (int i = 0; i < dimensione; i++) {
			nome = Studente.inserisci("CLASSE 2\ninserisci nome");
			cognome = Studente.inserisci("inserisci cognome");
			dataDiNascita = Studente.inserisciData("inserisci data di nascita: anno, mese, giorno");
			luogoDiNascita = Studente.inserisci("inserisci luogo di nascita");
			studenti[i] = new Studente(nome, cognome, dataDiNascita, luogoDiNascita);
			for(int j = 0; j<i;j++) {
				if(studenti[j].getDateDiNascita().getYear() == studenti[j+1].getDateDiNascita().getYear()) {
					c1 = true;
				}
			}
		}
		Classe classe2 = new Classe("3C", 2005, studenti);
		System.out.println("numero di studenti classe 2" + classe2.getStudenti().length);
		if(c2 == true) {
			System.out.println("e sono presenti studenti bocciati");
		}
		System.out.println(classe2);

		for (int i = 0; i < dimensione; i++) {
			nome = Studente.inserisci("CLASSE 3\ninserisci nome");
			cognome = Studente.inserisci("inserisci cognome");
			dataDiNascita = Studente.inserisciData("inserisci data di nascita: anno, mese, giorno");
			luogoDiNascita = Studente.inserisci("inserisci luogo di nascita");
			studenti[i] = new Studente(nome, cognome, dataDiNascita, luogoDiNascita);
			for(int j = 0; j<i;j++) {
				if(studenti[j].getDateDiNascita().getYear() == studenti[j+1].getDateDiNascita().getYear()) {
					c1 = true;
				}
			}
		}
		Classe classe3 = new Classe("1E", 2006, studenti);
		System.out.println("numero di studenti classe 3" + classe3.getStudenti().length);
		if(c3 == true) {
			System.out.println("e sono presenti studenti bocciati");
		}
		System.out.println(classe3);
	}
}