package prjDay5.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test2 {

	public static void main(String[] args) 
			throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// 클래스객체얻어오기 , 클래스 정보를 담은 객체이다
		Class clazz1 = Class.forName("prjDay5.reflect.Member2");
		System.out.println("\n==========매개변수가 있는 생성자 정보로 객체생성하기=============\n");

		//클래스객체얻어오기 , 클래스 정보를 담은 객체이다
		Constructor constructor2 = clazz1.getDeclaredConstructor(String.class,String.class);
		//System.out.println("Constructor(String,String): " + constructor2.getName());

		Member2 m2 =(Member2) constructor2.newInstance("victoai","1234");
		System.out.println( m2 ); 
		m2.method2(3);
		System.out.println("\n==========클래스정보로 부터 매서드 정보가져오기==============\n");
		Method method2 = clazz1.getDeclaredMethod("method2", int.class);

		System.out.println( method2);	 
		System.out.println("\n==========클래스정보로 부터 매서드 정보가져온 다음 호출하기=============\n");

		//매소드를 객체를 이용하여 매소드 실제 실행, 호출, invoke
		method2.invoke( clazz1.getDeclaredConstructor().newInstance() ,6);
		System.out.println("///////////////////////////////////////////////////////////////////////");
		System.out.println("\n=======매소드를 객체를 이용하여 매소드 실제 호출, invoke==================\n");
		Method method1 = clazz1.getDeclaredMethod("printInfo");		
		System.out.println( method1);

		//매소드를 객체를 이용하여 매소드 실제 실행, 호출, invoke
		method1.invoke( clazz1.getDeclaredConstructor(String.class,String.class).newInstance("hong","5678") );
		System.out.println("\n=======클래스객체로 부터 필드정보 얻어오기====================\n");
		Field fields[] = clazz1.getDeclaredFields();
		for (Field field : fields) {
			System.out.println( field);
		}
	}


	
	
	
	
}
