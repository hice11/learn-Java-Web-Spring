package B조;

public class Seat {

	private String seat;
	private int seatState; //0은 예매 안됨, 1은 예매 상태
	
	public Seat() {	
		seat = "";
		seatState = 0;
	}

	public String getSeat() {
		return seat;
	}

	public void setSeat(String seat) {
		this.seat = seat;
	}

	public int getSeatState() {
		return seatState;
	}

	public void setSeatState(int seatState) {
		this.seatState = seatState;
	}

	
	
	
}
