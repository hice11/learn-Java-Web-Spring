package week04.day1;

public class Score {

	String name;
	int kor;
	int eng;
	int total;
	
	public Score() {}
	public Score(String name,int kor,int eng) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.total = this.kor + this.eng;
	}
	
	public String getInfo() {
		String result = "";
		result = name + " " + kor + " " + eng + " " + total;
		return result;
	}
	
	// 부모 Object의 오버라이드 
	@Override
	public String toString() {
		return name + " " + kor + " " + eng + " " + total;
	}

	
}
