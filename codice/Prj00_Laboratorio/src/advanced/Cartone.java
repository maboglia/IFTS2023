package advanced;

public class Cartone {

	private int id;
	private String titolo;
	private double rating;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cartone [id=");
		builder.append(id);
		builder.append(", titolo=");
		builder.append(titolo);
		builder.append(", rating=");
		builder.append(rating);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}
