package day2.stream;

import java.util.stream.IntStream;

public class Test5 {
	
	public static void main(String[] args) {
		
		//1~10의 요소를 가진 스트림
		IntStream stream = IntStream.range(1, 10);
		
		// 4,5,6,7,8
		stream.skip(3).limit(5).forEach(num->System.out.print(num));
		
		IntStream stream2 = IntStream.of(1,2,2,3,3,3,4,5,5,6);
		stream2.distinct().forEach(num->System.out.print(num));
		
		IntStream stream3 = IntStream.range(1, 10);
		stream3.filter(i->i%2==0).forEach(num->System.out.print(num));
		
	}

}
