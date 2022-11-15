package ch;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Snack {
	public static void returns() {
		System.out.println("올바른 입력이 아닙니다.");
		snack();
	}
	
	public static void snack() {
		Scanner sc =new Scanner(System.in);

		String[] pop = {"고소팝콘(L)  ", "달콤팝콘(L)  ", "더블치즈팝콘(L)  " , "바질어니언팝콘(L)  " };
		String[] drink = {"탄산음료(L)  " , "아메리카노(HOT)  " , "아메리카노(ICE)  " };
		String[] snack = {"칠리치즈나쵸  ","플레인핫도그  ","칠리치즈핫도그  ","오징어(완제품)  "};

		int[] pop_p = {5000,6000,6000,6000,0};
		int[] drink_p={3000,3500,4000,0};
		int[] snack_p= {4900,4500,5000,3500,0};
		int su2 = 0, su4= 0, su6 = 0, pop_t=0, drink_t=0, snack_t=0;
		String result1="" , result2="", result3="";

		System.out.println("\n\n---------------------------팝콘---------------------------\n");
		for(int i=0; i<pop.length; i++) {
			System.out.print((i+1)+". "+pop[i]);
		}
		System.out.println("5.넘기기");
		System.out.println("   5000 	 6000	      6000	      6000");
		System.out.print("\n : ");
		int su1 = sc.nextInt();
		if(su1>=5 || su1<=0) {
			su1=5;
			System.out.print("");
		}else {
			System.out.print("\n 개수를 입력하세요: ");
			su2 = sc.nextInt();
			if(su2<=0) {
				returns();
			}
		}
		//
		System.out.println("\n\n---------------------------음료---------------------------\n");

		for(int i=0; i<drink.length; i++) {
			System.out.print((i+1)+". "+drink[i]);
		}
		System.out.println("4.넘기기");
		System.out.println("   3000 	 3500	         4000");
		System.out.print("\n : ");
		int su3 = sc.nextInt();

		if(su3>=4 || su3<=0) {
			su3=4;
			System.out.print("");
		}else {
			System.out.print("\n 개수를 입력하세요: ");
			su4 = sc.nextInt();
			if(su4<=0) {
				returns();
			}
		}
		//
		System.out.println("\n\n---------------------------스낵---------------------------\n");

		for(int i=0; i<snack.length; i++) {
			System.out.print((i+1)+". "+snack[i]);
		}
		System.out.println("5.넘기기");
		System.out.println("    4900 	 4500	      5000           3500");
		System.out.print("\n : ");
		int su5 = sc.nextInt();

		if(su5>=5 || su5<=0) {
			su5=5;
			System.out.print("");
		}else {
			System.out.print("\n 개수를 입력하세요: ");
			su6 = sc.nextInt();
			if(su6<=0) {
				returns();
			}
		}
		//


		pop_t = pop_p[su1-1]*su2;

		drink_t=drink_p[su3-1]*su4;

		snack_t=snack_p[su5-1]*su6;

		int tot = pop_t+drink_t+snack_t;
		System.out.println("\n"+tot+" 원입니다.");



		try {
			BufferedWriter receipt = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("영수증.txt"), "UTF8"));

			if(su1>=1&&su1<=4) {

				result1 = "\n  "+pop[su1-1] + su2 + "개 " + pop_t+" 원"+"\n";
			}
			if(su3>=1&&su3<=3) {

				result2 = "\n  " + drink[su3-1] + su4 +"개 " + drink_t+" 원"+"\n";
			}
			if(su5>=1&&su5<=3) {

				result3 = "\n  " + snack[su5-1] + su6 +"개 " + snack_t+" 원"+"\n";
			}
			receipt.write("\n--------- 영수증 ---------\n" + result1 + result2 + result3+ "\n------------------------\n\n  총 금액 : " + tot + " 원");
			receipt.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		Snack d = new Snack();
		d.snack();
	}
	
}
