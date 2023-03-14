package advanced;

public class Casa implements Comparable<Casa>{

	private String nome;
	private double prezzo;
	private double superficie;
	private int stanze;
	private Tipo tipologiaCasa;
	
	
	public Tipo getTipologiaCasa() {
		return tipologiaCasa;
	}

	public void setTipologiaCasa(Tipo tipologiaCasa) {
		this.tipologiaCasa = tipologiaCasa;
	}

	public enum Tipo {VILLA, CASA_INDIPENDENTE, APPARTAMENTO, LOFT}

	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public double getSuperficie() {
		return superficie;
	}

	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	public int getStanze() {
		return stanze;
	}

	public void setStanze(int stanze) {
		this.stanze = stanze;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Casa [nome=");
		builder.append(nome);
		builder.append(", prezzo=");
		builder.append(prezzo);
		builder.append(", superficie=");
		builder.append(superficie);
		builder.append(", stanze=");
		builder.append(stanze);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int compareTo(Casa altraCasa) {
		
		return Double.compare(this.prezzo, altraCasa.prezzo);
	}
	
	
	
}
