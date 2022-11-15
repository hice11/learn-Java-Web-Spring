package week04.day5;

import java.util.ArrayList;
import java.util.Collections;

public class Ex05 {

	public static void main(String[] args) {

		
		ArrayList<Score> list = new ArrayList<>();
		
		list.add(new Score("lee",90,90));
		list.add(new Score("kee",90,80));
		list.add(new Score("woo",100,90));
		
		//정렬
		Collections.sort(list);
		
		System.out.println(list.get(0).toString());
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		
		
		
		
	}

}
