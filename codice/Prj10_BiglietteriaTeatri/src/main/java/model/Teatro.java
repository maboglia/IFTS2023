package model;

public class Teatro {

	private int id;
	private String nome;
	private int nPosti;
	
	public Teatro() {//no args constructor
	}

	public Teatro(int id, String nome, int nPosti) {//all args constructor
		this.id = id;
		this.nome = nome;
		this.nPosti = nPosti;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getnPosti() {
		return nPosti;
	}

	public void setnPosti(int nPosti) {
		this.nPosti = nPosti;
	}

	@Override
	public String toString() {
		return "Teatro [id=" + id + ", nome=" + nome + ", nPosti=" + nPosti + "]";
	}
	
	
	
	
}
