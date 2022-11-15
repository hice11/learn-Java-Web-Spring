package ch;

import java.util.ArrayList;
import java.util.Scanner;

public class MovieProgram반복문수정 {

	// 예매 내역
	ArrayList<ReservationInfo> reList = new ArrayList<>();
	
	Scanner sc = new Scanner(System.in);
	
	// 생성자
	public MovieProgram반복문수정() { }
	
	// 프로그램 실행 메서드
	public void runMovieProgram() {
		//극장 배열 데이터 입력
		ScreenData.theaterArray();
		
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
			System.out.println("\n");

			switch(menu) {
			case 1 :
				movieReservation();	// 예매
				break;
			case 2 :
				showTheaterSeats(); // 좌석 현황
				break;
			case 3:
				show_ticket(); // 예매 내역
				break;
			case 4:
				cancel(); // 예매 취소
				break;
			case 5:
				break loop1; // 종료
			default :
				System.out.println("올바르게 입력하세요");
				//if(menu  ) throw new ExSwitch();
			}//switch
		}//while
	}//
	
	// 선택 메서드
	private int[] selectInput() {
		int a;
		int b;
		int c;
		int d;
		//극장 선택
		do {
			System.out.println();
			String[] theaters = {"압구정","왕십리","용산"};
			for (int i = 0; i < theaters.length; i++) {
				System.out.println( (i+1) + ". ["+theaters[i]+"]");
			}
			System.out.print("\n극장을 선택하세요: ");
			a = sc.nextInt(); 
		}while( a < 1 || 3 < a );
		//영화 선택
		do {
			System.out.println();
			for( int  i =0 ;  i< ScreenData.movies.length ; i++){
				System.out.println( (i+1)+ "."+ScreenData.movies[i]);
			}
			System.out.print("\n영화를 선택하세요: ");
			b = sc.nextInt(); 
		}while( b < 1 || 3 < b );
		//날짜 선택
		do {
			System.out.println();
			for( int  i =0 ;  i< ScreenData.dates.length ; i++){
				System.out.println( (i+1)+ "."+ScreenData.dates[i]);
			}
			System.out.print("\n날짜를 선택하세요: ");
			c = sc.nextInt(); 
		}while( c < 1 || 3 < c );
		//시간 선택 + 상영관 정보
		do {
			System.out.println();
			System.out.println("["+ScreenData.theaters[a-1][b-1][c-1][0].getTheaterName()+"]");
			for( int  i =0 ;  i< ScreenData.times.length ; i++){
				System.out.println( (i+1)+ "."+ScreenData.times[i]+ScreenData.theaters[a-1][b-1][c-1][i]);}
			System.out.print("\n시간을 선택하세요: ");
			d = sc.nextInt(); 
			System.out.println();
		}while( d < 1 || 3 < d );
		
		int[] selects = {a-1,b-1,c-1,d-1};
		return selects;
	}
	
	// 예매 메서드
	private void movieReservation() {
		System.out.println("--------------- 영화 예매 ---------------\n");
		
		int[] selects = selectInput();
		
		//극장 지정 // [극장별][영화별][날짜별][시간별]
		Theater theater = ScreenData.theaters[selects[0]][selects[1]][selects[2]][selects[3]];
		Seat[][] seats = ScreenData.theaters[selects[0]][selects[1]][selects[2]][selects[3]].getSeats();
		//좌석 현황 조회 메서드 호출
		seatStatus(theater);
		show_seats(theater);
		//좌석 선택
		System.out.print("열을 선택하세요: ");
		String strRow = sc.next();
		System.out.print("좌석 번호를 선택하세요: ");
		int seatNumber = sc.nextInt();
		//숫자로 변환
		char[] ch = strRow.toUpperCase().toCharArray();
		int tmp = (int)(ch[0]);
		int row = tmp - 65;
		//예매된 좌석 표시
		if ( seats[row][seatNumber-1].getSeat() != "X") {
			seats[row][seatNumber-1].setSeat("X");
			System.out.println("\n좌석을 예매했습니다.");
			seats[row][seatNumber-1].setSeatState(1);
			theater.setReservationSeats();
			reList.add(new ReservationInfo(ScreenData.movies[selects[1]], theater, ScreenData.dates[selects[2]], ScreenData.times[selects[3]], row, seatNumber));
		}else {
			System.out.println("이미 예매된 좌석입니다.");
		}

	}
	
	// 극장별 좌석 현황
	private void showTheaterSeats() {
		System.out.println("--------------- 좌석 현황 ---------------\n");
		
		int[] selects = selectInput();
		Theater theater = ScreenData.theaters[selects[0]][selects[1]][selects[2]][selects[3]];
		
		//좌석 현황 조회 메서드 호출
		seatStatus(theater); 
		show_seats(theater);
	}
	
	// 남은 좌석 표시
	private void seatStatus(Theater theater) {
		System.out.println("["+theater.getTheaterName()+"]");
		System.out.print("[남은 좌석 " + (theater.getTotSeats() - theater.getReservationSeats()) + "/" + theater.getTotSeats() +"] \n" );
	}
	
	// 좌석 현황 조회
	private void show_seats(Theater theater) {
		System.out.println("\n\t\t      SCREEN\n");
		for (int i = 0; i < theater.getSeats().length; i++) {
			System.out.print((char)(65+i)+"  ");
			for (int j = 0; j < theater.getSeats()[i].length; j++) {
				System.out.print(" ");
				System.out.printf("%2s" , theater.getSeats()[i][j].getSeat());
				if(j == 3 || j == theater.getSeats()[i].length-5) {
					System.out.print("    ");
				}//if
			}//for
			System.out.println();
		}//for
		System.out.println();
	}
	
	// 예매 내역 조회
	private void show_ticket() {
		System.out.println("----------------------- 예매 내역 ------------------------\n\n");
		for(int i=0; i<reList.size(); i++) {
			System.out.print(( i +1)+ ". ");
			reList.get(i).printInfo();
		}
	}
	
	// 예매 취소
	private void cancel() {
		int num;
		do {
			show_ticket();
			System.out.print("\n취소할 예매 건을 선택하세요: ");
			num = sc.nextInt();
		} while (num < 1 || num > reList.size());
		
		//극장 지정
		Seat[][] seats = reList.get(num-1).getTheater().getSeats();
		int row = reList.get(num-1).getRow();
		int seatNumber = reList.get(num-1).getSeatNumber();
		
		if ( seats[row][seatNumber-1].getSeat() == "X") {
			seats[row][seatNumber-1].setSeat(String.valueOf(seatNumber));
			System.out.println("예약을 취소했습니다.");
			seats[row][seatNumber-1].setSeatState(0);
			reList.get(num-1).getTheater().setReservationSeats();
		}
		reList.remove(num-1);
	}
	
	
	//Test
	public static void main(String[] args) {
		MovieProgram반복문수정 mProgram = new MovieProgram반복문수정();
		mProgram.runMovieProgram();

	}
	
}




