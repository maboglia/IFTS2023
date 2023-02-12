package Stage080223;

import java.util.Scanner;

public class OrdinamentoSelezione {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] mioArray = new int[10];
		for(int i =0; i<10; i++) {
			System.out.print("Insira il numero: " );
			mioArray[i]=sc.nextInt();
		}
		for(int i =0; i<9; i++) {
			for(int j=i; j<10; j++) {
				if(mioArray[i]>mioArray[j]) {
					int temp = mioArray[i];
					mioArray[i]= mioArray[j];
					mioArray[j] = temp;
				}
				for( i=0;i<10;i++)
				System.out.print(mioArray[i] + " ");
			}
		
		
	}
	}

}
