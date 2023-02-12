import java.util.Scanner;

public class IndovinaZero {
	/*
	 * Scrivere un programma IndovinaZero che chiede all’utente di 
	 * inserire numeri interi uno dopo l’altro fino a quando non inserisce il numero 0
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Inserisce un numero intero: ");
		int n = sc.nextInt();
		do {
			System.out.print("Inserisce un numero intero: ");
			n = sc.nextInt();
		
		}while(n!=0);
			System.out.println("Hai indovinato!!");
		}

}
