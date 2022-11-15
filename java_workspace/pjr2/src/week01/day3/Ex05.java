package week01.day3;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 매운맛 문제 2번
		
		int money;
		int code, time;
		String name;
		int pay=0;
		
		Scanner sc = new Scanner(System.in);
		name = sc.next();
		code = sc.nextInt();
		time = sc.nextInt();

		if( code ==1 ) {
			pay=2000;
		}else if( code  ==2) {
			pay =2500;
		}else if( code  ==3) {
			pay=3000;
		}else if( code ==4 ) {
			pay=4000;
		}		 
		money = pay* time;
		System.out.println (  name + "  " + money);

	}

}
