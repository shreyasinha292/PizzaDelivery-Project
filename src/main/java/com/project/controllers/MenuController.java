package com.project.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.dao.MenuOperationsImpl;
import com.project.sources.Menu;



@RestController
public class MenuController {
	
	@Autowired
	MenuOperationsImpl menuOperationsImpl;
	
	@GetMapping(value = "/")
	public List<Menu> getTheVegPizza() {
		return menuOperationsImpl.getVegPizza();
	}

	@GetMapping(value = "/")
	public List<Menu> getTheNonVegPizza() {
		return menuOperationsImpl.getNonVegPizza();
	}
	
	@GetMapping(value = "/")
	public List<Menu> getTheCombos() {
		return menuOperationsImpl.getCombos();
	}
	
	@GetMapping(value = "/")
	public List<Menu> getTheCrusts() {
		return menuOperationsImpl.getCrusts();
	}
	
	@GetMapping(value = "/")
	public List<Menu> getTheVegToppings() {
		return menuOperationsImpl.getVegToppings();
	}
	
	@GetMapping(value = "/")
	public List<Menu> getTheNonVegToppings() {
		return menuOperationsImpl.getNonVegToppings();
	}

}
