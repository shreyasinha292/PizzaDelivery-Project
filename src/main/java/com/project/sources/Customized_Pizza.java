package com.project.sources;

public class Customized_Pizza {
	private int cpId;
	private int itemId;
	
	public Customized_Pizza() {}

	public Customized_Pizza(int cpId, int itemId) {
		super();
		this.cpId = cpId;
		this.itemId = itemId;
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
