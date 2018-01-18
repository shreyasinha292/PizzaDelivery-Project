package com.project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.dao.RegisteredCustomerDao;
import com.project.sources.Registered_Customers;

@RestController
public class RegisteredCustomerController {
	@Autowired
	RegisteredCustomerDao registeredCustomerDao;
	
	@PostMapping(value = "/dfbv")
	public void addTheRegisteredCustomer(Registered_Customers rc) {
		registeredCustomerDao.addRegisteredCustomer(rc);
	}
}
