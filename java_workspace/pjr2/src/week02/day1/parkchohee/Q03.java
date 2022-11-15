package week02.day1.parkchohee;

import java.util.Scanner;

public class Q03 {
	
	public static void main(String[] args) {
		
		//문제3. 점수를 입력 받아  학점을 구하시오(  90이상 A 80이상 B   70이상 C  나머지 F)
		
		
		Scanner scanner = new Scanner(System.in);
		
		// 입력 자료
		int n;
		
		// 반복문
		while(true) {
			// 점수 입력
			System.out.print("점수를 입력하세요: ");
			n = scanner.nextInt();
			
			if(n>=90) {
				System.out.println("A 입니다");
			}
			else if(n>=80){
				System.out.println("B 입니다");
			}
			else if(n>=70){
				System.out.println("C 입니다");
			}
			else{
				System.out.println("F 입니다");
			}
			System.out.println();
		}
		
		
		///
	}

}
