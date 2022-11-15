package prjDay5.reflect;

public class ReflectTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		Member m = new Member();
		System.out.println(m);
		m.method();
		
		//클래스 정보로 객체 생성 가능
		Class clazz1 = Class.forName("prjDay5.Member"); //클래스정보
		Member m2 = (Member)clazz1.newInstance(); // 기본생성자
		
		System.out.println(m2);
		m2.method();
	}
	
	
}
