package com.project.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.project.sources.OrderDetails;

public interface OrderDetailsOperation {
	
	public void addOrders(List<OrderDetails> odList);
	
	public List<OrderDetails> displayAllOrderDetails();
	
	public OrderDetails displayOrderDetailsById(String orderId);
	

	public void setDataSource(DataSource dataSource);

}
