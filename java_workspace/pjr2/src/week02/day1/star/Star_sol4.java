package week02.day1.star;

public class Star_sol4 {

	public static void main(String[] args) {
		int count = 5 ;
		for (int i=1; i<=count; i++) {
			for (int j = 0 ; j<count-i; j++) {
				System.out.print(" ");}
			for (int k = 0; k<i; k++) {
				System.out.print("*");}
		System.out.println();
		}

	}

}
