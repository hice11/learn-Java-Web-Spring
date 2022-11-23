package day2.lambda;

import java.util.function.Consumer;

public class ConsumerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Consumer<String> obj = gd -> System.out.println("gd");
		obj.accept("hi");

	}

}
