package view;

import model.Dado;

public class Gioco1 {

	public static void main(String[] args) {

		Dado d1 = new Dado();
		Dado d2 = new Dado();

		final int NUM_LANCI = 100_000_000;
		int vittorie = 0;
		
		long start = System.currentTimeMillis();
		for (int i = 0; i < NUM_LANCI; i++) {
			int r1 = d1.lancia();
//			System.out.println("Dado 1: " + r1);

			int r2 = d2.lancia();
//			System.out.println("Dado 2: " + r2);

			if (r1 == r2) {
				//System.out.println("Hai vinto");
				vittorie++;
			}

		}
		long stop = System.currentTimeMillis();
		System.out.println("Numero di vittorie " + vittorie);
		System.out.println("La percentuale " + ((double)vittorie/NUM_LANCI));
		System.out.println("L'elaborazione è durata " + (stop-start)+"ms");

	}

}
