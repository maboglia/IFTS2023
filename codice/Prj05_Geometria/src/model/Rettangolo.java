package model;

public class Rettangolo extends FiguraGeometrica {

	Segmento base, altezza;

	public Rettangolo(Segmento base, Segmento altezza) {
		super("rettangolo");
		this.base = base;
		this.altezza = altezza;
		this.perimetro = calcolaPerimetro();
		this.superficie = calcolaSuperficie(); 
		
	}
	
	public double calcolaSuperficie() {
		System.out.println("Ho usato il calcolo del rettangolo");
		return base.lunghezza * altezza.lunghezza;
	}

	double calcolaPerimetro() {
		return 2 * (base.lunghezza + altezza.lunghezza);
	}

//	@Override
//	public String toString() {
//		return "Rettangolo [base=" + base + ", altezza=" + altezza + ", perimetro=" + perimetro + ", superficie="
//				+ superficie + "]";
//	}
	
	
	
	
}
