package test;

import model.Punto;
import model.Segmento;

public class SegmentoTest {

	public static void main(String[] args) {
		
		Punto a = new Punto(3, 2);
		Punto b = new Punto(7, 2);
		
		Segmento ab = new Segmento(a, b);
		
		System.out.println(ab);
		

	}

}
