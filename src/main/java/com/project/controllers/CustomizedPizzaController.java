package com.project.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.dao.CustomizedPizzaOperations;

@RestController
public class CustomizedPizzaController {
	
	@Autowired
	CustomizedPizzaOperations customizedPizzaOperations;
	
	@PostMapping(value = "/dg")
	public void addTheOrders(List<String> cpList) {
	
		customizedPizzaOperations.addPizzaItems(cpList);
	}
	
	@GetMapping(value="/aser")
	public String sendTheCpId() {
		
		return customizedPizzaOperations.sendCpId();
	}

}
