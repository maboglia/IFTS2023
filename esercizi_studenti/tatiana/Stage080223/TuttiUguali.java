package Stage080223;

import java.util.Scanner;

public class TuttiUguali {
	public static void main(String[] args) {
		
		confrontare();
	}

	public static void confrontare() {
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		int num3;
		System.out.println("Inserisci tre numeri interi: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		if(num1 == num2 && num2 == num3) {
			System.out.println("Tutti uguali!!!");
		}else {
			System.out.println("Almeno uno e' diverso! ");
		}
		
	}

	}


