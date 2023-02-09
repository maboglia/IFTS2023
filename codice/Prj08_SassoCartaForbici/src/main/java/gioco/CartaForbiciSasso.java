package gioco;

import java.util.Scanner;

public class CartaForbiciSasso {

	public static void main(String[] args) {

		String sceltaUmano = chiediUmano();
		String sceltaPc = chiediPc();
		String result = valuta(sceltaUmano, sceltaPc);
		System.out.println("Umano : " + sceltaUmano);
		System.out.println("Pc: " + sceltaPc);
		System.out.println("Hai vinto: " + result);

	}

	public static String valuta(String sceltaUmano, String sceltaPc) {
		String result = null;
		if (sceltaUmano.equalsIgnoreCase(sceltaPc)) {
			result = "pareggio";
		} else {
			if (sceltaUmano.equalsIgnoreCase("forbici")  ) {
				if (sceltaPc.equalsIgnoreCase("carta"))
				result = "umano";
				else {result = "Pc";}
				
			} 
			else if (sceltaUmano.equalsIgnoreCase("carta")  ) {
				
				if (sceltaPc.equalsIgnoreCase("sasso")) {
					result = "umano";
				}else {result = "Pc";}
			} 
			if (sceltaUmano.equalsIgnoreCase("sasso") ){
				if(sceltaPc.equalsIgnoreCase("forbici"))
				result = "umano";
				else {result = "Pc";}
			} 

		}
		return result;
	}

	public static String chiediPc() {
		double casuale = Math.random();
		if (casuale < 0.33) {
			return "carta";

		} else if (casuale < 0.66) {
			return "forbici";
		}

		return "sasso";
	}

	private static String chiediUmano() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Quale scelta vuoi fare tra Sasso carta forbici? ");

		return scanner.next();
	}

}
