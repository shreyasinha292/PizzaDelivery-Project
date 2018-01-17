package com.project.dao;

import com.project.sources.Cart;

public interface CartDao {
	public void addToCart(Cart cart);
	public void deleteFromCart(int cartId);
	public void deleteItemFromCart(int customerId,int itemId);
}
