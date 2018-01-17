package com.project.dao;

import com.project.sources.Staff;

public interface StaffOperations {

	public void addStaff(Staff staff);
	
	public void deleteStaff(int staffId);
	
	public void changeStatus(int orderId);
	
	//********** need to add a method to view the orders.
	
}
