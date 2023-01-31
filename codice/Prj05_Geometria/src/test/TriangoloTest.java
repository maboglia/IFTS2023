package test;

import model.Punto;
import model.Triangolo;

public class TriangoloTest {

	public static void main(String[] args) {
		
		Punto a = new Punto(3, 2);
		Punto b = new Punto(7, 2);
		Punto c = new Punto(3, 5);
		
		Triangolo t = new Triangolo(a, b, c);
		
		System.out.println(t); 

	}

}
