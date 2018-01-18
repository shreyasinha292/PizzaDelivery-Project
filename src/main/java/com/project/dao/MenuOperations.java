package com.project.dao;

import java.util.List;

import javax.sql.DataSource;

import com.project.sources.Menu;


public interface MenuOperations {

	public List<Menu> getVegPizza();
	
	public List<Menu> getNonVegPizza();
	
	public List<Menu> getCombos();
	
	public List<Menu> getCrusts();
	
	public List<Menu> getVegToppings();
	
	public List<Menu> getNonVegToppings();
	
	public List<Menu> getMenu();
	
	public void setDataSource(DataSource dataSource);
}
