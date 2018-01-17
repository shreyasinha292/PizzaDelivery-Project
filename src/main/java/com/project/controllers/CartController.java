package com.project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.dao.CartDaoImplementation;
import com.project.sources.Cart;
@RestController
public class CartController {
	@Autowired
	CartDaoImplementation cartcontroller;
	
	@PostMapping(value = "/")
	public void addToTheCart(Cart cart) {
		cartcontroller.addToCart(cart);
	}
	
	@DeleteMapping(value="/")
	public void deleteFromTheCart(int cartId) {
		cartcontroller.deleteFromCart(cartId);
	}
	@DeleteMapping(value="/")
	public void deleteItemFromTheCart(int customerId,int itemId) {
		cartcontroller.deleteItemFromCart(customerId,itemId);
	}
}
