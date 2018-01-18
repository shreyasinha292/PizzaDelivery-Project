package com.project.dao;

import javax.sql.DataSource;

import com.project.sources.Customer;
import com.project.sources.Registered_Customers;

public interface CustomerDao {
	public void addCustomer(Customer cust);
	public void deleteCustomer(int customerId);
	public void updateCustomer(String contact,String address,int customerId);
	public int isValidUser(Registered_Customers rc);
	public int sendCustomerId();
	public void setDataSource(DataSource dataSource);
}
