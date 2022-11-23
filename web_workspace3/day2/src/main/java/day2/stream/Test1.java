package day2.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

public class Test1 {

		public static void main(String[] args) {
			
			//표준화된 방법으로 데이터를 다룬다
			String[] arr = new String[] {"one","two","three"};
			
			ArrayList<String> list = new ArrayList<>();
			list.add("one");
			list.add("two");
			list.add("three");
			
			//배열정렬
			Arrays.sort(arr);
			//Collection 정렬
			Collections.sort(list);			
			
			//배열을 스트림으로 	 
			Stream<String> stream1 = Arrays.stream(arr);
			//ArrayList를 스트림으로
			Stream<String> stream2 = list.stream();	
			
			stream1.sorted().forEach( s->System.out.println(s));
			stream2.sorted().forEach( s->System.out.println(s));

			
		}
}
