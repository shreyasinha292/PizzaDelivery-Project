package com.project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.dao.CustomerDao;
import com.project.sources.Customer;
import com.project.sources.Registered_Customers;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerDao customerDao;
	
	@PostMapping(value = "/xyz")
	public void createNewCustomer(@RequestBody Customer cust) {
		 customerDao.addCustomer(cust);
		
	}
	
	@GetMapping(value="/rgter")
	public int sendTheCustomerId() {
		return customerDao.sendCustomerId();
	}
	
	@DeleteMapping(value = "/srgesr/{customerId}")
	public void deleteTheCustomer(@PathVariable int customerId) {
		customerDao.deleteCustomer(customerId);
	}
	
	@PostMapping(value="/valid")
	public int validUser(Registered_Customers rc) {
		return customerDao.isValidUser(rc);
	}
	
	@PutMapping(value="/drg")
	public void updateTheCustomer(int customerId,String contact,String address) {
		customerDao.updateCustomer(contact,address,customerId);
	}
	
	
	
	

}
