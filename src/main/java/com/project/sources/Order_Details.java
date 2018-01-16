package com.project.sources;

public class Order_Details {
	private int od_id;
	private int order_id;
	private int item_id;
	private int cp_id;
	private int quantity;
	
	public Order_Details() {}

	public Order_Details(int od_id, int order_id, int item_id, int cp_id, int quantity) {
		super();
		this.od_id = od_id;
		this.order_id = order_id;
		this.item_id = item_id;
		this.cp_id = cp_id;
		this.quantity = quantity;
	}

	public int getOd_id() {
		return od_id;
	}

	public void setOd_id(int od_id) {
		this.od_id = od_id;
	}

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public int getItem_id() {
		return item_id;
	}

	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}

	public int getCp_id() {
		return cp_id;
	}

	public void setCp_id(int cp_id) {
		this.cp_id = cp_id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	
	

}
