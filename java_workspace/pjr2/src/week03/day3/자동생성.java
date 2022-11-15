package week03.day3;

public class 자동생성 {

	private int time;
	private String work;
	
	// Source > Generate Constructor using Field 사용
	public 자동생성(int time, String work) {
		super();
		this.time = time;
		this.work = work;
	}
	
	// Source > Generate Getters and Setters 사용
	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}
	
	
	
}
