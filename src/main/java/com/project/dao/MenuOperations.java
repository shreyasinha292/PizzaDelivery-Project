package com.project.dao;

import java.util.List;

import com.project.sources.Menu;


public interface MenuOperations {

	public List<Menu> getVegPizza();
	
	public List<Menu> getNonVegPizza();
	
	public List<Menu> getCombos();
	
	public List<Menu> getCrusts();
	
	public List<Menu> getVegToppings();
	
	public List<Menu> getNonVegToppings();
	
}
