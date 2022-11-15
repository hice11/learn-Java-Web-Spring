package prjDay7.ncs;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//전체구구단 출력
		printGuGuDan();
		
	}////

	private static void printGuGuDan() {
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i+"*"+j+"="+(i*j));
			}
		}
	}
}
