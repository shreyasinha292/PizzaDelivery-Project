package com.project.sources;

public class Orders {
	
	private int orderId;
	private int customerId;
	private String status;
	private double totalPrice;
	private String orderAddress;
	
	public Orders() {}



	public Orders(int orderId, int customerId, String status, double totalPrice, String orderAddress) {
		super();
		this.orderId = orderId;
		this.customerId = customerId;
		this.status = status;
		this.totalPrice = totalPrice;
		this.orderAddress = orderAddress;
	}



	public String getOrderAddress() {
		return orderAddress;
	}


	public void setOrderAddress(String orderAddress) {
		this.orderAddress = orderAddress;
	}

	public int getOrderId() {
		return orderId;
	}


	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}


	public int getCustomerId() {
		return customerId;
	}


	public void setCustomerId(int customerId) {
		this.customerId = customerId;
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

