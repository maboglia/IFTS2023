package Stage080223;
import java.util.Scanner;

public class CartaForbiciSassoAlex {
	

	  public static void main(String[] args) throws Exception {
	/*
	  * Scrivere un programma che chieda agli utenti due stringhe in ingresso, le stringhe possono
	  * valere solo: "carta", "forbici" o "sasso".
	  * Il programma dovrà quindi effettuare i dovuti controlli e dichiarare il vincitore secondo le regole:
	  * forbici vince su carta,
	  * carta vince su sasso,
	  * sasso vince su forbici.
	 */

	        Scanner string = new Scanner(System.in);

	        System.out.println("Inserire la loro scelta: forbice - carta - sasso: ");

	        System.out.println("Scelta primo giocatore");

	        String item = string.nextLine();

	        System.out.println("Scelta secondo giocatore");

	        String item2 = string.nextLine();
	        
	        System.out.println();

	        if (item.equals(item2)){

	            System.out.println("Pareggio riprovare");
	        }
	        else if (
	            
	            (item.equals("forbice") & item2.equals("carta"))||
	            (item.equals("carta") & item2.equals("sasso"))||
	            (item.equals("sasso") & item2.equals("forbice"))){

	            System.out.println("Ha vinto il primo giocatore");
	        
	        }
	        else if(

	            (item2.equals("forbice") & item.equals("carta"))||
	            (item2.equals("carta") & item.equals("sasso"))||
	            (item2.equals("sasso") & item.equals("forbice"))){

	            System.out.println("Ha vinto il secondo giocatore");
	        }else {

	            System.out.println("Scelta non valida riprova");
	        }
	    }
	}

