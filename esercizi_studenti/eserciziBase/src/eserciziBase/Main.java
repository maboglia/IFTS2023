package eserciziBase;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("scrivi il tuo cognome");
		Scanner scanner = new Scanner(System.in);
		String cognome = scanner.nextLine();
		System.out.println("cognome: " + cognome);
		System.out.println("scrivi il tuo nome");
		String nome = scanner.nextLine();
		System.out.println("nome: " + nome);

		int base = 25;
		int altezza = 40;
		System.out.println("perimetro del rettangolo: " + (2 * (base + altezza)));

		System.out.println("inserisci n1");
		int n1 = scanner.nextInt();
		System.out.println("inserisci n2");
		int n2 = scanner.nextInt();
		System.out.println("somma: " + (n1 + n2) + " prodotto: " + (n1 * n2));

		System.out.println("inserisci n");
		int n = scanner.nextInt();
		int somma = n;
		System.out.println("inserisci n");
		n = scanner.nextInt();
		somma += n;
		System.out.println("inserisci n");
		n = scanner.nextInt();
		somma += n;
		System.out.println("inserisci n");
		n = scanner.nextInt();
		System.out.println("somma dei 4 numeri: " + (somma += n));

		System.out.println("inserisci lunghezza del raggio di un cerchio");
		int r = scanner.nextInt();
		final double PI = Math.PI;
		System.out.println("area del cerchio: " + (Math.pow(r, 2) * PI));

		System.out.println("inserisci n1");
		n1 = scanner.nextInt();
		System.out.println("inserisci n2");
		n2 = scanner.nextInt();
		System.out.println("quoziente: " + (n1 / n2) + " resto: " + (n1 % n2));

		System.out.println("inserisci n01 con la virgola");
		double n01 = scanner.nextDouble();
		System.out.println("inserisci n02 con la virgola");
		double n02 = scanner.nextDouble();
		System.out.println("somma in int: " + (int) (n01 + n02));

		System.out.println("inserisci un numero frazionario che rappresenta il tempo espresso in ore");
		double t = scanner.nextDouble();
		int m = 0;
		if (t >= 1.0) {
			m = ((int) t * 60) + (int) ((t - (int) t) * 60);
		} else if (t < 1.0) {
			m = (int) (t * 60);
		}
		System.out.println("corrispondente tempo espresso in minuti: " + m);

		System.out.println("inserire numero intero che rappresenta un tempo espresso in minuti");
		m = scanner.nextInt();
		int h = (m / 60);
		m = (m % 60);
		System.out.println("corrispondente tempo espresso in ore e minuti: " + h + " ore e " + m + " minuti");

		System.out.println("inserire n");
		n = scanner.nextInt();
		System.out.println("radice quadrata: " + Math.sqrt((double) n));
	}
}