package com.project.dao;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.JdbcTemplate;

import com.project.sources.OrderDetails;

public class OrderDetailsImlp implements OrderDetailsOperation {
	
	private JdbcTemplate jdbcTemplate;
	static final Logger logger = Logger.getLogger(com.project.dao.StaffImpl.class);

	public OrderDetailsImlp(DataSource dataSource) {
		
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public void addOrders(OrderDetails od) {
		
		boolean isCp = od.getisCP();
		if(!isCp) {
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
