package com.project.controllers;


import javax.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;


import com.project.dao.StaffImpl;
import com.project.sources.Staff;



@RestController
public class StaffController {

	@Autowired
	StaffImpl staffimpl;
	
	@PostMapping(value = "/")
	public void addTheStaff(Staff staff) {
	
		staffimpl.addStaff(staff);
	}
	
	@DeleteMapping(value = "/{staffId}")
	public void deleteTheStaff(@PathParam(value = "staffId") int staffId) {
		
		staffimpl.deleteStaff(staffId);
	}
	
	@PutMapping(value = "/{orderId}")
	public void changeTheStatus(@PathParam(value = "orderId") int orderId) {

		staffimpl.changeStatus(orderId);
	}
	
}
