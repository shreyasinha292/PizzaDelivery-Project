package com.project.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.springframework.jdbc.core.JdbcTemplate;

import com.project.sources.Customer;
import com.project.sources.Registered_Customers;

public class RegisteredCustomerDaoImplementation implements RegisteredCustomerDao{
	
	private JdbcTemplate jdbcTemplate;
	static final Logger logger = Logger.getLogger(com.project.dao.CustomerDaoImplementation.class);
	static List<Customer> customerList=new ArrayList<Customer>();
	
	public RegisteredCustomerDaoImplementation() {
		BasicConfigurator.configure();
		
	}
	
	@Override
	public void setDataSource(DataSource dataSource) {
		jdbcTemplate= new JdbcTemplate(dataSource);
		
	}
	
		public void addRegisteredCustomer(Registered_Customers rc) {
			String query="Insert into pizzeria.registered_customers(customer_id,DOB,username,password) values (?,?,?,?) ";
			jdbcTemplate.update(query,rc.getCustomerId(),rc.getDob(),rc.getUsername(),rc.getPassword());
			
			}

		
	}

