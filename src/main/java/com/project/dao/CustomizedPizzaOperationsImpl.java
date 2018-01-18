package com.project.dao;

import java.util.List;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.JdbcTemplate;

public class CustomizedPizzaOperationsImpl implements CustomizedPizzaOperations{

	public static Integer counter = 1;
	private JdbcTemplate jdbcTemplate;
	static final Logger logger = Logger.getLogger(com.project.dao.StaffImpl.class);

	@Override
	public void setDataSource(DataSource dataSource) {
		jdbcTemplate= new JdbcTemplate(dataSource);
		
	}
	
	public void addPizzaItems(List<String> itemList) {
	
		
		for(String cp: itemList) {
			
			String sql = "insert into pizzeria.customized_pizza values (?,?)";
			int rowsAffected = jdbcTemplate.update(sql,counter.toString(),cp);
			
			if(rowsAffected == 0) {
				logger.error("unsuccessful insertion of an item in cp");
			}
		
			else logger.info("inserted item in cp successfully");
			
		}
		
		
	}

	public String sendCpId() {
		
		String cpId = counter.toString();
		counter++;
		return cpId;
	}

}
