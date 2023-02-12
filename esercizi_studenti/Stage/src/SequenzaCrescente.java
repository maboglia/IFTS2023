

public class SequenzaCrescente {

	/*
	 * Scrivere un metodo boolean crescente(int[ ] a) che verifica se a è ordinato in modo crescente
	- un array è ordinato in modo crescente se per ogni indice k, l’elemento di indice k è maggiore di 
		tutti gli elementi di indice minore di k 
	- è sufficiente verificare se ogni elemento è minore dell’elemento che lo segue immediatamente
	- intuitivamente, bisogna confrontare ciascun elemento di indice i dell’array con l’elemento che 
		lo segue immediatamente, quello di indice i+1
	- attenzione – l’ultimo elemento di un array non ha un elemento che lo segue immediatamente
	 */
	public static boolean Crescente(int[]a) {
				
		boolean crescente = true;
		
		for(int i=0; crescente && i< a.length-1;i++) {
			if(a[i]>=a[i+1]) 
			crescente = false;	
		}
		return crescente;
		
	}
	public static void main(String[] args) {
		
		int[]C = {1,2,5,7};
		System.out.println(Crescente (C));
		
		int[]D = {1, 2, 5, 5, 7};
		System.out.println(Crescente (D));
		
		int[]F = {1, 2, 5, 3, 7};
		System.out.println(Crescente (F));
		
	}

}
