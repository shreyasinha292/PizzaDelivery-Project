package com.project.dao;

import javax.sql.DataSource;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.springframework.jdbc.core.JdbcTemplate;

import com.project.sources.Cart;

public class CartDaoImplementation implements CartDao{
	private JdbcTemplate jdbcTemplate;
	static final Logger logger = Logger.getLogger(com.project.dao.CustomerDaoImplementation.class);
	
	
	@Override
	public void setDataSource(DataSource dataSource) {
		jdbcTemplate= new JdbcTemplate(dataSource);
		
	}
	
	public CartDaoImplementation() {
		BasicConfigurator.configure();
	}
	
	public void addToCart(Cart cart) {
		
		if(cart.getCpId().equals("-1")) {
			
			String query="Insert into pizzeria.cart(customer_id,cart_item_id,cp_id,item_id) values (?,?,?,?) ";
			jdbcTemplate.update(query,cart.getCustomeId(),cart.getCartItemId(),null,cart.getItemId());
		}
		
		else {
			
			String query="Insert into pizzeria.cart(customer_id,cart_item_id,cp_id,item_id) values (?,?,?,?) ";
			jdbcTemplate.update(query,cart.getCustomeId(),cart.getCartItemId(),cart.getCpId(),null);
		}
	}
	
	public void deleteFromCart(int customerId) {
		String query="Delete from pizzeria.cart where customer_id=?";
		jdbcTemplate.update(query,customerId);

	}
	public void deleteItemFromCart(int customerId,String itemId) {
		String query="Delete from pizzeria.cart where customer_id=? and item_id=?";
		jdbcTemplate.update(query,customerId,itemId);
	}

	
	
}
