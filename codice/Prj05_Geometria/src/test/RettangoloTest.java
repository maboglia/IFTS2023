package test;

import model.Punto;
import model.Quadrato;
import model.Rettangolo;
import model.Segmento;

public class RettangoloTest {

	public static void main(String[] args) {

		Segmento ab = new Segmento(new Punto(3, 2), new Punto(7,2) );//4
		Segmento ac = new Segmento(new Punto(3, 2), new Punto(3,5) );//3
		Rettangolo r = new Rettangolo(ab, ac);//12
		Quadrato q = new Quadrato(ab);//16
		
		Rettangolo[] scatole = new Rettangolo[2];
		
		scatole[0] = r;
		scatole[1] = q;
		
		
		//System.out.println(r.calcolaSuperficie());
		System.out.println(q.calcolaSuperficie());
	}
	

}
