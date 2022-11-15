package B조;

// 예매 내역
public class ReservationInfo {
	
	private Movie movie;
	private Theater theater;
	private Date date;
	private Time time;
	
	//좌석 번호 행,열
	private int row;
	private int seatNumber;
	
	public ReservationInfo() { }

	public ReservationInfo(Movie movie, Theater theater, Date date, Time time, int row, int seatNumber) {
		this.movie = movie;
		this.theater = theater;
		this.date = date;
		this.time = time;
		this.row = row;
		this.seatNumber = seatNumber;
	}

	@Override
	public String toString() {
		return "예매내역 [movie:" + movie + theater + date + time + " [" + (char)(row+65) + "열 " + seatNumber + "번 좌석]";
	}
	
	public void printInfo() {
		System.out.printf("[영화: %s] [극장: %s] [날짜: %s] [시간: %s] [%c열 %d번 좌석]%n",movie.getMovieTitle(),
				theater.getTheaterName(),date.getDateString(),time.getTime(),(char)(row+65),seatNumber);
	}
	public String printInfo2() {
		String string = "\n\n  영화: "+movie.getMovieTitle()+"\n\n  극장: "+theater.getTheaterName()
		+"\n\n  날짜: "+date.getDateString()+"\n\n  시간: "+time.getTime()+"\n\n  좌석: "+(char)(row+65)+"열 "+seatNumber+"번\n\n";
		return string;
	}

	public Movie getMovie() {
		return movie;
	}

	public Theater getTheater() {
		return theater;
	}

	public Date getDate() {
		return date;
	}

	public Time getTime() {
		return time;
	}

	public int getRow() {
		return row;
	}

	public int getSeatNumber() {
		return seatNumber;
	}
	
	
	
	
	
	
	
}
