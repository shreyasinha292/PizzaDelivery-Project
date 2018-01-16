package com.project.sources;

public class Menu {
	private int item_id;
	private String item_name;
	private String category;
	private int availability;
	private double small_price;
	private double medium_price;
	private double large_price;
	
	public Menu() {}

	public Menu(int item_id, String item_name, String category, int availability, double small_price,
			double medium_price, double large_price) {
		super();
		this.item_id = item_id;
		this.item_name = item_name;
		this.category = category;
		this.availability = availability;
		this.small_price = small_price;
		this.medium_price = medium_price;
		this.large_price = large_price;
	}

	public int getItem_id() {
		return item_id;
	}

	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}

	public String getItem_name() {
		return item_name;
	}

	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getAvailability() {
		return availability;
	}

	public void setAvailability(int availability) {
		this.availability = availability;
	}

	public double getSmall_price() {
		return small_price;
	}

	public void setSmall_price(double small_price) {
		this.small_price = small_price;
	}

	public double getMedium_price() {
		return medium_price;
	}

	public void setMedium_price(double medium_price) {
		this.medium_price = medium_price;
	}

	public double getLarge_price() {
		return large_price;
	}

	public void setLarge_price(double large_price) {
		this.large_price = large_price;
	}
	
	
	
}
