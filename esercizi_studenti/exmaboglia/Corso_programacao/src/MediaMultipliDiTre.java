import java.util.Scanner;
/*
 * Scrivere un programma MediaMultipliDiTre che chiede all’utente di inserire
 *  una sequenza di interi (chiedendo prima quanti numeri voglia inserire) e 
 *  poi stampa la media di tutti i numeri inseriti che siano divisibili per tre. 
 *  Per esempio, se si immettono i valori 5, 8, 9, 12, 7, 6 ,1 il risultato stampato dovrà essere 9.
 */

public class MediaMultipliDiTre {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = 0;
		int cont = 0;
		
		System.out.print("Quanti numeri vuoi inserisci: ");
		int n = sc.nextInt();
		for(int i = 1; i<=n;i++) {
			System.out.printf("Inserisci il %d#  numero: ", i);
			x = sc.nextInt();
			if(x%3==0) {
				x+= x;
				cont++;
				
			}
		}System.out.println("Media Multipli e " + x/cont);
		
		
	}

}
