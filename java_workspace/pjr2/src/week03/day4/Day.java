package week03.day4;

//복습
// 객체 : 한 개 => 자료형 class
public class Day {

	private String time;
	private String contents;
	
	public Day() {
		
	}
	
	public Day(String time, String contents) {
		this.time = time;
		this.contents = contents;
	}
	
	//
	public void printInfo() {
		System.out.println(time+":00"+" | "+contents);
	}
	
	//setter
	public void setTime(String time) {
		this.time = time;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	
	
	
	
	
}
