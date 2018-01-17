package com.project.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.springframework.jdbc.core.JdbcTemplate;

import com.project.sources.Customer;
import com.project.sources.Registered_Customers;

public class CustomerDaoImplementation implements CustomerDao {
	private JdbcTemplate jdbcTemplate;
	static final Logger logger = Logger.getLogger(com.project.dao.CustomerDaoImplementation.class);
	static List<Customer> customerList=new ArrayList<Customer>();
	
	public CustomerDaoImplementation() {
		BasicConfigurator.configure();
	}
	
	public void addCustomer(String name,String contact,String address) {
		String query="Insert into pizzeria.customer(name,contact,address)values(?,?,?) ";
		jdbcTemplate.update(query,name,contact,address);
		
		
		
	}
	
	public int sendCustomerId() {
		String query1="Select max(customer_id) from customer ";
		Integer a=jdbcTemplate.queryForObject(query1,Integer.class);
		int b=a.intValue();
		return b;
	}
	public void deleteCustomer(int customerId) {
		String query="Delete from pizzeria.customer where customer_id=?";
		jdbcTemplate.update(query,customerId);
	//	customerList.remove(c);
		
	}
	public void updateCustomer(String contact,String address,int customerId) {
		String query="Update from pizzeria.customer set contact=?,address=? where customer_id=?";
		jdbcTemplate.update(query,contact,address,customerId);
	/*	for(int i=0;i<customerList.size();i++) {
			if(customerList.get(i).getCustomerId()==(c.getCustomerId())) {
				customerList.get(i).setAddress(c.getAddress());
				customerList.get(i).setContact(c.getContact());
			}
		}*/
	}
	public int isValidUser(Registered_Customers rc) {
	
		String query="Select * from registered_customers where username=?,password=?";
		int rowsEffected=jdbcTemplate.update(query,rc.getUsername(),rc.getPassword());
		if(rowsEffected==0) {
			return rc.getCustomerId();
		}else {
			return -1;
		}
	}
	
}
