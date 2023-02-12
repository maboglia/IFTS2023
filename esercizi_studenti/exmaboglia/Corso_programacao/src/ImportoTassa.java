import java.util.Locale;
import java.util.Scanner;

public class ImportoTassa {
	/*
	 * Scrivere una funzione per calcolare l’importo di una tassa secondo la seguente tabella:
	Fino a 10.000 €, l’importo della tassa è del 10%
	Fino a 20.000 €, l’importo della tassa è del 10% per i primi 10.000 €, del 7 % sul restante.
	Fino a 30.000 €, l’importo è ancora del 10% per i primi 10.000 €, poi del 7% fino a 20.000 ed infine il 5% sul restante.
	Oltre i 30.000 € ci si comporta come prima, aggiungendo un ulteriore 3% è sulla porzione oltre i 30.000 €.
	Per ogni importo non valido si ritorni -1 (qualunque importo che non sia un numero reale e positivo).
	Esempi: Un importo di 10, dovrebbe tornare 1 (1 è il 10% di 10)
	Un importo di 21, dovrebbe tornare 1.75 (10% di 10 + 7% di 10 + 5% di 1)
	 */
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double tassa = 0;
		
		System.out.println("Inserisci il valore dell'importo: ");
		double importo = sc.nextInt();
		if(importo<=10000) {
			tassa = importo*0.1;
		}if(importo>10000 && importo<=20000) {
			tassa = (10000*0.1)+(importo-10000)*0.07;
		}if(importo>20000&&importo<=30000) {
			tassa = (10000*0.1)+(importo-10000)*0.07+(importo-20000)*0.05;
		}if(importo>30000) {
			tassa = (10000*0.1)+(importo-10000)*0.07+(importo-20000)*0.05+(importo-30000)*0.03;
		}
		System.out.println(tassa);
	}

}
