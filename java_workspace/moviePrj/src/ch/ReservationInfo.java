package ch;

// 예매 내역
public class ReservationInfo {
	
	private Movie movie;
	private Theater theater;
	private Date date;
	private Time time;
	
	//좌석 번호 행,열
	private int row;
	private int seatNumber;
	
	//랜덤 예매번호 부여
	int n1,n2,n3,n4;
	long reservationNumber;
	
	public ReservationInfo() { }

	public ReservationInfo(Movie movie, Theater theater, Date date, Time time, int row, int seatNumber) {
		this.movie = movie;
		this.theater = theater;
		this.date = date;
		this.time = time;
		this.row = row;
		this.seatNumber = seatNumber;
		
		//랜덤 예매번호 부여
		n1 = (int)(Math.random()*9999+1); //1 ~ 9999 사이
		n2 = (int)(Math.random()*9999+1); //1 ~ 9999 사이
		n3 = (int)(Math.random()*9999+1); //1 ~ 9999 사이
		n4 = (int)(Math.random()*999+1); //1 ~ 999 사이
		reservationNumber = (long)(n1*Math.pow(10, 11))+(long)(n2*Math.pow(10, 7))+(long)(n3*Math.pow(10, 3))+n4;
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

	//랜덤 예매번호
	public long getReservationNumber() {
		return reservationNumber;
	}
	
	
	
	
	
}
