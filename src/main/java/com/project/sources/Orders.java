package com.project.sources;

public class Orders {
	
<<<<<<< HEAD
	private int order_id;
=======
	private int orderId;
>>>>>>> b081504f224ac908549e36e80182b9a297b7b37f
	private int customerId;
	private String status;
	private double totalPrice;
	
	
	public Orders() {}


	public Orders(int orderId, int customerId, String status, double totalPrice) {
		super();
<<<<<<< HEAD
		this.order_id = order_id;
		this.customerId = customer_id;
=======
		this.orderId = orderId;
		this.customerId = customerId;
>>>>>>> b081504f224ac908549e36e80182b9a297b7b37f
		this.status = status;
		this.totalPrice = totalPrice;
	}


	public int getOrderId() {
		return orderId;
	}


	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

<<<<<<< HEAD
	public int getCustomer_id() {
		return getCustomerId();
	}
=======
>>>>>>> b081504f224ac908549e36e80182b9a297b7b37f

	public int getCustomerId() {
		return customerId;
	}

<<<<<<< HEAD
	public void setCustomer_id(int customer_id) {
		setCustomerId(customer_id);
	}

	public void setCustomerId(int customer_id) {
		this.customerId = customer_id;
=======

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
>>>>>>> b081504f224ac908549e36e80182b9a297b7b37f
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public double getTotalPrice() {
		return totalPrice;
	}


	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	
	
	

}

