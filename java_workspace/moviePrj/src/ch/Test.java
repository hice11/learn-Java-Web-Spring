package ch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Test {

	public static void main(String[] args) {
		
		/*
		String[][] seats = new String[10][15];
		
		for (int i = 0; i < seats.length; i++) {
			for (int j = 0; j < seats[i].length; j++) {
				seats[i][j] = "□";
			}
		}
		
		seats[2][1]="■";
		
		*/
		// 극장 객체
		Theater theater = new Theater("용산", 10, 15);
		
		for (int i = 0; i < theater.getSeats().length; i++) {
			System.out.print((char)(65+i)+" ");
			for (int j = 0; j < theater.getSeats()[i].length; j++) {
				System.out.print(theater.getSeats()[i][j].getSeat()+" ");
			}
			System.out.println();
		}
		
		// 날짜 객체
		Date date = new Date(2022,10,13);
		System.out.println(date.getDateString());
		
		//스크린 데이터
		ScreenData screenData = new ScreenData();
		System.out.println(ScreenData.movies[0]);
		System.out.println(ScreenData.theaters[0][0][0][0]);
		System.out.println(ScreenData.dates[0]);
		System.out.println(ScreenData.times[0]);
		
		System.out.println((int)'B');
		
		
		String strRow = "c";
		char[] ch = strRow.toUpperCase().toCharArray();
		int tmp = (int)(ch[0]);
		int row = tmp - 65;
		System.out.println(row);
		
		int a = 16;
		System.out.println(Integer.toString(a));
		
		ArrayList<ReservationInfo> reList = new ArrayList<>();
		reList.add(new ReservationInfo(ScreenData.movies[0], ScreenData.theaters[0][0][0][0], ScreenData.dates[0], ScreenData.times[0], 5, 6));
		reList.add(new ReservationInfo(ScreenData.movies[1], ScreenData.theaters[0][0][0][1], ScreenData.dates[1], ScreenData.times[1], 7, 20));
		
		System.out.println("[예매내역]");
		reList.get(0).printInfo();
		reList.get(1).printInfo();
		reList.remove(0);
		System.out.println("==삭제후==");
		reList.get(0).printInfo();
		
		
		
	////
	}

}
