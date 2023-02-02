package test;

import java.util.ArrayList;

import model.Dipendente;
import model.Dirigente;
import model.Fattorino;
import model.Impiegato;

public class DipendentiTest {

	public static void main(String[] args) {
		
		ArrayList<Dipendente> dipendenti = new ArrayList<>();
		
		dipendenti.add(new Fattorino("pippo", "pippo"));
		dipendenti.add(new Impiegato("pippa", "pippa"));
		dipendenti.add(new Dirigente("pippu", "pippu"));
		
		for (Dipendente d : dipendenti) {
			System.out.println(d);
		}
		
		
		
		
		

	}

}
