package com.project.controllers;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.dao.OrderDetailsOperation;
import com.project.sources.OrderDetails;


@RestController
public class OrderDetailsController {

	
	@Autowired
	OrderDetailsOperation orderDetails;
	
	@PostMapping(value = "/sf")
	public void addTheOrders(List<OrderDetails> odList) {
	
		orderDetails.addOrders(odList);
	}
	
	@GetMapping(value = "/ert")
	public List<OrderDetails> displayAllTheOrderDetails() {
		return orderDetails.displayAllOrderDetails();
	}
	
	@GetMapping(value = "/gdrg/{orderId}")
	public  OrderDetails displayTheOrderDetailsById(@PathParam(value = "orderId") String orderId){
		
		return orderDetails.displayOrderDetailsById(orderId);
	}
}
