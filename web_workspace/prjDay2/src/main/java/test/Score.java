package test;

public class Score {

	/*
	문제9)  다음은  성적을 처리를 위한  Score클래스이다
	학점을 구하는  char getGrade()매서드를 완성하시오
	생성자, toString을 완성하시오                               
	단, 평균은 소수이하는 무시되어도 상관없음
	(평균이 90이상이면 ‘A’, 80이상이면 ‘B’,  70이상이면 ‘C’ , 나머지 ‘F’)
	*/
	String name;
	int kor;
	int eng;
	char grade;
	
	public Score() { }
	public Score(String name, int kor, int eng) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.grade = getGrade(kor, eng);
	}
	
	public char getGrade(int kor, int eng) {
		int avg = (kor + eng)/2;
		if(avg>=90) return 'A';
		else if(avg>=80) return 'B';
		else if(avg>=70) return 'C';
		else return 'F';
	}
	@Override
	public String toString() {
		return "Q9Score [name:" + name + " kor:" + kor + " eng:" + eng + " grade:" + grade + "]";
	}



}
