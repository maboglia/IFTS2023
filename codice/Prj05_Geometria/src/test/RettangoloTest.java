package test;

import model.Punto;
import model.Quadrato;
import model.Rettangolo;
import model.Segmento;

public class RettangoloTest {

	public static void main(String[] args) {

		Segmento ab = new Segmento(new Punto(3, 2), new Punto(7,2) );
		Segmento ac = new Segmento(new Punto(3, 2), new Punto(3,5) );
		Rettangolo r = new Rettangolo(ab, ac);
		Quadrato q = new Quadrato(ab);
		
		System.out.println(r);
		System.out.println(q);
	}
	

}
