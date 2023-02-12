package mediaAritmeticaIncrementale;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int altezza = 0, media = 0, contatore = 0;
		do {
			System.out.println("inserire altezza dello studente in centimetri, inserire 0 per uscire");
			altezza += scanner.nextInt();
			contatore++;
			media = altezza / contatore;
			System.out.println("media artimetica incrementale " + media);
		} while (altezza != 0);
	}

}