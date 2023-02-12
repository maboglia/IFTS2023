import java.util.Scanner;
/*
 * Una classe di 10 studenti ha sostenuto un esame. I voti sono espressi 
 * con lettere: 'O' = ottimo (corrispondente al 10), 'B' = buono (8),
 *  'S' = sufficiente (6), 'I' = insufficiente (4). Scrivere un programma che consenta 
 *  il calcolo della media aritmetica dei voti di tale esame.
 */
public class NotaEsami {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char voto= 0;
		int votoN= 0;
		double soma = 0;
		
		double media = 0;
		
		for (int i=1; i<=10;i++) {
			
		System.out.println("Insirisci il voto:");
		voto = sc.next().charAt(0);
		switch(voto) {
		case 'O': votoN = 10;
		break;
		case 'B': votoN = 8;
		break;
		case 'S': votoN = 6;
		break;
		case 'I': votoN = 4;
		break;
		
	}soma+=votoN;
	media = soma/10;

	}System.out.println("Media = " + media);
	}
	}


