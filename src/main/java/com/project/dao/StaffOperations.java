package com.project.dao;

import javax.sql.DataSource;

import com.project.sources.Staff;

public interface StaffOperations {

	public void addStaff(Staff staff);
	
	public void deleteStaff(int staffId);
	
	public void changeStatus(int orderId);
	
	
	public void setDataSource(DataSource dataSource);
	
	//********** need to add a method to view the orders.
	
}
