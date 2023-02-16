package database;

import java.util.ArrayList;

import model.Teatro;

public class DBTeatri {

	private static ArrayList<Teatro> teatri = new ArrayList<>();

	public static ArrayList<Teatro> getTeatri() {
		if (teatri.isEmpty()) {
			init();
		}

		return teatri;
	}

	public static void init() {

		String[] elenco = { "Pala Alpitour", "Auditorium del Lingotto G. Agnelli", "Colosseo", "Regio", "Alfieri",
				"Reggia di Venaria", "Nuovo (Sala Grande)", "Auditorium Officina H", "Grande Valdocco",
				"Della Concordia", "Carignano", "Sociale", "Giacosa", "Gioiello", "Vecchio Mercato", };

		for (int i = 0; i < elenco.length; i++) {

			int id = i + 1;
			String nome = elenco[i];
			int numPosti = 5;

			Teatro t = new Teatro(id, nome, numPosti);
			teatri.add(t);// ho aggiunto il teatro t alla collezione

		}

	}

}
