

public class CoppiaElementiUguali {
	/*
	 * Scrivere un metodo boolean coppiaUguali(int[ ] a) che verifica se a contiene almeno una
	  coppia di elementi uguali
	 * bisogna confrontare ciascun elemento X dell’array con ogni altro elemento Y dell’array
	  dove X e Y sono elementi diversi, nel senso che hanno indici diversi
	 * bisogna confrontare ciascun elemento di indice i dell’array con ogni altro elemento di 
	  indice j dell’array - dove i e j hanno valore diverso quindi è necessario utilizzare due 
	  variabili indice per accedere agli elementi di uno stesso array
	 */

	
	public static boolean coppiaUguali(int[]a) {
		
		for(int i=0; i<a.length;i++) {
			for(int j=i+1; j<a.length;j++) {
				if( a[i]==(a[j]))
				{return true;}
			}
		}
		return false;
	}
	public static void main(String[] args) {
		
		int[] C = {1, 4, 5, 8,9};
		System.out.println(coppiaUguali(C));
		
		int[] D = {1, 4, 5, 8,10};
		System.out.println(coppiaUguali(D));
		
		int[] E = {1, 4, 5, 8,1};
		System.out.println(coppiaUguali(E));
		
		
	}
	}

