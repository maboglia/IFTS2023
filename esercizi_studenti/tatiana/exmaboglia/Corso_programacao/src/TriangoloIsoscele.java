
public class TriangoloIsoscele {
	/*
	 * con i cicli innestati stampare a video la figura di un triangolo isoscele
	 *  composto di lettere A maiuscola
	 */
	public static void main(String[] args) {
		
		for(int i=0; i<6;i++) {
			System.out.print("A ");
			for(int j=1;j<6-i;j++) {
				System.out.print("A ");
			}System.out.println();
		}
		
	}

}
