package com.project.dao;


import javax.sql.DataSource;

import com.project.sources.Cart;

public interface CartDao {
	public void setDataSource(DataSource dataSource);
	public void addToCart(Cart cart);
	public void deleteFromCart(int customerId);
	public void deleteItemFromCart(int customerId, String itemId);
}
