package B조;

public class Movie {

	private String movieTitle;
	private int runningTime; //분
	
	public Movie() { }

	public Movie(String movieTitle, int runningTime) {
		this.movieTitle = movieTitle;
		this.runningTime = runningTime;
	}
	

	@Override
	public String toString() {
		return " [영화제목:" + movieTitle + ", 러닝타임:" + runningTime + "분]";
	}

	public String getMovieTitle() {
		return movieTitle;
	}

	public int getRunningTime() {
		return runningTime;
	}
	
	
}
