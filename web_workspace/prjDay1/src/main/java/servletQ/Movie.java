package servletQ;

public class Movie {

	String title;
	String director;
	int runningtime;
	String genre;
	
	public Movie(String title, String director, int runningtime, String genre) {
		this.title = title;
		this.director = director;
		this.runningtime = runningtime;
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "제목 : " + title + "<br>감독 : " + director + "<br>러닝타임 : " + runningtime + "분<br>장르 : " + genre;
	}
	
	
	
}
