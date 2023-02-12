package Stage080223;

import java.util.Scanner;

/*
 * Scrivere un programma Concatena che chiede all'utente di inserire tre singole parole 
 * e le ristampa interponendovi un asterisco.
 * Per esempio, se l'utente inserisce "gatto", "cane" e "topo" il programma stamperà 
 * gatto*cane*topo.
 * Per concatenare le tre parole si utilizzi un metodo ausiliario che prende due 
 * stringhe e restituisce la stringa ottenuta concatenando la prima parola ricevuta, 
 * un asterisco e la seconda parola ricevuta.
 */
public class ConcatenaString {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digita tre parole: ");
		String par1 = sc.nextLine();
		String par2 = sc.nextLine();
		String par3 = sc.nextLine();
		concatena(par1, par2, par3);
		
	}
		
	public static void concatena(String par1, String par2, String par3) {
		
		System.out.println(par1 + "*" + par2 +"*" + par3);
	}
		
	}


