package com.project.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.project.sources.Menu;

public class MenuOperationsImpl implements MenuOperations{
	
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void setDataSource(DataSource dataSource) {
		jdbcTemplate= new JdbcTemplate(dataSource);
		
	}

	public List<Menu> getMenu() {
		List<Menu> menu;
		String sql = "select * from pizzeria.menu";
		menu = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Menu>(Menu.class));
		return menu;
	}

	public List<Menu> getVegPizza() {
		
		List<Menu> menuVegPizza;
		String sql = "select * from pizzeria.menu where category = ?";
		menuVegPizza = jdbcTemplate.query(sql,new Object[]{"veg"}, new BeanPropertyRowMapper<Menu>(Menu.class));
		return menuVegPizza;
		    
	}

	public List<Menu> getNonVegPizza() {
		List<Menu> menuNonVegPizza;
		String sql = "select * from pizzeria.menu where category = ?";
		menuNonVegPizza = jdbcTemplate.query(sql,new Object[]{"nonveg"}, new BeanPropertyRowMapper<Menu>(Menu.class));
		return menuNonVegPizza;
		    
	}

	public List<Menu> getCombos() {
		List<Menu> combos;
		String sql = "select * from pizzeria.menu where category = ?";
		combos = jdbcTemplate.query(sql,new Object[]{"combo"}, new BeanPropertyRowMapper<Menu>(Menu.class));
		return combos;
		    
	}

	public List<Menu> getCrusts() {
		List<Menu> crusts;
		String sql = "select * from pizzeria.menu where category = ?";
		crusts = jdbcTemplate.query(sql,new Object[]{"crust"}, new BeanPropertyRowMapper<Menu>(Menu.class));
		return crusts;
	}

	public List<Menu> getVegToppings() {
		List<Menu> vegToppings;
		String sql = "select * from pizzeria.menu where category = ?";
		vegToppings = jdbcTemplate.query(sql,new Object[]{"vegtoppings"}, new BeanPropertyRowMapper<Menu>(Menu.class));
		return vegToppings;
	}

	public List<Menu> getNonVegToppings() {
		List<Menu> nonvegToppings;
		String sql = "select * from pizzeria.menu where category = ?";
		nonvegToppings = jdbcTemplate.query(sql,new Object[]{"nonvegtoppings"}, new BeanPropertyRowMapper<Menu>(Menu.class));
		return nonvegToppings;
	}

	
}
