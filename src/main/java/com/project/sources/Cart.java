package com.project.sources;

public class Cart {
	
	private int customeId;
	private int cartItemId;
	private String cpId;
	private String itemId;
	
	public Cart() {}

	public Cart(int customeId, int cartItemId, String cpId, String itemId) {
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

	public String getCpId() {
		return cpId;
	}

	public void setCpId(String cpId) {
		this.cpId = cpId;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	
	
	
	

}
