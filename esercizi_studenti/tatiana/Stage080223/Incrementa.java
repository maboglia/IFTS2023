package Stage080223;

import java.util.Locale;
import java.util.Scanner;

public class Incrementa {
	
	/*
	 * Scrivere un programma Incrementa contenente un metodo ausiliario che
	 *  incrementi il valore di una variabile.
	 */
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Locale.setDefault(Locale.US);
	
	int variabile = 2;
	incrementare(variabile);
	
}

	public static void incrementare(int variabile) {
		variabile = variabile +1;
		System.out.println(variabile);
		
	}
		
		
		
		
	
}
