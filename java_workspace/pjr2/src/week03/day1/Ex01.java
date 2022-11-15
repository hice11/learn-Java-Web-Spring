package week03.day1;

public class Ex01 {

	public static void main(String[] args) {
		
		
		int rtn;
		int su1=10, su2=20;
		rtn = mySum(su1, su2);  //call by value
		System.out.println(rtn);

	}

	public static int mySum(int su1, int su2) {
		return su1 + su2;
	}

}
