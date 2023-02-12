package Stage080223;

public class GrandiNumeri {

	public static void main(String[] args) {
		
		
		int conta0 = 0;
		int conta1 = 0;
		
		int []vect = new int[100];
		for(int i = 0; i<100;i++) {
			double random = Math.random()*2;
			int num = (int)random;
			vect[i]= num;
			if(num == 0) {
				conta0++;
			}else {conta1++;}
			}
	
	for(int i = 0; i<100;i++) {
		System.out.print(vect[i]+" ");
	}
		System.out.println();
		System.out.println("Quantita do 0 = " + conta0);
		System.out.println("Quantita do 1 = " + conta1);
	}
	}

	
