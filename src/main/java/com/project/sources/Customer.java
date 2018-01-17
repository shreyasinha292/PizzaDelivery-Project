package com.project.sources;

public class Customer {
	private int customerId;
	private String name;
	//private String username;
	private String contact;
	private String address;
	
	public Customer() {}
	
	
	public Customer(int customer_id, String name,String contact,
			String address) {
		super();
		this.customerId = customer_id;
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
