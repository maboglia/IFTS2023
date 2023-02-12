import java.util.Scanner;

public class TuttiPositiviPari {
	/*
	 * Scrivere un programma TuttiPositiviPari che chiede all’utente di inserire
	 *  una sequenza di interi (chiedendo prima quanti numeri voglia inserire) e 
	 *  poi, al termine dell’inserimento dell’intera sequenza, stampa "Tutti positivi 
	 *  e pari" se i numeri inseriti sono tutti positivi e pari, altrimenti stampa "NO".
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		 System.out.print("Quanti interi vuoi inserire: ");
		 int n = sc.nextInt();
		 
		 boolean tuttipospari = true;
		 
		 for(int i = 0; i<n; i++) {
			 System.out.print("Insirisci il un numero: ");
			 int x = sc.nextInt();	 
			 if(x<0 || x%2!=0) tuttipospari = false;
		 }
		 if(tuttipospari)System.out.println("Tutti positivi e pari");
		 else System.out.println("Non sono tutti pari e positivi");
			 
		 
		 
		
		
	}
		 
	}





