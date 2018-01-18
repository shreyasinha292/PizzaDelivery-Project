package com.project.dao;

import java.util.List;

import javax.sql.DataSource;

import com.project.sources.Reviews;

public interface ReviewsDao {
	
	public void addReview(Reviews r);
	
	public List<Reviews> getAllReviews();
	
	public void setDataSource(DataSource dataSource);
}
