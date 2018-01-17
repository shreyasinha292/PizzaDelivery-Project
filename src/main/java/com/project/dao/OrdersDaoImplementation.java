package com.project.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.project.sources.Customer;
import com.project.sources.Orders;

public class OrdersDaoImplementation {
		private JdbcTemplate jdbcTemplate;
		static final Logger logger = Logger.getLogger(com.project.dao.OrdersDaoImplementation.class);
		static List<Customer> orderList=new ArrayList<Customer>();
		
		public OrdersDaoImplementation() {
			BasicConfigurator.configure();
		}
	
	public void addOrders(Orders o) {
		
	}
	
	public List<Orders> getAllOrders() {
		String query="Select * from pizzeria.Orders";
		return jdbcTemplate.query(query, new BeanPropertyRowMapper<Orders>(Orders.class));
	}
}
