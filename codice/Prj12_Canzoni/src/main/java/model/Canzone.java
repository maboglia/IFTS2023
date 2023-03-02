package model;

public class Canzone {

	private int id;
	private String canzone;
	private String cantanti;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCanzone() {
		return canzone;
	}
	public void setCanzone(String canzone) {
		this.canzone = canzone;
	}
	public String getCantanti() {
		return cantanti;
	}
	public void setCantanti(String cantanti) {
		this.cantanti = cantanti;
	}
	@Override
	public String toString() {
		return "Canzone [id=" + id + ", canzone=" + canzone + ", cantanti=" + cantanti + "]";
	}
	
	
	
}
