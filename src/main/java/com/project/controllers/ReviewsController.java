package com.project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.dao.ReviewsDao;
import com.project.sources.Reviews;
@RestController
public class ReviewsController {
	
		@Autowired
		ReviewsDao reviewsDao;
		
		@PostMapping(value="/uikui")
		public void addTheReview(Reviews r) {
			reviewsDao.addReview(r);
		}
}
