package com.project.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.dao.MenuOperations;
import com.project.sources.Menu;



@RestController
public class MenuController {
	
	@Autowired
	MenuOperations menuOperations;
	
	@GetMapping(value = "/jfhj")
	public List<Menu> getTheVegPizza() {
		return menuOperations.getVegPizza();
	}
	
	@GetMapping(value="/fdsgfwqg")
	public List<Menu> getTheMenu(){
		
		return menuOperations.getMenu();
	}

	@GetMapping(value = "/oieti")
	public List<Menu> getTheNonVegPizza() {
		return menuOperations.getNonVegPizza();
	}
	
	@GetMapping(value = "/nvbn")
	public List<Menu> getTheCombos() {
		return menuOperations.getCombos();
	}
	
	@GetMapping(value = "/yuwter")
	public List<Menu> getTheCrusts() {
		return menuOperations.getCrusts();
	}
	
	@GetMapping(value = "/sjhf")
	public List<Menu> getTheVegToppings() {
		return menuOperations.getVegToppings();
	}
	
	@GetMapping(value = "/sjfhhbn")
	public List<Menu> getTheNonVegToppings() {
		return menuOperations.getNonVegToppings();
	}

}
