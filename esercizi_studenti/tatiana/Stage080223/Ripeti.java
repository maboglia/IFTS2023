package Stage080223;

import java.util.Scanner;

public class Ripeti {
	/*
	 * Scrivere un programma Ripeti che chiede all’utente di inserire una stringa
	 *  e un numero intero positivo.
	 * Entrambe gli elementi dovranno essere passati a un metodo ausiliario che stamperà 
	 * tante copie della stringa quante indicate nel numero inserito dall’utente.
	 * Se il numero inserito dall'utente è negativo il metodo ausiliario stamperà 
	 * "ERRORE: numero negativo".
	 * Il nome del metodo ausiliario può essere scelto a piacere.
	 */
	public static void main(String[] args) {
	

		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.print("Insirisci una parola/frase: ");
		String parola = sc.nextLine();
		System.out.print("Insirisci un numero intero: ");
		int numero = sc.nextInt();
		ripetere(parola,numero);
		
	}
		public static void ripetere (String parola, int numero) {
		if(numero >0) {
			for(int i=0; i<numero;i++) {
				System.out.print(parola + " ");
			}
		}
		else {System.out.println("Errore: numero negativo");
		}
		}
	}

	



