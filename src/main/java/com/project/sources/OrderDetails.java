package com.project.sources;

public class OrderDetails {
	private int odId;
	private int orderId;
	private int itemId;
	private int cpId;
	private int quantity;
	private boolean isCP;
	
	

	public OrderDetails() {}

	public OrderDetails(int odId, int orderId, int itemId, int cpId, int quantity) {
		super();
		this.odId = odId;
		this.orderId = orderId;
		this.itemId = itemId;
		this.cpId = cpId;
		this.quantity = quantity;
	}

	public int getOdId() {
		return odId;
	}

	public void setOdId(int odId) {
		this.odId = odId;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	
	public boolean getisCP() {
		return isCP;
	}

	public void setCP(boolean isCP) {
		this.isCP = isCP;
	}

	public int getCpId() {
		return cpId;
	}

	public void setCpId(int cpId) {
		this.cpId = cpId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	

}
