package com.boglia.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.boglia.model.Moto;

@Component
public class MotoCtrl {

	private List<Moto> motociclette = new ArrayList<>();
	
	{
		
		motociclette.add(new Moto("Yamaha", "MT09", 10_000));
		motociclette.add(new Moto("BMW", "R1250GS", 20_000));
		motociclette.add(new Moto("Honda", "CBR1000", 15_000));
		motociclette.add(new Moto("Ducati", "851", 15_000));
		motociclette.add(new Moto("Kawasaki", "Z1000", 12_000));
		motociclette.add(new Moto("Suzuki", "Katana", 11_000));
		
	}
	
	public Moto addMoto(Moto m) {
		motociclette.add(m);
		return m;
	}
	
	public List<Moto> getMotociclette() {
		return motociclette;
	}
}
