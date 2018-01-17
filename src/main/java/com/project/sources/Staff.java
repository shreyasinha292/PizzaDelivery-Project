package com.project.sources;

public class Staff {
	
	private int staffId;
	private String staffName;
	private String username;
	private String password;
	private String category;
	private String contact;
	
	public Staff() {}
	
	

	public Staff(int staffId, String staffName, String username, String password, String category, String contact) {
		super();
		this.staffId = staffId;
		this.staffName = staffName;
		this.username = username;
		this.password = password;
		this.category = category;
		this.contact = contact;
	}



	public int getStaffId() {
		return staffId;
	}

	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
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
