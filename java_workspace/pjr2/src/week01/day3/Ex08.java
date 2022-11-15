package week01.day3;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int code, t;
		String name;
		
		int pay;
		Scanner sc = new Scanner(System.in);
		
		code= sc.nextInt();
		t = sc.nextInt();
		name = sc.next();
		
		if(code==1) {
			pay = t*2000;
		}else if(code==2) {
			pay = t*2500;
		}else if(code==2) {
			pay = t*3000;
		}else {
			pay = t*3500;
		}
		System.out.println("pay " + pay);
		
		//
	}

}
