import java.util.Scanner;

public class Asterischi {
/* 
 * Scrivere un programma Asterischi che chiede all’utente di inserire un numero intero
 *  e stampa un triangolo fatto di asterischi con un numero di righe pari al valore inserito
 *   dall’utente.
	Se l’utente inserisce un valore negativo il programma deve visualizzare un messaggio di errore.
 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Inserisci un numero intero: ");
		int n = sc.nextInt();
		if(n>0) {
			for(int i=0; i<n;i++) {
				System.out.print("*");
				for(int j=1;j<=i;j++) {
					System.out.print("*");
				}System.out.println();
			}
		}

	}

}
