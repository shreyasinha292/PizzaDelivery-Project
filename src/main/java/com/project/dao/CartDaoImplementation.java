package com.project.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.springframework.jdbc.core.JdbcTemplate;

import com.project.sources.Cart;

public class CartDaoImplementation implements CartDao{
	private JdbcTemplate jdbcTemplate;
	static final Logger logger = Logger.getLogger(com.project.dao.CustomerDaoImplementation.class);
	static List<Cart> cartItemList=new ArrayList<Cart>();
	
	public CartDaoImplementation() {
		BasicConfigurator.configure();
	}
	
	public void addToCart(Cart cart) {
		String query="Insert into pizzeria.cart(customer_id,cart_item_id,cp_id,item_id)values(?,?,?,?) ";
		jdbcTemplate.update(query,cart.getCustomer_id(),cart.getCart_item_id(),cart.getCp_id(),cart.getItem_id());
		cartItemList.add(cart);
	}
	
	public void deleteFromCart(int cartId) {
		String query="Delete from pizzeria.cart where customer_id=?";
		jdbcTemplate.update(query,cartId);
		//cartItemList.remove(cart);
	}
	public void deleteItemFromCart(int customerId,int itemId) {
		String query="Delete from pizzeria.cart where customer_id=?,item_id=?";
		jdbcTemplate.update(query,customerId,itemId);
	}
	
}
