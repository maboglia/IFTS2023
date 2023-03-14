package advanced;

import java.util.List;

public class TestCartoni {

	public static void main(String[] args) {
		
		CollezioneCartoni ctrl = new CollezioneCartoni();
		
		ctrl.mettiIlContenutoDelFileInUnaLista();
		
		
		List<Cartone> cartoniFiltrati  =   ctrl
			.dammiTuttiICartoniCheHAiNellaLista()
			.stream()
			.filter(cartone -> cartone.getRating() > 7.9)
			.filter(cartone -> cartone.getRating() < 9)
			.sorted(   (c1,c2)   ->    Double.compare(c2.getRating(), c1.getRating()))
//			.forEach(cartone -> System.out.println(cartone));
			.toList();
			
		System.out.println(cartoniFiltrati.size());
		ctrl.scriviUnFileDaUnaLista(cartoniFiltrati);
		
	}

}
