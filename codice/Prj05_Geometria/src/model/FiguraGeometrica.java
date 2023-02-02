package model;

public abstract class FiguraGeometrica {

	String nome;
	
	double superficie;
	double perimetro;
	
	public FiguraGeometrica(String nome) {
		System.out.println("Ho costruito una figura astratta");
		this.nome = nome;
	}
	
	abstract double calcolaSuperficie();

	@Override
	public String toString() {
		return "FiguraGeometrica [nome=" + nome + ", superficie=" + superficie + ", perimetro=" + perimetro + "]";
	}
	
	
	
}
