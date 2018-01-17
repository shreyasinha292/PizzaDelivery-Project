package com.project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.dao.CartDaoImplementation;
import com.project.dao.RegisteredCustomerDaoImplementation;
import com.project.sources.Cart;
import com.project.sources.Registered_Customers;

@RestController
public class RegisteredCustomerController {
	@Autowired
	RegisteredCustomerDaoImplementation registercustomercontroller;
	
	@PostMapping(value = "/")
	public void addTheRegisteredCustomer(Registered_Customers rc) {
		registercustomercontroller.addRegisteredCustomer(rc);
	}
}
