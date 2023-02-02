package model;

public class Triangolo extends FiguraGeometrica{

	Punto a, b, c;
	Segmento  ab, ac, bc;

	
	public Triangolo(Punto a, Punto b, Punto c) {
		super("Triangolo");
		this.a = a;
		this.b = b;
		this.c = c;
		this.ab = new Segmento(a, b);
		this.ac = new Segmento(a, c);
		this.bc = new Segmento(b, c);
		this.perimetro = this.calcolaPerimetro();
		this.superficie = this.calcolaSuperficie();
	}
	
	double calcolaPerimetro() {
		return ab.lunghezza + ac.lunghezza + bc.lunghezza;
	}
	
	double calcolaSuperficie() {
		double sp = this.perimetro/2;
		
		return Math.sqrt(sp 
				* (sp-ab.lunghezza) 
				* (sp-ac.lunghezza) 
				* (sp - bc.lunghezza)
				);
	}

//	@Override
//	public String toString() {
//		return "Triangolo [a=" + a + ", b=" + b + ", c=" + c + ", ab=" + ab + ", ac=" + ac + ", bc=" + bc
//				+ ", perimetro=" + perimetro + ", superficie=" + superficie + "]";
//	}

	
	
}
