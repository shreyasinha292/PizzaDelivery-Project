package com.project.sources;

public class CustomizedPizza {
	private int cpId;
	private int itemId;
	
	public CustomizedPizza() {}
	
	public CustomizedPizza(int cpId, int itemId) {
		super();
		this.cpId = cpId;
		this.itemId = itemId;
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
