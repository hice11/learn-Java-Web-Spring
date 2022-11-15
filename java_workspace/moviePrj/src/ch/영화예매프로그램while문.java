package ch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 영화예매프로그램while문 {
	private int totalSeats;
	private int reservationSeats;
	private int row;
	private int seatNumber;
	private String strRow;
	
	ArrayList<ReservationInfo> reList = new ArrayList<>();

	char[] ch ;

	private String[][] seats =new String[][] {
		{"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16"},
		{"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16"},
		{"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16"},
		{"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16"},
		{"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16"},
		{"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16"},
		{"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16"},
		{"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16"}
	};

	public 영화예매프로그램while문() {}
	public 영화예매프로그램while문(int seatNumber) {
		this.seatNumber=seatNumber;
	}

	@Override
	public String toString() {
		return seatNumber+"번 좌석";
	}

	Scanner sc = new Scanner(System.in);

	ArrayList charr = new ArrayList();

	
	// 남은 좌석 표시
	public void seatStatus() {
		totalSeats = 0;
		for(int i=0; i<seats.length; i++) {
			totalSeats += seats[i].length;
		}
		System.out.print("[남은 좌석 " + (totalSeats-reservationSeats) + "/" + totalSeats +"] \n" );
	}

	
	// 좌석 현황 조회
	public void show_seats() {
		System.out.println("\n\t\t      SCREEN");
		System.out.println();
		for (int i=0; i<seats.length; i++) {
			for (int j=65+i; j<66+i; j++) {
				System.out.print((char)j);

			}
			System.out.print("  ");

			for(int j=0; j<seats[i].length; j++) {
				System.out.print(" ");
				System.out.printf("%2s" , seats[i][j]);
				if(j == 3 || j == 11) {
					System.out.print("    ");
				}
			}
			System.out.println();

		}
		System.out.println();
	}

	
	// 예매
	public void movieReservation() {

		int a;
		while(true) {
			System.out.println("영화를 선택하세요\n");
			for( int  i=0;  i < ScreenData.movies.length; i++){
				System.out.println(( i +1)+ "."+ScreenData.movies[i]);}
			a = sc.nextInt();			
			if( a <= ScreenData.movies.length )
				break;
			else {
				System.out.println("\n잘못 입력하셨습니다.\n");
			}
		}
		
		
		int b;
		// System.out.println( Arrays.toString(ScreenData.theaters)); 
		while(true) {
			System.out.println("극장을 선택하세요");
			for( int  i =0 ;  i< ScreenData.theaters.length ; i++){
				System.out.println(( i +1)+ "."+ScreenData.theaters[i]);}
			b = sc.nextInt();			
			if( b<= ScreenData.theaters.length )
				break;
			else {
				System.out.println("\n잘못 입력하셨습니다.\n");
			}
		}

		
		int c;
		while(true) {
			System.out.println("\n날짜를 선택하세요");
			for( int  i=0;  i < ScreenData.dates.length; i++){
				System.out.println(( i +1) + "." + ScreenData.dates[i]);}
			c = sc.nextInt();			
			if( c <= ScreenData.dates.length )
				break;
			else {
				System.out.println("\n잘못 입력하셨습니다.");
			}
		}
		
		
		int d;
		while(true) {
			System.out.println("\n시간을 선택하세요");
			for( int  i=0;  i < ScreenData.times.length; i++){
				System.out.println(( i +1) + "." + ScreenData.times[i]);}
			d = sc.nextInt();			
			if( d <= ScreenData.times.length )
				break;
			else {
				System.out.println("\n잘못 입력하셨습니다.");
			}
		}
		
		
		show_seats();
		seatStatus();
		System.out.println("열을 선택하세요");
		strRow = sc.next();
		System.out.println("좌석을 선택하세요");
		seatNumber = sc.nextInt();

		charr.add(strRow.toUpperCase());
		ch = strRow.toUpperCase().toCharArray();
		int tmp = (int)(ch[0]);
		row = tmp - 65;


		if ( seats[row][seatNumber-1] != "X") {
			seats[row][seatNumber-1] = "X";
			System.out.println("좌석을 예약했습니다.");
			reservationSeats++;
			//list.add(new 영화예매프로그램(seatNumber));
		}else {
			System.out.println("이미 예약된 좌석입니다.");
		}

		//reList.add(new ReservationInfo(ScreenData.movies[a-1], ScreenData.theaters[b-1], ScreenData.dates[c-1], ScreenData.times[d-1], row, seatNumber));
		
	}
	
	public void show_ticket() {
		System.out.println("\n\n----------------------- 예매 내역 ------------------------\n\n");
		for(int i=0; i<reList.size(); i++) {
			System.out.print(( i +1)+ ". ");
			reList.get(i).printInfo();
		}
	}

	public void cancel() {
		show_ticket();
		System.out.println("\n[취소할 예매 건을 선택해주세요]");
		int num = sc.nextInt();
		row = reList.get(num-1).getRow();
		seatNumber = reList.get(num-1).getSeatNumber();
		reList.remove(num-1);
		if ( seats[row][seatNumber-1] == "X") {
			seats[row][seatNumber-1] = String.valueOf(seatNumber);
			System.out.println("예약을 취소했습니다.");
			reservationSeats--;}
		
	}


	public void show_menu() {
		loop1: while(true) {
			String text = "\n\n ------------------- 영화관 예매 프로그램 -------------------\n\n";
			System.out.println(text);

			System.out.println("1. 영화 예매  ");
			System.out.println("2. 좌석 현황");
			System.out.println("3. 예매 내역");
			System.out.println("4. 예매 취소");
			System.out.println("5. 종료");
			System.out.println();
			System.out.print("선택하세요 : ");
			int menu = sc.nextInt();
			System.out.println();
			for(int i=0; i<text.length(); i++) {
				System.out.print("-");
			}
			System.out.println();

			switch(menu) {
			case 1 :
				movieReservation();	// 예매
				break;
			case 2 :
				show_seats();	// 좌석 현황 조회
				seatStatus();
				break;
			case 3:
				show_ticket();
				break;
			case 4:
				cancel();
				break;
			case 5:
				break loop1;
			default :
				System.out.println("올바르게 입력하세요");

			}
		}
		
	}
	
	public static void main(String[] args) {
		영화예매프로그램 d=new 영화예매프로그램();
		d.show_menu();
	}
}
