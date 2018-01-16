package com.project.sources;

public class Orders {
	
	private int order_id;
	private int customer_id;
	private String status;
	private double total_price;
	
	public Orders() {}

	public Orders(int order_id, int customer_id, String status, double total_price) {
		super();
		this.order_id = order_id;
		this.customer_id = customer_id;
		this.status = status;
		this.total_price = total_price;
	}

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getTotal_price() {
		return total_price;
	}

	public void setTotal_price(double total_price) {
		this.total_price = total_price;
	}
	
	

}

