package week04.day1;

public class Score2 {

	String name;
	int kor;
	int eng;
	int total;
	
	public Score2() {}
	public Score2(String name,int kor,int eng) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.total = this.kor + this.eng;
	}
	
	@Override
	public String toString() {
		String result ="";
		result = name+" "+kor+" "+eng+" "+total;
		return result;
	}
	public void print() {
		System.out.println(name+" "+kor+" "+eng+" "+total);
	}
	
	
}
