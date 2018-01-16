package com.project.sources;

public class Cart {
	
	private int customer_id;
	private int cart_item_id;
	private int cp_id;
	private int item_id;
	
	public Cart() {}
	
	

	public Cart(int customer_id, int cart_item_id, int cp_id, int item_id) {
		super();
		this.customer_id = customer_id;
		this.cart_item_id = cart_item_id;
		this.cp_id = cp_id;
		this.item_id = item_id;
	}



	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public int getCart_item_id() {
		return cart_item_id;
	}

	public void setCart_item_id(int cart_item_id) {
		this.cart_item_id = cart_item_id;
	}

	public int getCp_id() {
		return cp_id;
	}

	public void setCp_id(int cp_id) {
		this.cp_id = cp_id;
	}

	public int getItem_id() {
		return item_id;
	}

	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}
	
	

}
