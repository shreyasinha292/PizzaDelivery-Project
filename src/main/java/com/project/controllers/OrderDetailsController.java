package com.project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.dao.OrderDetailsImlp;
import com.project.sources.OrderDetails;


@RestController
public class OrderDetailsController {

	
	@Autowired
	OrderDetailsImlp orderDetailsImpl;
	
	@PostMapping(value = "/")
	public void addTheOrders(OrderDetails od) {
	
		orderDetailsImpl.addOrders(od);
	}
}
