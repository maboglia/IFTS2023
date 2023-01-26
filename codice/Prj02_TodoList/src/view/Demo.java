package view;

import java.util.Scanner;

import controller.TodoCtrl;
import model.Todo;

public class Demo {

	private static String leggiStringa(String domanda) {
		
		System.out.println(domanda);
		Scanner scanner = new Scanner(System.in);
		return scanner.nextLine();
	}
	
	
	
	public static void main(String[] args) {
		TodoCtrl ctrl = new TodoCtrl(10);
		
		for (int i = 0; i < ctrl.getAll().length; i++) {
			ctrl.add(leggiStringa("cosa vuoi comprare"));
		}
		

		
		for (Todo t : ctrl.getAll()) {
			System.out.println(t);
		}

	}

}
