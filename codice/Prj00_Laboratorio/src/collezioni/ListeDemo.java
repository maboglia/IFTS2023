package collezioni;

import java.util.ArrayList;

public class ListeDemo {

	public static void main(String[] args) {
		
		ArrayList<String> parole = new ArrayList<>(); 
		
		parole.add("pippo");
		parole.add("pippo");
		parole.add("pippo");
		parole.add("pippo");
		
		System.out.println(parole.size());
		
		for (String string : parole) {
			System.out.println(string.toUpperCase());
		}
		
		
	}

}
