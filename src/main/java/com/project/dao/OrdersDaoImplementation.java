package com.project.dao;

import java.util.List;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.project.sources.Orders;

public class OrdersDaoImplementation implements OrdersDao{
		private JdbcTemplate jdbcTemplate;
		static final Logger logger = Logger.getLogger(com.project.dao.OrdersDaoImplementation.class);
		
		
		@Override
		public void setDataSource(DataSource dataSource) {
			jdbcTemplate= new JdbcTemplate(dataSource);
			
		}
		
		
	
	public void addOrders(Orders o) {
		
		String sql = "insert into pizzeria.orders (customer_id,total_price,order_address) values (?,?,?)";
		int rowsAffected = jdbcTemplate.update(sql, o.getCustomerId(),o.getTotalPrice(),o.getOrderAddress());
		
		if(rowsAffected == 0) {
			logger.error("unsuccessful insertion of orders");
		}
		
		else logger.info("inserted order successfully");
	}
	
	public int sendOrderId() {
		String query1="Select max(order_id) from pizzeria.orders ";
		Integer a;
		a = jdbcTemplate.queryForObject(query1,Integer.class);
		return a;
	}
	
	public List<Orders> getAllOrders() {
		String query="Select * from pizzeria.orders";
		return jdbcTemplate.query(query, new BeanPropertyRowMapper<Orders>(Orders.class));
	}
}
