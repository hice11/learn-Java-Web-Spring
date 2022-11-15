package model;

import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class ReviewService {

	ReviewDao dao;
	public ReviewService() {
		// TODO Auto-generated constructor stub
	}
	public ReviewService(ReviewDao dao) {
		this.dao = dao;
	}
	// setter를 통해서 dao 주입 (injection)
	public void setRDao(ReviewDao dao) {
		this.dao = dao;
	}
	
	//JSON으로 데이터 담기
	public String getReviews() {
		ArrayList<Review> reviews = dao.selectReviews();
		
		JSONArray jArray = new JSONArray();
		for(Review review : reviews) {
			JSONObject json = new JSONObject();
			json.put("title", review.getTitle());
			json.put("review", review.getReview());
			jArray.add(json);
		}
		JSONObject result = new JSONObject();
		result.put("result", jArray);
		
		return result.toString();
	}
	
	public static void main(String[] args) {
		ReviewService rs = new ReviewService();
		rs.setRDao(new ReviewDao());
		String reviews = rs.getReviews();
		System.out.println(reviews);
	}
	
}
