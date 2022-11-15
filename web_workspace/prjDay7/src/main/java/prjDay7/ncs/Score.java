package prjDay7.ncs;

public class Score implements Comparable<Score> {
	String name;
	int kor;
	int eng;
	char grade;
	public Score(String name, int kor, int eng) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}
	@Override
	public String toString() {
		return "Score [name=" + name + ", kor=" + kor + ", eng=" + eng + ", grade=" + grade + "]";
	}
	
	public char getGrade() {
		
		int total = kor+eng;
		double avg = total/2.0;
		if(avg>=90) grade = 'A'; 
		else if(avg>=80) grade = 'B';
		else if(avg>=70) grade = 'C';
		else grade = 'F';
		
		return grade;
	}
	
	@Override
	public int compareTo(Score o) {
		// TODO Auto-generated method stub
		//양수 -> 
		return this.kor - o.kor;
	}
	
}
