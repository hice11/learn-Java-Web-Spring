package ch;

import java.util.ArrayList;
import java.util.Scanner;

public class 영화예매프로그램3 {
	//private int totalSeats;
	//private int reservationSeats;
	private int row;
	private int seatNumber;
	private String strRow;
	char[] ch ;
	
	private Seat[][] seats;
	
	ArrayList<ReservationInfo> reList = new ArrayList<>();

	

	public 영화예매프로그램3() {}
	public 영화예매프로그램3(int seatNumber) {
		this.seatNumber=seatNumber;
	}

	@Override
	public String toString() {
		return seatNumber+"번 좌석";
	}
	
	Scanner sc = new Scanner(System.in);

	ArrayList charr = new ArrayList();

	//극장별 좌석 현황
	public void showTheaterSeats() {
		System.out.println("영화를 선택하세요");
		for( int  i =0 ;  i< ScreenData.movies.length ; i++){
			System.out.println(( i +1)+ "."+ScreenData.movies[i]);}
		int a = sc.nextInt(); 

		System.out.println("날짜를 선택하세요");
		for( int  i =0 ;  i< ScreenData.dates.length ; i++){
			System.out.println(( i +1)+ "."+ScreenData.dates[i]);}
		int c = sc.nextInt(); 
				
		System.out.println("시간을 선택하세요");
		for( int  i =0 ;  i< ScreenData.times.length ; i++){
			System.out.println(( i +1)+ "."+ScreenData.times[i]);}
		int d = sc.nextInt(); 
		
		System.out.println("극장을 선택하세요");
		for( int  i =0 ;  i< ScreenData.theaters.length ; i++){
			System.out.println(( i +1)+ "."+ScreenData.theaters[d-1][i]);}
		int b = sc.nextInt(); 
		
		System.out.println();
		seatStatus(ScreenData.theaters[0][0][d-1][b-1]); // 좌석 현황 조회
		show_seats(ScreenData.theaters[0][0][d-1][b-1]);
		
	}
	// 남은 좌석 표시
	public void seatStatus(Theater theater) {
//		System.out.println("전: "+theater.getReservationSeats());
//		theater.setReservationSeats();
//		System.out.println("후: "+theater.getReservationSeats());
		System.out.println("["+theater.getTheaterName()+"]");
		System.out.print("[남은 좌석 " + (theater.getTotSeats() - theater.getReservationSeats()) + "/" + theater.getTotSeats() +"] \n" );
	}

	// 좌석 현황 조회
	public void show_seats(Theater theater) {
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
		System.out.println();
	}

	// 예매
	public void movieReservation() {
		System.out.println("영화를 선택하세요");
		for( int  i =0 ;  i< ScreenData.movies.length ; i++){
			System.out.println(( i +1)+ "."+ScreenData.movies[i]);}
		int a = sc.nextInt(); 

		System.out.println("날짜를 선택하세요");
		for( int  i =0 ;  i< ScreenData.dates.length ; i++){
			System.out.println(( i +1)+ "."+ScreenData.dates[i]);}
		int c = sc.nextInt(); 
						
		System.out.println("시간을 선택하세요");
		for( int  i =0 ;  i< ScreenData.times.length ; i++){
			System.out.println(( i +1)+ "."+ScreenData.times[i]);}
		int d = sc.nextInt(); 
		
		System.out.println("극장을 선택하세요");
		for( int  i =0 ;  i< ScreenData.theaters.length ; i++){
			System.out.println(( i +1)+ "."+ScreenData.theaters[d-1][i]);}
		int b = sc.nextInt(); 
		
		//극장 지정
		seats = ScreenData.theaters[0][0][d-1][b-1].getSeats();
		
		seatStatus(ScreenData.theaters[0][0][d-1][b-1]);
		show_seats(ScreenData.theaters[0][0][d-1][b-1]);
		System.out.println();
		System.out.println("열을 선택하세요");
		strRow = sc.next();
		System.out.println("좌석을 선택하세요");
		seatNumber = sc.nextInt();

		charr.add(strRow.toUpperCase());
		ch = strRow.toUpperCase().toCharArray();
		int tmp = (int)(ch[0]);
		row = tmp - 65;


		if ( seats[row][seatNumber-1].getSeat() != "X") {
			seats[row][seatNumber-1].setSeat("X");
			System.out.println("좌석을 예약했습니다.");
			seats[row][seatNumber-1].setSeatState(1);
			ScreenData.theaters[0][0][d-1][b-1].setReservationSeats();
		}else {
			System.out.println("이미 예약된 좌석입니다.");
		}

		reList.add(new ReservationInfo(ScreenData.movies[a-1], ScreenData.theaters[0][0][d-1][b-1], ScreenData.dates[c-1], ScreenData.times[d-1], row, seatNumber));
		
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
		//극장 지정
		seats = reList.get(num-1).getTheater().getSeats();
		
		row = reList.get(num-1).getRow();
		seatNumber = reList.get(num-1).getSeatNumber();
		
		
		if ( seats[row][seatNumber-1].getSeat() == "X") {
			seats[row][seatNumber-1].setSeat(String.valueOf(seatNumber));
			System.out.println("예약을 취소했습니다.");
			seats[row][seatNumber-1].setSeatState(0);
			reList.get(num-1).getTheater().setReservationSeats();
		}
		System.out.println(ScreenData.theaters[0][0][0][0].getReservationSeats());
		reList.remove(num-1);
		
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
				showTheaterSeats();
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
		영화예매프로그램3 d=new 영화예매프로그램3();
		d.show_menu();
	}
}
