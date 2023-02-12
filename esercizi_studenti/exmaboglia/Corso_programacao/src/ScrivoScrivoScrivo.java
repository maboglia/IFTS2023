import java.util.Scanner;

public class ScrivoScrivoScrivo {
	
	/*
	 * Scrivere un programma ScrivoScrivoScrivo che chiede all’utente di inserire
	 *  un numero maggiore o uguale a zero e un messaggio, quindi stampa il messaggio
	 *   ciclando un numero di volte pari al numero inserito dall’utente.
		Se il valore inserito dall’utente è negativo il programma stampa un messaggio di errore.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insirisci un numero intero maggiore o uguale a zero: ");
		int n = sc.nextInt();
		System.out.print("Insirisci un mensaggio: ");
		sc.nextLine();
		String msg = sc.nextLine();
		if(n>=0) {
			for(int i = 0; i<n;i++) {
			System.out.println(msg);}
		
		}else {
		System.out.println("Errore - valore ivalido");
	}
	}
}

