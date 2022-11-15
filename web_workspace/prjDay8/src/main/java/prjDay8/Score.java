package prjDay8;

public class Score implements Comparable<Score> {

	String name;
	int kor;
	int eng;
	char grade;
	
	public Score() {}

	public Score(String name, int kor, int eng) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		calcGrade();
	}

	private void calcGrade() {
		int total = kor + eng;
		double avg = total/2.0;
		if(avg>=90) {
			grade='A';
		}else if(avg>=80) {
			grade='B';
		}else if(avg>=70) {
			grade='B';
		}else {
			grade='F';
		}
	}
	
	
	
	@Override
	public String toString() {
		return "Score [name:" + name + " kor:" + kor + " eng:" + eng + " grade:" + grade + "]";
	}

	@Override
	public int compareTo(Score o) {
		// TODO Auto-generated method stub
		return this.kor - o.kor;
	}
	
	
	
}
