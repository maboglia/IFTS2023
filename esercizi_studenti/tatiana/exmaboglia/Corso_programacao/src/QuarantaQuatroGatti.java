
public class QuarantaQuatroGatti {
	/*
	 * Scrivere un programma per stampare 44 caratteri (inseriti da tastiera)
	 *  in fila per 6 con resto di 2.
	 */
	
	public static void main(String[] args) {
		
		
		String gatti = "Quarantaquattrogattiinfilaperseicolrestodidue";
		   gatti += "Quarantaquattrogattiinfilaperseicolrestodidue";
	//System.out.println(gatti.length());
	
	
	for (int i = 1,a=0; i <= gatti.length(); i++, a++) {
		
		
		System.out.print( gatti.charAt(i - 1) );
		
		if ( i % 6 == 0   ) System.out.println();
	}
	}
}
