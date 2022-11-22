package day1.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ArrayList 중복허용, 순서가 있음
		List<String> list = new ArrayList<>();
		list.add("hi1");
		list.add("hi2");
		list.add("hi2");
		
//		for(String str : list) {
//			System.out.println(str);
//		}
		
		//HashSet 중복X
		Set<String> set = new HashSet<>();
		set.add("hi1");
		set.add("hi2");
		set.add("hi2");
		
		Iterator<String> list2 = set.iterator();
		
		while(list2.hasNext()) {
			System.out.println(list2.next());
		}
		
		//HashMap
		Map<String, String> map = new HashMap<>();
		
		map.put("key1", "test1내용");
		map.put("key2", "test2내용");
		map.put("key3", "test3내용");
		
		String content = map.get("key1");
		System.out.println(content);
		
		
		//Collection type 참조형 변수
		Collection<String> collection = null;
		//
		//collection = list;
		collection = set;
		Iterator<String> iterator1 = collection.iterator();
		while(iterator1.hasNext()) {
			System.out.println(iterator1.next());
		}
		
		//
		

	}

}
