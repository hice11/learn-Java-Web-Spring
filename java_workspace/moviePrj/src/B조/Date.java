package B조;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Date {

	private Calendar calendar  = Calendar.getInstance();
	private SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
	private String dateString;
	
	public Date() { 
		dateString = sf.format(calendar.getTime());
	}
	public Date(int year, int month, int day) {
		calendar.set(year, month-1, day);
		dateString = sf.format(calendar.getTime());
	}


	public String getDateString() {
		return dateString;
	}
	public void setDateString(int year, int month, int day) {
		calendar.set(year, month-1, day);
		dateString = sf.format(calendar.getTime());
	}
	
	@Override
	public String toString() {
		return " [날짜: " + dateString + "]";
	}
	
	
	
	
}
