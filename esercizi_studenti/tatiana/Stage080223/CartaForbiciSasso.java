package Stage080223;

import java.util.Scanner;
/*
 * Scrivere un programma che chieda agli utenti due stringhe in ingresso, le stringhe possono 
 * valere solo: "carta", "forbici" o "sasso".

Il programma dovrà quindi effettuare i dovuti controlli e dichiarare il vincitore secondo le regole:

forbici vince su carta,
carta vince su sasso,
sasso vince su forbici.
 */

public class CartaForbiciSasso {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// us1(2) - us2(1) = 1 --- vence us1
		// us1(1) - us2(3) = -2 --- vence us1
		// us1(3) - us2(2) = 1 -- vence us1
		// us1(2) - us2(3) = -1 -- vence us2
		// us1(1) - us2(2) = -1 -- vence us2
		// us1(3) - us2(1) = 2 --- vence us2
		
		System.out.println("Inserisce 1 - carta, 2 - forbici o 3 - sasso:");
		
		int user1 = sc.nextInt();
		int user2 = sc.nextInt();
		int result = user1 - user2;
		
		switch(result) {
		case 1 : System.out.println("User 1 win");
		break;
		case -2: System.out.println("User 1 win");
		break;
		case -1 : System.out.println("User 2 win");
		break;
		case 2: System.out.println("User 2 win");
		break;
		case 0: System.out.println("Cravatta");
		break;
		

			}
	}
		
}





