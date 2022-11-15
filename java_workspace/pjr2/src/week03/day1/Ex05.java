package week03.day1;

public class Ex05 {

	public static void main(String[] args) {

		int cnt=0;
		
		cnt = addCount(cnt);	//1
		cnt = addCount(cnt);	//2
		cnt = addCount(cnt);	//3
		
		System.out.println(cnt);
	}

	public static int addCount(int a) {
		a++;
		return a;
	}

}
