package advanced;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import advanced.Casa.Tipo;


//class ComparatoreSuperficie implements Comparator<Casa>{
//
//	@Override
//	public int compare(Casa primaCasa, Casa altraCasa) {
//
//		return Double.compare(primaCasa.getSuperficie(), altraCasa.getSuperficie());
//	}
//	
//}
//
//
//


public class AgenziaImmobiliare {

	public static void main(String[] args) {
		
		List<Casa> immobili = new LinkedList<>();
		
		//ciao ema
		
		Casa casa1 = new Casa();
		casa1.setNome("Casa BLU");
		casa1.setPrezzo(150000);
		casa1.setSuperficie(150);
		casa1.setStanze(4);
		casa1.setTipologiaCasa(Tipo.APPARTAMENTO);
		
		Casa casa2 = new Casa();
		casa2.setNome("Casa GIALLA");
		casa2.setPrezzo(250000);
		casa2.setSuperficie(140);
		casa2.setStanze(7);
		casa2.setTipologiaCasa(Tipo.CASA_INDIPENDENTE);
		
		Casa casa3 = new Casa();
		casa3.setNome("Casa VERDE");
		casa3.setPrezzo(95000);
		casa3.setSuperficie(155);
		casa3.setStanze(1);
		casa3.setTipologiaCasa(Tipo.LOFT);
		
		immobili.add(casa1);
		immobili.add(casa2);
		immobili.add(casa3);
		immobili.add(casa1);
		
		Set<Casa> immobiliSet = new TreeSet<>(immobili);
		
		
		for (Casa casa : immobili) {
			System.out.println(casa);
		}
		
		System.out.println("--------TREESET ordinato per prezzo----------------------------------");
		
		for (Casa casa : immobiliSet) {
			System.out.println(casa);
		}
		
		
		Collections.sort(immobili, (primaCasa, altraCasa) -> Double.compare(primaCasa.getSuperficie(), altraCasa.getSuperficie())); 
		
		System.out.println("---------LIST ordinata per superficie------------------");
		
		for (Casa casa : immobili) {
			System.out.println(casa);
		}
		
		
	}

}
