package com.project.dao;

import java.util.List;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.project.sources.OrderDetails;

public class OrderDetailsImlp implements OrderDetailsOperation {
	
	private JdbcTemplate jdbcTemplate;
	static final Logger logger = Logger.getLogger(com.project.dao.StaffImpl.class);

	@Override
	public void setDataSource(DataSource dataSource) {
		jdbcTemplate= new JdbcTemplate(dataSource);
		
	}
	public void addOrders(List<OrderDetails> odList) {
		
		for(OrderDetails od : odList) {
			
			if(od.getCpId() == null) {
				String sql = "insert into pizzeria.order_details (order_id,item_id,quantity) values (?,?,?)";
				int rowsAffected = jdbcTemplate.update(sql, od.getOrderId(), od.getItemId(),od.getQuantity());
			
				if(rowsAffected == 0) {
					logger.error("unsuccessful insertion of staff");
				}
			
				else logger.info("inserted staff successfully");
			}
		
			else {
			
				String sql2 =  "insert into pizzeria.order_details (order_id,cp_id,quantity) values (?,?,?)";
			
				int rowsAffected2 = jdbcTemplate.update(sql2, od.getOrderId(), od.getCpId(),od.getQuantity());
			
				if(rowsAffected2 == 0) {
					logger.error("unsuccessful insertion of staff");
				}
			
				else logger.info("inserted staff successfully");
			}
			
		}
		
	}

	public List<OrderDetails> displayAllOrderDetails() {
		
		List<OrderDetails> odDetails;
		String sql = "select * from pizzeria.order_details";
		odDetails = jdbcTemplate.query(sql, new BeanPropertyRowMapper<OrderDetails>(OrderDetails.class));
		return odDetails;
		
	}

	public OrderDetails displayOrderDetailsById(String orderId) {
		
		OrderDetails od;
		String sql = "select * from pizzeria.order_details where order_id = ?";
		od = jdbcTemplate.queryForObject(sql,new Object[] { orderId }, new BeanPropertyRowMapper<OrderDetails>(OrderDetails.class));
		return od;
	}

}
