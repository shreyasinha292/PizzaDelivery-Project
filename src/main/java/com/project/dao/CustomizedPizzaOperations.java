package com.project.dao;

import java.util.List;

import javax.sql.DataSource;

public interface CustomizedPizzaOperations {
	
	public void addPizzaItems(List<String> cpList);
	public String sendCpId();
	
	public void setDataSource(DataSource dataSource);
}
