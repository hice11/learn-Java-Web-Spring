package week03.day5;

public class Score {
	
	private String name;
	private int kor;
	private int eng;
	private int total;
	
	//기본생성자는 생성자에서는 호출가능
	//생성자 호출할때 반드시 첫줄에 와야함
	public Score() {
		//this.name="ddd";
		//this.kor=50;
		//this.eng=50;
		this("ddd",50,50);
	}
	//생성자를 만들면 기본생성자는 제공되지 않는다
	public Score(String name, int kor, int eng) {
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.total=kor+eng;
	}
	/*
	*/
	
	public void printInfo() {
		System.out.println(name+" "+kor+" "+eng+" "+total);
	}
	
	
	

}
