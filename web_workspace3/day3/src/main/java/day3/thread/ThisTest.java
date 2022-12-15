package day3.thread;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ThisTest {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {


		Cat cat = new Cat("뽀삐" ,3);		
		cat.disp();	

		// disp(cat); 

		Class clazz  = Cat.class;		
		Cat cat2 = (Cat) clazz.newInstance();

		Method method=  clazz.getDeclaredMethod("disp");
		method.invoke(cat); 

	}

}
