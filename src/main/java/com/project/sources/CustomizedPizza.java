package com.project.sources;

public class CustomizedPizza {
	private String cpId;
	private String itemId;
	
	public CustomizedPizza() {}
	
	public CustomizedPizza(String cpId, String itemId) {
		super();
		this.cpId = cpId;
		this.itemId = itemId;
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
