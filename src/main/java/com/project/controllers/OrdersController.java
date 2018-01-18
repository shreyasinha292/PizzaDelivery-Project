package com.project.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.dao.OrdersDao;
import com.project.sources.Orders;
@RestController
public class OrdersController {

@Autowired
OrdersDao ordersDao;

@GetMapping(value="/wqeq")
public List<Orders> getAllTheOrders() {
	return ordersDao.getAllOrders();
}

@PostMapping(value="/asdv")
public void addTheOrders(Orders o) {
	ordersDao.addOrders(o);
}

@GetMapping(value="/ytj")
public int sendTheOrderId() {
	return ordersDao.sendOrderId();
}

}
