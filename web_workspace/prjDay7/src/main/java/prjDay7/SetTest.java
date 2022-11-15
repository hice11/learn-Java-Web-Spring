package prjDay7;

import java.util.HashSet;
import java.util.Iterator;

public class SetTest {

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<>();
		
		//순서가 없다
		//중복을 허용하지 않는다
		set.add("1");
		set.add("1");
		set.add("2");
		
		//꺼내기
		Iterator<String> list  = set.iterator();
		
		while(list.hasNext()) {
			System.out.println(list.next());
		}
		
		
		
	}

}
