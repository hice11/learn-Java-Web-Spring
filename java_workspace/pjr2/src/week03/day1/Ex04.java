package week03.day1;

public class Ex04 {

	public static void main(String[] args) {

		int cnt=0;
		
		addCount(cnt);	//0
		addCount(cnt);	//0
		addCount(cnt);	//0
		System.out.println(cnt);
		
	}

	public static void addCount(int a) {
		a=a+1;
	}

}
