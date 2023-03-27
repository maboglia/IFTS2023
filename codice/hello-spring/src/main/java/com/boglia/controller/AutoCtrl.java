package com.boglia.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.boglia.model.Auto;

@Component
public class AutoCtrl {

	private List<Auto> automobili = new ArrayList<>();
	
	{
//		automobili.add(new Auto("fiat", "500", 10_000));
//		automobili.add(new Auto("ferrari", "F9", 100_000));
//		automobili.add(new Auto("lamborghini", "Q7", 150_000));
//		automobili.add(new Auto("mercedes", "B5", 70_000));
//		automobili.add(new Auto("BMW", "1.12", 60_000));
//		automobili.add(new Auto("Audi", "A8", 50_000));
	}
	
	public void addAuto(Auto a) {
		automobili.add(a);
	}
	
	public List<Auto> getAutomobili() {
		return automobili;
	}
	
}
