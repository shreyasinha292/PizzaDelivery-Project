package com.project.dao;

import com.project.sources.Customer;
import com.project.sources.Registered_Customers;

public interface CustomerDao {
	public void addCustomer(String name,String contact,String address);
	public void deleteCustomer(int customerId);
	public void updateCustomer(String contact,String address,int customerId);
	public int isValidUser(Registered_Customers rc);
	public int sendCustomerId();

}
