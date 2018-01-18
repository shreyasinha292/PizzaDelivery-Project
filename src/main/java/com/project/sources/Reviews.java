package com.project.sources;

public class Reviews {
	private int review_id;
	private int cutomer_id;
	private double rating;
	private String review;
	
	public Reviews() {}

	public Reviews(int review_id, int cutomer_id, double rating, String review) {
		super();
		this.review_id = review_id;
		this.cutomer_id = cutomer_id;
		this.rating = rating;
		this.review = review;
	}

	public int getReview_id() {
		return review_id;
	}

	public void setReview_id(int review_id) {
		this.review_id = review_id;
	}

	public int getCutomer_id() {
		return cutomer_id;
	}

	public void setCutomer_id(int cutomer_id) {
		this.cutomer_id = cutomer_id;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	
}
