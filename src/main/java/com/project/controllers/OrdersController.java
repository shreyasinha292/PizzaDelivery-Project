package com.project.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project.dao.OrdersDaoImplementation;
import com.project.sources.Orders;
@RestController
public class OrdersController {

@Autowired
OrdersDaoImplementation orderscontroller;

@GetMapping(value="/")
public List<Orders> getAllTheOrders() {
	return orderscontroller.getAllOrders();
}

@PostMapping(value="/")
public void addTheOrders(Orders o) {
	orderscontroller.addOrders(o);
}

}
