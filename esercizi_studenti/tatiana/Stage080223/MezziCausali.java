package Stage080223;

public class MezziCausali {
	
	public static void main(String[] args) {
		
		
		generareNumero();
		
	}

	public static void generareNumero() {
		
		double numero = Math.random();
		if(numero<0.5) {
			System.out.println(numero);
		}else {
			double risultato = numero -0.5;
			System.out.println(risultato);
		}
		
	}
	
	
}
