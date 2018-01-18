package com.project.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.springframework.jdbc.core.JdbcTemplate;

import com.project.sources.Customer;
import com.project.sources.Registered_Customers;

public class CustomerDaoImplementation implements CustomerDao {
	private JdbcTemplate jdbcTemplate;
	static final Logger logger = Logger.getLogger(com.project.dao.CustomerDaoImplementation.class);
	static List<Customer> customerList=new ArrayList<Customer>();
	
	
	@Override
	public void setDataSource(DataSource dataSource) {
		jdbcTemplate= new JdbcTemplate(dataSource);
		
	}
	
	public CustomerDaoImplementation() {
		BasicConfigurator.configure();
	}
	
	public void addCustomer(Customer cust) {
		String query="Insert into pizzeria.customer(name,contact,address)values(?,?,?) ";
		jdbcTemplate.update(query,cust.getName(),cust.getContact(),cust.getAddress());
			
	}
	
	public int sendCustomerId() {
		String query1="Select max(customer_id) from pizzeria.customer ";
		Integer a = jdbcTemplate.queryForObject(query1,Integer.class);
		return a;
	}
	
	public void deleteCustomer(int customerId) {
		String query="Delete from pizzeria.customer where customer_id=?";
		jdbcTemplate.update(query,customerId);

		
	}
	public void updateCustomer(String contact,String address,int customerId) {
		String query="Update pizzeria.customer set contact=?,address=? where customer_id=?";
		jdbcTemplate.update(query,contact,address,customerId);
	
	}
	public int isValidUser(Registered_Customers rc) {
	
		String query="Select * from registered_customers where username=?,password=?";
		int rowsEffected=jdbcTemplate.update(query,rc.getUsername(),rc.getPassword());
		if(rowsEffected!=0) {
			return rc.getCustomerId();
		}
		else {
			return -1;
		}
	}
	
}
