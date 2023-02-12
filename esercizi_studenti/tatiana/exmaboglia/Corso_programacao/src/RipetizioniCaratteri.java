import java.util.Scanner;
/*
 * Scrivere un programma Ripetizioni che chiede all’utente di inserire una sequenza di
 *  caratteri (chiedendo prima quanti caratteri voglia inserire) e li ristampa man mano
 *   che vengono inseriti. L’intero procedimento (chiedere quanti caratteri voglia inserire,
 *    leggere i caratteri e man mano stamparli) dovrà essere ripetuto 5 volte.
 */
public class RipetizioniCaratteri {
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	
		for(int i = 1; i<=5;i++) {
			
		System.out.print("Quanti caratteri inserirai? ");
		int n = scan.nextInt();
		for(int j = 1; j<=n;j++) {
		System.out.printf("Carattere %d# ", j);
		char carac = scan.next().charAt(0);
		System.out.println("Hai inserito: " + carac);
	
	}

		} System.out.println("Fim");
	}
}
