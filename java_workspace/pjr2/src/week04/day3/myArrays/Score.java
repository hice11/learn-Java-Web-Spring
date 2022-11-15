package week04.day3.myArrays;

public class Score implements MyComparable,Comparable{

	private String name;
	private int kor;
	private int eng;
	
	//생성자
	public Score() {}

	public Score(String name, int kor, int eng) {
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
		return "Score [name:" + name + " kor:" + kor + " eng:" + eng + "]";
	}

	@Override
	public int compareTo(Object obj) {
		if(obj instanceof Score) {
			Score tmp = (Score)obj;
			return (this.kor-tmp.kor);
		}
		return 0;
	}

	

	
	
	
}
