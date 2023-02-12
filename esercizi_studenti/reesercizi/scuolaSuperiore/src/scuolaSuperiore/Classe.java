package scuolaSuperiore;

import java.util.Arrays;

public class Classe {
	private String nome;
	private int anno;
	private Studente[] studenti;
	
	public Classe() {
		super();
	}
	public Classe(String nome, int anno, Studente[] studenti) {
		super();
		this.nome = nome;
		this.anno = anno;
		this.studenti = studenti;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAnno() {
		return anno;
	}
	public void setAnno(int anno) {
		this.anno = anno;
	}
	public Studente[] getStudenti() {
		return studenti;
	}
	public void setStudenti(Studente[] studenti) {
		this.studenti = studenti;
	}
	
	@Override
	public String toString() {
		return "Classe [nome=" + nome + ", anno=" + anno + ", studenti=" + Arrays.toString(studenti) + "]";
	}
	
}