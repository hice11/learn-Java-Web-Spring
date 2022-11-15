package week03.day1;

public class 자판기2 {

	
	//멤버변수 private으로
	private int 설탕;
	private int 프리마;
	private int 원두;
	private int 물;
	private int 매출금액;
	
	//생성자 (멤버변수 초기화)
	public 자판기2(int 초기물,int 초기원두,int 초기설탕,int 초기프리마){
		물 = 초기물;
		원두 = 초기원두;
		설탕 = 초기설탕;
		프리마 = 초기프리마;
	}
	
	//멤버메서드 public으로
	
	// 현재 커피정보 출력
	public void printInfo() {
		System.out.println("<현재 커피 정보>");
		System.out.println("매출금액: "+매출금액);
		System.out.println("물: "+물);
		System.out.println("원두: "+원두);
		System.out.println("설탕: "+설탕);
		System.out.println("프리마: "+프리마);
		System.out.println();
	}
	
	//추가로 채우기
	public void fillCoffee() {
		물 += 1000;
		원두 += 100;
		설탕 += 100;
		프리마 += 100;
	}
	
	//밀크커피만들기
	public String milkCoffee(int 돈) {
		if(돈==100) {
			물 -= 100;
			원두 -= 10;
			설탕 -= 20;
			프리마 -= 10;
			매출금액 += 100;
			return "======\n밀크커피\n======\n";
		}else if(돈>100) {
			물 -= 100;
			원두 -= 10;
			설탕 -= 20;
			프리마 -= 10;
			매출금액 += 100;
			int 거스름돈=돈-100;
			String change = "======\n밀크커피\n거스름돈은 "+거스름돈+"원 입니다.\n======\n";
			return change;
		}
		return "======\n잔액이 부족합니다.\n=====\n";
	}
	
	
}
