package prjDay1;

public class Score {

	String name;
	int kor;
	int eng;
	int total;
	
	public Score(String name, int kor, int eng) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		total = kor + eng;
	}

	@Override
	public String toString() {
		return "Score [name:" + name + " kor:" + kor + " eng:" + eng + " total:" + total + "]";
	}

	
	
	
}
