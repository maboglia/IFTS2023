import java.util.Scanner;

public class MediaNumeri {
	/*
	 * Scrivere un programma MediaNumeri che chiede all’utente di inserire una sequenza
	 *  di numeri interi positivi. Non appena l’utente inserisce un numero negativo il 
	 *  programma si arresta e visualizza la media aritmetica dei valori positivi inseriti.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int contan=0;
		int soma =0;
		System.out.println("Inserisci la sequenza de numeri interi positivi:  ");
			do {
				n=sc.nextInt();
				if(n>0) {
				contan++;
				soma+=n;}
				
			}while(n>=0);
			
				System.out.println("Soma = " + soma);
				System.out.println("Quntidade = " + contan);
				System.out.println("Media Aritmetica = " + soma/contan);
				
	}
}
		




