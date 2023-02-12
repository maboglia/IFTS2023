package Stage080223;

import java.util.Scanner;

public class ConvertiMaiusculo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Insirisci una sequenza di caratteri: ");
		String string = sc.nextLine();
		for(int i=0; i<string.length(); i++) {
			System.out.print(string.toUpperCase().charAt(i)+ " ");
			
		}
		
		
		
		
	}

}
