package centroDiFormazione;

public class Main {

	public static void main(String[] args) {
		int[] anniDiNascita = new int[100];
		int studente = 0, contatore = 0;
		for (int i = 0; i < anniDiNascita.length; i++) {
			anniDiNascita[i] = (int) (Math.random() * (2009 - 2005 + 1) + 2005);
		}
		for (int i = 0; i < anniDiNascita.length; i++) {
			System.out.print(anniDiNascita[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < anniDiNascita.length; i++) {
			for (int j = i + 1; j < anniDiNascita.length; j++) {
				if (anniDiNascita[i] > anniDiNascita[j]) {
					int temp = anniDiNascita[i];
					anniDiNascita[i] = anniDiNascita[j];
					anniDiNascita[j] = temp;
				}
			}
		}
		int i, j;
		for (i = 0; i < anniDiNascita.length; i++) {
			for (j = i + 1; j < anniDiNascita.length; j++) {
				if (anniDiNascita[i] == anniDiNascita[j]) {
					studente++;
				}
				if (anniDiNascita[i] != anniDiNascita[j]) {
					i = j - 1;
					break;
				}
				if (j == anniDiNascita.length - 1) {
					i = anniDiNascita.length - 1;
				}
			}
			studente++;
			if (studente > 16) {
				contatore += (studente / 16) + 1;
			} else if (contatore <= 16) {
				contatore += 1;
			}
			studente = 0;
		}
		System.out.println("numero di classi che si possono formare " + contatore);
	}
}