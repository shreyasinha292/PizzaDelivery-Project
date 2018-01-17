package com.project.dao;

import java.util.List;

import com.project.sources.Orders;

public interface OrdersDao {
	public void addOrders(Orders o);
	public List<Orders> getAllOrders();
	

}
