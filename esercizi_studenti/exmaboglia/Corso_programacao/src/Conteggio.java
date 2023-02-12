import java.util.Scanner;

public class Conteggio {

	/*
	 * Scrivere un programma Conteggio che chiede all’utente di inserire un numero
	 *  maggiore o uguale a zero e stampa uno dopo l’altro tutti i numeri da 0 al 
	 *  numero inserito compreso. Se il valore inserito dall’utente è negativo il 
	 *  programma stampa un messaggio di errore.
	 */
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Insirisci un numero maggiore o uguale a zero: ");
		int n = sc.nextInt();
		if(n>=0) {
			for(int i =0; i<=n;i++) {
				System.out.print(i + " ");
			}
			
		}else {
			System.out.println("Errore");
		}

	}

}
