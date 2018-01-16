package com.project.sources;

public class Staff {
	
	private int staff_id;
	private String staff_name;
	private String username;
	private String password;
	private String category;
	private String contact;
	
	public Staff() {}

	public Staff(int staff_id, String staff_name, String username, String password, String category, String contact) {
		super();
		this.staff_id = staff_id;
		this.staff_name = staff_name;
		this.username = username;
		this.password = password;
		this.category = category;
		this.contact = contact;
	}

	public int getStaff_id() {
		return staff_id;
	}

	public void setStaff_id(int staff_id) {
		this.staff_id = staff_id;
	}

	public String getStaff_name() {
		return staff_name;
	}

	public void setStaff_name(String staff_name) {
		this.staff_name = staff_name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	

}
