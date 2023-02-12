package Stage080223;

import java.util.Scanner;

/*
 * Scrivere un programma che calcoli il risultato dell’esame di uno studente. 
 * Il programma prenderà in ingresso: Il voto ottenuto nella prova scritta (variabile tra -8 e +8) 
 * Il voto ottenuto nella prova pratica (variabile tra 0 e 24)

   Memorizzati questi dati procederà al calcolo del risultato finale in trentesimi come segue:

	Il risultato finale è la somma dei risultati.
	se il voto di teoria è minore (o uguale) di zero e la somma dei voti di teoria e pratica è 
	maggiore di 18 lo studente è bocciato.
	se il voto di teoria è minore (o uguale) di zero e il voto di pratica è minore di 18 il 
	programmalo studente è bocciato.
	se il voto di teoria è maggiore di zero e la somma dei voti di teoria e pratica è minore di 
	18lo studente è bocciato.
	se la somma di teoria e pratica vale 31 o 32 il programma stampa: "congratulazioni: 30 e lode"
	in tutti gli altri casi lo studente è promosso e viene riportato il voto calcolato.

 */


public class CalcolaVotoEsame {
	
	
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	double votoTeoria;
	double votoPratica;
	double somma = 0;
	
	System.out.print("VotoTeoria (-8 a +8) = ");
	votoTeoria = sc.nextDouble();
	System.out.print("VotoPratica (0 a 24)  = ");
	votoPratica = sc.nextDouble();
	somma = votoTeoria + votoPratica;
	
	if(somma>=31) {
		System.out.println("congratulazioni: 30 e lode");
	if(votoTeoria <=0 || somma <18) {
		System.out.println("bocciato");
		}
	}else { System.out.println("Promosso - voto Finale = " + somma);
	
	}
}
}

	


