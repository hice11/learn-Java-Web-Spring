package prjDay7.test;

public class Q05 {

	public static void printGugudan() {
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.println(i+" x "+j+" = "+i*j);
			}
			System.out.println();
		}
	}
	
	
	
	public static void main(String[] args) {
		printGugudan();
	}

}
