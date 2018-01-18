package com.project.controllers;


import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.dao.StaffOperations;
import com.project.sources.Staff;



@RestController
public class StaffController {

	@Autowired
	StaffOperations staffOperations;
	
	@PostMapping(value = "/iukiu")
	public void addTheStaff(Staff staff) {
	
		staffOperations.addStaff(staff);
	}
	
	@DeleteMapping(value = "/iuk/{staffId}")
	public void deleteTheStaff(@PathParam(value = "staffId") int staffId) {
		
		staffOperations.deleteStaff(staffId);
	}
	
	@PutMapping(value = "/kuikm/{orderId}")
	public void changeTheStatus(@PathParam(value = "orderId") int orderId) {

		staffOperations.changeStatus(orderId);
	}
	
}
