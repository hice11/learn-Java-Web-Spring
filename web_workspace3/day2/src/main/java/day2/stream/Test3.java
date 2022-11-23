package day2.stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Test3 {
	
	public static void main(String[] args) {
		
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add("hi");
		list.add("hi1");
		list.add("hello");
		list.add("hi2");
		list.add("hello");
		
		Stream<String> stream1 = list.stream();
		
		long cnt = stream1.filter(str-> str.equals("hello")).count();
		System.out.println(cnt);
		
		//
		stream1 = list.stream();
		stream1.filter(str->str.equals("hello")).forEach(s->System.out.println(s));
		
		stream1 = list.stream();
		stream1.filter(str->str.equals("hello")).limit(2).forEach(s->System.out.println(s));

		
	}
}
