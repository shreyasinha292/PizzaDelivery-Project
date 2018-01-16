package com.project.sources;

public class Customized_Pizza {
	private int cp_id;
	private int item_id;
	
	public Customized_Pizza() {}

	public Customized_Pizza(int cp_id, int item_id) {
		super();
		this.cp_id = cp_id;
		this.item_id = item_id;
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
