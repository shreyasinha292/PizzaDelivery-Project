package com.project.sources;

public class Cart {
	
	private int customeId;
	private int cartItemId;
	private int cpId;
	private int itemId;
	
	public Cart() {}

	public Cart(int customeId, int cartItemId, int cpId, int itemId) {
		super();
		this.customeId = customeId;
		this.cartItemId = cartItemId;
		this.cpId = cpId;
		this.itemId = itemId;
	}

	public int getCustomeId() {
		return customeId;
	}

	public void setCustomeId(int customeId) {
		this.customeId = customeId;
	}

	public int getCartItemId() {
		return cartItemId;
	}

	public void setCartItemId(int cartItemId) {
		this.cartItemId = cartItemId;
	}

	public int getCpId() {
		return cpId;
	}

	public void setCpId(int cpId) {
		this.cpId = cpId;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	
	
	
	

}
