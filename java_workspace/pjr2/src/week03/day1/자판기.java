package week03.day1;


// 데이터 -> 변수 (멤버변수)
// 기능 -> 메소드 (멤버메소드)

//설계도
public class 자판기 {

	//멤버 변수
	private int 설탕;
	private int 프리마;
	private int 원두;
	private int 물;
	private int 매출금액;
	
	
	//생성자 (constructor) : 객체멤버변수 값의 초기화담당 메소드
	//생성자는 하나도 만들지 않으면 기본생성자를 제공한다
	//생성자이름 : 반드시 클래스명과 일치해야 함
	// 반환타입을 명시하면 안된다
	//생성자는 객체생성시 단 한번 호출되는 메소드이다
	//생성자를 만들면 기본생성자는 제공되지 않는다
	
	//기본생성자, 디폴트생성자
	public 자판기() {
		
	}
	//매개변수가 있는 생성자
	public 자판기(int 설탕,int 프리마,int 원두,int 물) {
		this.설탕 = 설탕;
		this.프리마 = 프리마;
		this.원두 = 원두;
		this.물 = 물;
	}
	
	//생성자 오버로딩 : 같은 이름의 생성자를 여러개 만드는 것
	
	
	//멤버 메소드 
	
	//멤버변수 출력하기
	public void printInfo() {
		System.out.println("<자판기 정보 출력>");
		System.out.println("설탕: "+설탕);
		System.out.println("프리마: "+프리마);
		System.out.println("원두: "+원두);
		System.out.println("물: "+물);
		System.out.println("매출금액: "+매출금액);
	}
	
	//멤버변수 값을 증가하기
	public void fillCoffee() {
		설탕+=100;
		프리마+=100;
		원두+=100;
		물+=1000;
	}
	
	//제공하는 기능
	public String 밀크커피만들기(int 돈) {
		
		if(돈==100) {
			System.out.println("밀크커피 만들기 시작...");
			설탕-=10;
			프리마-=10;
			원두-=20;
			물-=100;
			return "밀크커피";
		}
		
		return "";
	}
	
	public void initCoffee() {
		
	}
	
	
	
//	
}
