package com.project.dao;

import javax.sql.DataSource;

import com.project.sources.Registered_Customers;

public interface RegisteredCustomerDao {
	
	public void addRegisteredCustomer(Registered_Customers rc);
	
	public void setDataSource(DataSource dataSource);
	
}
