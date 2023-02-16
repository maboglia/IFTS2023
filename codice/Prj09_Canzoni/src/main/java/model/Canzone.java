package model;

public class Canzone {

	private int id;
	private String cantante;
	private String titolo;
	private String genere;
	private int anno;
	
	
	public Canzone(int id, String cantante, String titolo, String genere, int anno) {
		this.id = id;
		this.cantante = cantante;
		this.titolo = titolo;
		this.genere = genere;
		this.anno = anno;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCantante() {
		return cantante;
	}


	public void setCantante(String cantante) {
		this.cantante = cantante;
	}


	public String getTitolo() {
		return titolo;
	}


	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}


	public String getGenere() {
		return genere;
	}


	public void setGenere(String genere) {
		this.genere = genere;
	}


	public int getAnno() {
		return anno;
	}


	public void setAnno(int anno) {
		this.anno = anno;
	}


	@Override
	public String toString() {
		return "Canzone [id=" + id + ", cantante=" + cantante + ", titolo=" + titolo + ", genere=" + genere + ", anno="
				+ anno + "]";
	}
	
	
	
}
