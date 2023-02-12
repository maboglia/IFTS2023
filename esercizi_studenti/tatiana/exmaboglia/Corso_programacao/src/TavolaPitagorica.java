
public class TavolaPitagorica {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
		    for (int j = 1; j <= 10; j++) {
			int prodotto = i*j;
			// se il prodotto e' di una sola cifra, lascio tre 
			// spazi bianchi prima del prodotto:
			if (prodotto < 10) 
			    System.out.print("   "); 
			// se il prodotto e' di due cifre, lascio 2 spazi bianchi:
			else if (prodotto < 100) 
			    System.out.print("  ");
			// altrimenti lascio un solo spazio bianco:
			else
			    System.out.print(" ");
			// scrivo infine il prodotto:
			System.out.print(i*j); 
		    }
		    System.out.println();
		}


	    } // fine metodo main

} // fine classe Tabella
	


