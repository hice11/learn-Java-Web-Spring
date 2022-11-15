package week04.day3.myArrays;

public class Score2 implements Comparable{
	
	private String name;
	private int kor;
	private int eng;
	
	//생성자
	public Score2() {}

	public Score2(String name, int kor, int eng) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}


	@Override
	public String toString() {
		return "Score2 [name:" + name + " kor:" + kor + " eng:" + eng + "]";
	}

	@Override
	public int compareTo(Object o) {
		if(o instanceof Score2) {
			Score2 tmp = (Score2)o;
			return (this.eng-tmp.eng);
		}
		return 0;
	}
	
}
