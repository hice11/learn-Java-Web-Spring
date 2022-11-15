package ch;

import java.util.Scanner;

public class 영화예매프로그램 {
	private int totalSeats;
	private int reservationSeats;
	private int row;
	private int seatNumber;
	private String strRow;
	private String[][] seats = new String[][] {
		{"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16"},
		{"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16"},
		{"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16"},
		{"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16"},
		{"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16"},
		{"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16"},
		{"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16"},
		{"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16"}
		};
	
	ScreenData sData = new ScreenData();
		
		
		
	Scanner sc = new Scanner(System.in);
	
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
				//System.out.print(seats[i][j]);
				
				if(j == 3 || j == 11) {
					System.out.print("    ");
				}
			}
			System.out.println();
		}
	}
	
	// 예매
	public void movieReservation() {
		System.out.println("영화를 선택하세요");
		int a = sc.nextInt(); //임시
		System.out.println("극장을 선택하세요");
		int b = sc.nextInt(); //임시
		System.out.println("시간을 선택하세요");
		int c = sc.nextInt(); //임시
		show_seats();
		seatStatus();
		System.out.println("열을 선택하세요");
		strRow = sc.next();
		System.out.println("좌석을 선택하세요");
		seatNumber = sc.nextInt();
		/*
		switch(strRow) {
		case "A":
		case "a":
			row=0;
			break;
		case "B":
		case "b":
			row=1;
			break;
		case "C":
		case "c":
			row=2;
			break;
		case "D":
		case "d":
			row=3;
			break;
		case "E":
		case "e":
			row=4;
			break;
		case "F":
		case "f":
			row=5;
			break;
		case "G":
		case "g":
			row=6;
			break;
		case "H":
		case "h":
			row=7;
			break;
		}
		*/
		char[] ch = strRow.toUpperCase().toCharArray();
		int tmp = (int)(ch[0]);
		row = tmp - 65;
		
		if ( seats[row][seatNumber-1] != "X") {
			seats[row][seatNumber-1] = "X";
			System.out.println("좌석을 예약했습니다.");
			reservationSeats++;
		}else {
			System.out.println("이미 예약된 좌석입니다.");
		}
		
	}
	
	
	
	public void show_menu() {
		loop1: while(true) {
			String text = "\n\n ------------------- 영화관 예매 프로그램 -------------------\n\n";
			System.out.println(text);
		
			System.out.println("1. 영화 예매  ");
			System.out.println("2. 좌석 현황");
			System.out.println("3. 예매 취소");
			System.out.println("4. 종료");
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
				seatStatus();
				show_seats();	// 좌석 현황 조회
				break;
			case 3:
				break;
			case 4:
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

