package controller;

import model.Todo;

public class TodoCtrl {

	Todo[] todos;
	
	public TodoCtrl(int dimensione) {
		todos = new Todo[dimensione];
	}
	
	public Todo[] getAll() {
		return todos;
	}
	
	public void add(String descrizione) {
		int posizione = trovaPosizioneLibera();
		
		if (posizione > -1) {
			todos[posizione] = new Todo(descrizione);
		} else {
			System.out.println("Non c'è posto per la nota!!!!!!");
		}
	}

	private int trovaPosizioneLibera() {
		for (int i = 0; i < todos.length; i++) {
			if(todos[i]==null) {
				return i;
			}
		}
		return -1;
	}
	
}
