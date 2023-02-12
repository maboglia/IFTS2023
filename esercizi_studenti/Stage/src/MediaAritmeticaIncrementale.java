
import java.util.Scanner;

public class MediaAritmeticaIncrementale {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double altezza;
		double soma =0;
		int contatore=0;
		double media;
	
		do {
			System.out.print("Inserisci l'altezza in cm oppure 0 per uscire: ");
			altezza = sc.nextDouble();
			if(altezza >0) {
			soma = soma + altezza;
			contatore++;
			media = soma/contatore;
			System.out.println("Media Aritmetica Incremental = " + media);					
			}	
		}while (altezza!=0);
		System.out.println("Fine");
	}
}


