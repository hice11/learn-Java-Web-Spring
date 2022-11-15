package prjDay9;

import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {

		//데이터를 저장할 때 key, value 형식으로 저장
		//검색에 유리함
		
		HashMap<String, String> map = new HashMap<>();
		map.put("key1", "홍길동정보");
		map.put("key2", "김길동정보");
		map.put("key3", "이길동정보");
		
		String result1 = map.get("key1");
		String result2 = map.get("key2");
		String result3 = map.get("key3");
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
		
		
	}

}
