package week04.day2.arayListEx;

public class Ex05 {

	public static void main(String[] args) {

		//Wrapper 클래스
		//기본자료형을 객체타입으로 바꿔준다
		
		//auto boxing
		Integer i1 = new Integer(3);  // 이제 안쓴다는표시
		Integer i2 = 3;
		int sum2 = i1.intValue() + i2.intValue();
		
		//auto unboxing
		int sum = i1 + i2;
		
		System.out.println("sum2:"+sum2+" sum:"+sum);
		
		
		Object[] arrs= new Object[4]; //객체배열은 참조형변수의 집합
		// arrs[0] = new Integer(3); // AutoBoxing
		arrs[0]=3;
		arrs[1]="안녕";
		arrs[2]=2.5;
		arrs[3]=new Score( "홍길동" ,90,90); //배열순회, 배열 전체 조회할 때는 향상된 for문
		for( Object obj : arrs) {
			System.out.println(obj);
		}

		
		
		
	}

}
