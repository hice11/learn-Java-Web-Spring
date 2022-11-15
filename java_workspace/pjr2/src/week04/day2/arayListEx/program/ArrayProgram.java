package week04.day2.arayListEx.program;

import java.util.ArrayList;
import java.util.Scanner;

import week04.day2.arayListEx.Score;

public class ArrayProgram {
	
	ArrayList<Score> list = new ArrayList<>();
	
	
	public ArrayProgram() {	}
	
	
	public void run() {
		loop : while(true) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("[성적입력프로그램]\n[메뉴입력 1.등록 2.변경 3.삭제 4.조회 5.종료] > ");
			int menu = scanner.nextInt();
			switch (menu) {
			case 1:
				System.out.println("[등록]");
				addList();
				System.out.println("[등록완료]\n");
				break;
			case 2:
				System.out.println("[변경]");
				changeList();
				System.out.println("[변경완료]\n");
				break;
			case 3:
				System.out.println("[삭제]");
				removeList();
				System.out.println("[삭제완료]\n");
				break;
			case 4:
				System.out.println("[조회]");
				printList();
				break;
			case 5:
				System.out.println("[종료]");
				break loop;

			default:
				System.out.println("! [다시입력]");
				break;
			}
		}
		
	}
	
	private void addList() {
		Scanner scanner = new Scanner(System.in);
		System.out.print(" 이름 국어 영어\n>");
		String name = scanner.next();
		int kor = scanner.nextInt();
		int eng = scanner.nextInt();
		
		list.add(new Score(name, kor, eng));
	}
	
	private void changeList() {
		printList();
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("변경할 번호 입력 > ");
		int num = scanner.nextInt();
		System.out.print(" 이름 국어 영어\n>");
		String name = scanner.next();
		int kor = scanner.nextInt();
		int eng = scanner.nextInt();
		
		Score score = list.get(num-1);
		score.setName(name);
		score.setKor(kor);
		score.setEng(eng);
		score.calTotal();
	}
	
	private void removeList() {
		printList();

		Scanner scanner = new Scanner(System.in);
		System.out.print("삭제할 번호 입력 > ");
		int num = scanner.nextInt();
		
		list.remove(num-1);
	}
	
	public void printList() {
		for (int i = 0; i < list.size(); i++) {
			System.out.print("["+(i+1)+"번 ");
			list.get(i).printInfo();
			System.out.print("]\n");
		}
		System.out.println();
	}
	

}
