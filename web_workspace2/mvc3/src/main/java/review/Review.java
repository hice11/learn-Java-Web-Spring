package review;

public class Review {
	
	String title;
	String review;
	
	public Review() {
		// TODO Auto-generated constructor stub
	}

	public Review(String title, String review) {
		super();
		this.title = title;
		this.review = review;
	}

	public String getTitle() {
		return title;
	}

	public String getReview() {
		return review;
	}

	@Override
	public String toString() {
		return "Review [title=" + title + ", review=" + review + "]";
	}
	
	
	

}
