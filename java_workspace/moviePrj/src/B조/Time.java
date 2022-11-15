package B조;

public class Time {
	
	
	private String time;
	
	public Time() { }
	public Time(String time) {
		this.time = time;
	}


	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return " [시간: " + time + "]";
	}
	
	
	

}
