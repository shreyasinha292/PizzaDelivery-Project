package com.project.sources;

public class Customer {
	private int customerId;
	private String name;
	//private String username;
	private String contact;
	private String address;
	
	public Customer() {}
	
	
<<<<<<< HEAD
	public Customer(int customer_id, String name,String contact,
			String address) {
		super();
		this.customerId = customer_id;
=======
	public Customer(int customerId, String name, String username, String contact, String dob, String password,
			String address, String review, double rating) {
		super();
		this.customerId = customerId;
>>>>>>> b081504f224ac908549e36e80182b9a297b7b37f
		this.name = name;
		this.contact = contact;
		this.address = address;
		
	}


	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customer_id) {
		this.customerId = customer_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
