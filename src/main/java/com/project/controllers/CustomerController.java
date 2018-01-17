package com.project.controllers;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.dao.CustomerDaoImplementation;
import com.project.sources.Customer;
import com.project.sources.Registered_Customers;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerDaoImplementation customercontroller;
	
	@PostMapping(value = "/")
	public void createNewCustomer(String name,String contact,String address) {
		customercontroller.addCustomer(name,contact,address);
	}
	
	@DeleteMapping(value = "")
	public void deleteTheCustomer(@PathParam(value = "customerId") int customerId) {
		customercontroller.deleteCustomer(customerId);
	}
	
	@PostMapping(value="/")
	public int validUser(Registered_Customers rc) {
		return customercontroller.isValidUser(rc);
	}
	
	@PutMapping(value="/")
	public void updateTheCustomer(int customerId,String contact,String address) {
		customercontroller.updateCustomer(contact,address,customerId);
	}
	
	
	
	

}
