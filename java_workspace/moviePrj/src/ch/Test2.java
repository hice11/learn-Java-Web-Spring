package ch;

public class Test2 {

	public static void main(String[] args) {
		
		// 극장 객체
		Theater theater = ScreenData.theaters[0][0][0][0];
		Theater theater2 = ScreenData.theaters[0][0][0][1];
		Theater theater3 = ScreenData.theaters[0][0][0][2];
		

//		for (int i = 0; i < theater.getSeats().length; i++) {
//			System.out.print((char)(65+i)+" ");
//			for (int j = 0; j < theater.getSeats()[i].length; j++) {
//				System.out.print(theater.getSeats()[i][j].getSeat()+" ");
//			}
//			System.out.println();
//		}
		System.out.println();
		printTheater(theater);
		System.out.println();
		printTheater(theater2);
		System.out.println();
		printTheater(theater3);

		
		

	}
	
	
	public static void printTheater(Theater theater) {
		System.out.println("\n\t\t      SCREEN\n");
		for (int i = 0; i < theater.getSeats().length; i++) {
			System.out.print((char)(65+i)+"  ");
			for (int j = 0; j < theater.getSeats()[i].length; j++) {
				System.out.print(" ");
				System.out.printf("%2s" , theater.getSeats()[i][j].getSeat());
				if(j == 3 || j == theater.getSeats()[i].length-5) {
					System.out.print("    ");
				}
			}
			System.out.println();
		}
	}
	

}
