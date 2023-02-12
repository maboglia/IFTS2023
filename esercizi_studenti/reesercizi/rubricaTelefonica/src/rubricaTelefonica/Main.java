package rubricaTelefonica;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String numeri[] = new String[5];
		String nomi[] = new String[5];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.println("inserire il numero di telefono");
			numeri[i] = scanner.nextLine();
			System.out.println("inserire il nome del contatto");
			nomi[i] = scanner.nextLine();
		}
		for (int i = 0; i < nomi.length; i++) {
			for (int j = i + 1; j < nomi.length; j++) {
				if ((nomi[i].compareTo(nomi[j])) > 0) {
					String temp = nomi[i];
					nomi[i] = nomi[j];
					nomi[j] = temp;
				}
			}
		}
		for (int i = 0; i < 5; i++) {
			System.out.println(nomi[i] + numeri[i]);
		}
	}
}