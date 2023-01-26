package model;

public class Todo {

	private String descrizione;
	private boolean completo;
	
	public Todo(String descrizione) {
		this.descrizione = descrizione;
		this.completo = false;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public boolean isCompleto() {
		return completo;
	}

	public void setCompleto(boolean completo) {
		this.completo = completo;
	}

	@Override
	public String toString() {
		return "Todo [descrizione=" + descrizione + ", completo=" + completo + "]";
	}
	
	
	
	
}
