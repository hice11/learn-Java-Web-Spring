package week04.day5;

import java.io.Serializable;

public class Score implements Serializable, Comparable{

	String name;
	int kor;
	int eng;
	int tot;
	
	//생성자
	public Score(String name, int kor, int eng) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.tot = kor+eng;
	}
	public Score() {
		// TODO Auto-generated constructor stub
	}
	
	//toString
	@Override
	public String toString() {
		return "Score [name:" + name + " kor:" + kor + " eng:" + eng + " tot:" + tot + "]";
	}
	
	@Override
	public int compareTo(Object o) {
		return this.tot - ((Score)o).tot;
	}
	
	
	
}
