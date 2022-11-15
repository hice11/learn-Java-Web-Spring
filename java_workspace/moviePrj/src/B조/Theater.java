package B조;

import java.util.Arrays;

public class Theater {

	private String theaterName;
	private Seat[][] seats;
	private int totSeats;
	private int reservationSeats;
	
	
	public Theater() { }
	public Theater(String theaterName, int a, int b) {
		this.theaterName = theaterName;
		this.seats = new Seat[a][b];
		for (int i = 0; i < seats.length; i++) {
			int cnt=0;
			for (int j = 0; j < seats[i].length; j++) {
				cnt++;
				seats[i][j] = new Seat();
				seats[i][j].setSeat(Integer.toString(cnt));
			}
		}
		this.totSeats = seats.length * seats[0].length;
		reservationSeats = 0;
	}
	

	public Seat[][] getSeats() {
		return seats;
	}
	
	public String getTheaterName() {
		return theaterName;
	}
	
	public int getTotSeats() {
		return totSeats;
	}
	public int getReservationSeats() {
		return reservationSeats;
	}
	public void setReservationSeats() {
		reservationSeats=0;
		for (int i = 0; i < seats.length; i++) {
			for (int j = 0; j < seats[i].length; j++) {
				reservationSeats += seats[i][j].getSeatState();
			}
		}
	}
	
	@Override
	public String toString() {
		return " [" + (totSeats-reservationSeats) + "/" + totSeats
				+ "]";
	}

	
	
	
}
