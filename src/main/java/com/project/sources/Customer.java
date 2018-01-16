package com.project.sources;

public class Customer {
	private int customer_id;
	private String name;
	private String username;
	private String contact;
	private String dob;
	private String password;
	private String address;
	private String review;
	private double rating;
	
	public Customer() {}
	
	
	public Customer(int customer_id, String name, String username, String contact, String dob, String password,
			String address, String review, double rating) {
		super();
		this.customer_id = customer_id;
		this.name = name;
		this.username = username;
		this.contact = contact;
		this.dob = dob;
		this.password = password;
		this.address = address;
		this.review = review;
		this.rating = rating;
	}


	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	
	
}
