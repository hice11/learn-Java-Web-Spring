package B조;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Snack {
	public static void returns() {

		snack();
	}

	public static void snack() {
		Scanner sc =new Scanner(System.in);

		String[] pop = {"고소팝콘(L)", "달콤팝콘(L)", "더블치즈팝콘(L)" , "바질어니언팝콘(L)" ,"팝콘"};
		String[] drink = {"탄산음료(L)" , "아메리카노(HOT)" , "아메리카노(ICE)" ,"음료"};
		String[] snack = {"칠리치즈나쵸","플레인핫도그","칠리치즈핫도그","오징어(완제품)","스낵"};

		int[] pop_p = {5000,6000,6000,6000,0};
		int[] drink_p={3000,3500,4000,0};
		int[] snack_p= {4900,4500,5000,3500,0};
		int su2 = 0, su4= 0, su6 = 0, pop_t=0, drink_t=0, snack_t=0, d=0;
		String result1="" , result2="", result3="";
		String prints="";


		System.out.println("\n\n---------------------------팝콘---------------------------\n");
		for(int i=0; i<pop.length-1; i++) {
			System.out.print((i+1)+". "+pop[i] + "  ");
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

			pop_t = pop_p[su1-1]*su2;
			System.out.println("\n현재 선택금액 : " + pop_t+ "원");

			if(su2<=0) {
				System.out.println("올바른 입력이 아닙니다.");
				returns();
			}
		}
		//
		System.out.println("\n\n---------------------------음료---------------------------\n");

		for(int i=0; i<drink.length-1; i++) {
			System.out.print((i+1)+". "+drink[i]+"  ");
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

			drink_t=drink_p[su3-1]*su4;
			int s_t=pop_t+drink_t;
			System.out.println("\n현재 선택금액 : " + s_t + "원");

			if(su4<=0) {
				System.out.println("올바른 입력이 아닙니다.");
				returns();
			}
		}
		//
		System.out.println("\n\n---------------------------스낵---------------------------\n");

		for(int i=0; i<snack.length-1; i++) {
			System.out.print((i+1)+". "+snack[i]+"  ");
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
				System.out.println("올바른 입력이 아닙니다.");
				returns();
			}
		}
		//
		snack_t=snack_p[su5-1]*su6;
		prints = "\n "+pop[su1-1] + " "+ su2 + "개 "   + drink[su3-1] + " "  + su4 +"개 " + snack[su5-1] + " " + su6 +"개 ";
		System.out.println(prints);

		int tot = pop_t+drink_t+snack_t;
		tot(pop_t,drink_t,snack_t);

		if(tot!=0) {
			System.out.println("\n1. 영수증 출력 2. 선택 메뉴 취소 3. 처음으로");
			d = sc.nextInt();
		}

		if(d==1) {
			receipt1(su1,su2,su3,su4,su5,su6,result1,result2,result3,pop,drink,snack,pop_t,drink_t,snack_t,tot);
		} else if (d==2) {

			System.out.println("\n1. "+pop[su1-1]+ " " + su2 + "개 2. " + drink[su3-1]+ " " + su4 +"개 3. " + snack[su5-1]+ " " + su6 +"개 ");
			int e = sc.nextInt();
			System.out.println("취소하실 개수를 입력하세요");
			int f = sc.nextInt();
			cancle(su1,su2,su3,su4,su5,su6,pop,drink,snack,e,f,pop_t,drink_t,snack_t,pop_p,drink_p,snack_p,prints);
			System.out.println("\n1. 영수증 출력  2. 처음으로");
			d = sc.nextInt();
			if ( d==1 ) {

				receipt2(su1,su2,su3,su4,su5,su6,result1,result2,result3,pop,drink,snack,pop_t,drink_t,snack_t,tot,e,f,pop_p,drink_p,snack_p);

			} else if (d==2) {
				returns();
			}
		}
		else if (d==3) {
			returns();
		}
	}

	public static void cancle(int su1, int su2, int su3, int su4, int su5, int su6,String[]pop, String[] drink, String[] snack, int e, int f, int pop_t, int drink_t, int snack_t, int[] pop_p, int[] drink_p, int[] snack_p, String prints) {
		if ( e==1 && f <=su2) {
			pop_t = (pop_p[su1-1])*(su2-f);
			if ((su2-f)!=0) {
				prints = "\n "+pop[su1-1] + " "+ (su2-f) + "개 "   + drink[su3-1] + " "  + su4 +"개 " + snack[su5-1] + " " + su6 +"개 ";
				System.out.println(prints);
			} else if ((su2-f)==0){
				prints = "\n "+ drink[su3-1] + " "  + su4 +"개 " + snack[su5-1] + " " + su6 +"개 ";
				System.out.println(prints);
			}
		} else if ( e==2 && f <=su4 ) {
			drink_t = (drink_p[su3-1])*(su4-f);
			if ((su4-f)!=0){
				prints = "\n "+pop[su1-1] + " "+ su2 + "개 "   + drink[su3-1] + " "  + (su4-f) +"개 " + snack[su5-1] + " " + su6 +"개 ";
				System.out.println(prints);
			} else if ((su4-f)==0) {
				prints = "\n "+pop[su1-1] + " "+ su2 + "개 "  + snack[su5-1] + " " + su6 +"개 ";
				System.out.println(prints);
			}
		} else if (e==3 && f <=su6) {
			snack_t = (snack_p[su5-1])*(su6-f);
			if ((su6-f)!=0) {
				prints = "\n "+pop[su1-1] + " "+ su2 + "개 "   + drink[su3-1] + " "  + su4 +"개 " + snack[su5-1] + " " + (su6-f) +"개 ";
				System.out.println(prints);
			} else if ((su6-f)==0){
				prints = "\n "+pop[su1-1] + " "+ su2 + "개 "   + drink[su3-1] + " "  + su4 +"개 ";
				System.out.println(prints);
			}
		} else {
			System.out.println("잘못된 입력입니다.");
			returns();
		}
		tot(pop_t,drink_t,snack_t);
	}

	public static void receipt1(int su1, int su2, int su3, int su4, int su5, int su6, String result1, String result2, String result3, String[]pop, String[] drink, String[] snack, int pop_t, int drink_t, int snack_t, int tot) {
		try {
			BufferedWriter receipt = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("영수증.txt"), "UTF8"));

			if(su1>=1&&su1<=4) {

				result1 = "\n  "+pop[su1-1] + su2 + "개 " + pop_t+" 원"+"\n";
			}
			if(su3>=1&&su3<=3) {

				result2 = "\n  " + drink[su3-1] + su4 +"개 " + drink_t+" 원"+"\n";
			}
			if(su5>=1&&su5<=4) {

				result3 = "\n  " + snack[su5-1] + su6 +"개 " + snack_t+" 원"+"\n";
			}
			receipt.write("\n--------- 영수증 ---------\n" + result1 + result2 + result3+ "\n------------------------\n\n  총 금액 : " + tot + " 원");
			receipt.close();
		} catch (IOException e) {

			e.printStackTrace();
		}
		System.out.println("영수증이 출력되었습니다.");
	}

	public static void receipt2(int su1, int su2, int su3, int su4, int su5, int su6, String result1, String result2, String result3, String[]pop, String[] drink, String[] snack, int pop_t, int drink_t, int snack_t, int tot, int e, int f , int[] pop_p, int[] drink_p, int[] snack_p) {
		try {
			BufferedWriter receipt = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("영수증.txt"), "UTF8"));

			if(su1>=1&&su1<=4) {
				pop_t = pop_p[su1-1]*su2;
				result1 = "\n  "+pop[su1-1] + su2 + "개 " + pop_t+" 원"+"\n";

				if ( e==1) {
					pop_t = pop_p[su1-1]*(su2-f);
					result1 = "\n  "+pop[su1-1] + (su2-f) + "개 " + pop_t+" 원"+"\n";

				}
			}
			if(su3>=1&&su3<=3) {
				drink_t = drink_p[su3-1]*su4;
				result2 = "\n  " + drink[su3-1] + su4 +"개 " + drink_t+" 원"+"\n";

				if(e==2) {
					drink_t = drink_p[su3-1]*(su4-f);
					result2 = "\n  " + drink[su3-1] + (su4-f) +"개 " + drink_t+" 원"+"\n";

				}
			}
			if(su5>=1&&su5<=4) {
				snack_t = snack_p[su5-1]*su6;
				result3 = "\n  " + snack[su5-1] + su6 +"개 " + snack_t+" 원"+"\n";

				if(e==3) {
					snack_t = snack_p[su5-1]*(su6-f);
					result3 = "\n  " + snack[su5-1] + (su6-f) +"개 " + snack_t+" 원"+"\n";

				}
			}
			tot=pop_t+drink_t+snack_t;
			receipt.write("\n--------- 영수증 ---------\n" + result1 + result2 + result3+ "\n------------------------\n\n  총 금액 : " + tot + " 원");
			receipt.close();
		} catch (Exception b) {

			b.printStackTrace();
		}
		System.out.println("영수증이 출력되었습니다.");
	}

	public static void tot( int pop, int drink, int snack) {
		int tot = pop+drink+snack;
		System.out.println("\n 총 금액 : "+tot+" 원입니다.");
	}

	// Test
	public static void main(String[] args) {
		Snack d = new Snack();
		d.snack();
	}
}
