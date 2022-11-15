package week02.day3;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		//배열로 관리하는 프로그램 (국어점수)
		// 1.등록 2.조회 3.삭제(-1) 4.변경 5.종료
		
		Scanner scanner = new Scanner(System.in);
		int[] kors = new int[10];
		int index=0;
		
		loop1: while(true) {
			
			System.out.print("1.등록 2.조회 3.삭제 4.변경 5.종료 > ");
			int menu=scanner.nextInt();
			switch(menu) {
			case 1:
				System.out.println("등록");
				System.out.print("수입력하세요 > ");
				int tmp= scanner.nextInt();
				kors[index]= tmp;	// kors[index++]=tmp; //한줄로 바꾸면
				index++;
				break;
			case 2:
				System.out.println("조회");
				
				for(int i=0; i<index; i++) {
					System.out.print(kors[i]+"\t");
				}
				System.out.println();
				break;
			case 3:
				System.out.println("삭제");
				
				for(int i=0; i<index; i++) {
					System.out.print(kors[i]+"\t");
				}
				System.out.println("\n삭제할 점수의 순번을 입력하세요");
				int delete = scanner.nextInt();
				kors[delete-1]=-1;
				System.out.println("삭제가 완료되었습니다");
				break;
			case 4:
				System.out.println("변경");
				System.out.println("점수는 다음과 같습니다.");
				for(int i=0; i<index; i++) {
					System.out.print(kors[i]+"\t");
				}
				System.out.print("\n변경할 점수의 순번을 입력하세요 > ");
				int update = scanner.nextInt(); // 1 2 3
				System.out.print("변경할 점수를 입력하세요 > ");
				int newKor = scanner.nextInt();
				kors[update-1]=newKor;
				System.out.println("변경이 완료되었습니다");
				break;
			case 5:
				System.out.println("종료");
				break loop1;
			}
			
		}
		
		
		////
	}

}
