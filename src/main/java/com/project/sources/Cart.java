package com.project.sources;

public class Cart {
	
	private int customerId;
	private int cartItemId;
	private int cpId;
	private int itemId;
	
	public Cart() {}
	
	

	public Cart(int customer_id, int cart_item_id, int cp_id, int item_id) {
		super();
		this.customerId = customer_id;
		this.cartItemId = cart_item_id;
		this.cpId = cp_id;
		this.itemId = item_id;
	}



	public int getCustomer_id() {
		return getCustomerId();
	}



	public int getCustomerId() {
		return customerId;
	}

	public void setCustomer_id(int customer_id) {
		setCustomerId(customer_id);
	}



	public void setCustomerId(int customer_id) {
		this.customerId = customer_id;
	}

	public int getCart_item_id() {
		return getCartItemId();
	}



	public int getCartItemId() {
		return cartItemId;
	}

	public void setCart_item_id(int cart_item_id) {
		setCartItemId(cart_item_id);
	}



	public void setCartItemId(int cart_item_id) {
		this.cartItemId = cart_item_id;
	}

	public int getCp_id() {
		return getCpId();
	}



	public int getCpId() {
		return cpId;
	}

	public void setCp_id(int cp_id) {
		setCpId(cp_id);
	}



	public void setCpId(int cp_id) {
		this.cpId = cp_id;
	}

	public int getItem_id() {
		return getItemId();
	}



	public int getItemId() {
		return itemId;
	}

	public void setItem_id(int item_id) {
		setItemId(item_id);
	}



	public void setItemId(int item_id) {
		this.itemId = item_id;
	}
	
	

}
