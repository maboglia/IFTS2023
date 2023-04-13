package collezioni;

import java.util.Comparator;
import java.util.List;

public class VolanteDemo {

	public static void main(String[] args) {
		
		var p = new Papera();
		var a = new Aereo();	
		var volanti = List.of(a, p, a, a, p);
		
			
		volanti
			.stream()
			.sorted((o1, o2) -> {
				if (o1 instanceof Papera) {
					return 1;
				} 
				return -1;
			}).forEach(VolanteDemo::faiVolare);
		

	}

	public static void faiVolare(Volante v) {
		v.vola();
	}
	
}
