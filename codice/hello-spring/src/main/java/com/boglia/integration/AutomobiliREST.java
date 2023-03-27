package com.boglia.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boglia.controller.AutoCtrl;
import com.boglia.controller.MotoCtrl;
import com.boglia.model.Auto;
import com.boglia.model.Moto;

@RestController
@RequestMapping("api")
public class AutomobiliREST {
	
	@Autowired
	AutoCtrl ctrl;
	
	@Autowired
	MotoCtrl ctrlMoto; 
	
	@GetMapping("auto")
	public List<Auto> getAll(){
		return ctrl.getAutomobili();
	}
	
	@GetMapping("moto")
	public List<Moto> getMoto(){
		return ctrlMoto.getMotociclette();
	} 
	
	@PostMapping("moto")
	public Moto addMoto(@RequestBody Moto m) {
		return ctrlMoto.addMoto(m);
	}
	
	
	@PostMapping("auto")
	public Auto addAuto(@RequestBody Auto a) {
		System.out.println(a);
		ctrl.addAuto(a);
		return a;
	}
	
	
}
