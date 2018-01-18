package com.project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.dao.CartDao;
import com.project.sources.Cart;
@RestController
public class CartController {
	@Autowired
	CartDao cartDao;
	
	@PostMapping(value = "/xcv")
	public void addToTheCart(Cart cart) {
		cartDao.addToCart(cart);
	}
	
	@DeleteMapping(value="/dsfg")
	public void deleteFromTheCart(int cartId) {
		cartDao.deleteFromCart(cartId);
	}
	@DeleteMapping(value="/fgt")
	public void deleteItemFromTheCart(int customerId,String itemId) {
		cartDao.deleteItemFromCart(customerId,itemId);
	}
}
