
import java.util.Arrays;
import java.util.Scanner;

/*
 * Scrivere un programma RubricaTelefonica che chiede all’utente di inserire 5 nomi
 *  e numeri di telefono e li ristampa in ordine alfabetico sul nome.
 * Note: usare due array distinti per memorizzare i nomi e i numeri di telefono; attenzione
 *  al problema (commentato a lezione) dei caratteri che mandano a capo il testo nell’uso di Scanner.
 */
public class RubricaTelefonica {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		String[] nome = new String[5];
		int[] numTel = new int[5];
		
		for(int i=0;i<5;i++) {
			System.out.print("Nome " + (i+1) +":");
			nome[i]= sc.nextLine();
			System.out.print("Telefono " + (i+1) +":");
			numTel[i]= sc.nextInt();
			sc.nextLine();
		}	
		for(int i=0;i<5;i++) {
			Arrays.sort(nome);
		System.out.println(nome[i] + " - telefono: "+ numTel[i]);
		}
		sc.close();
			}
}