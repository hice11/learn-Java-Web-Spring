package prjDay9;

import java.util.HashMap;

public class HashMapTest2 {

	public static void main(String[] args) {

		//데이터를 저장할 때 key, value 형식으로 저장
		//검색에 유리함
	
		HashMap<String, Cat> map = new HashMap<>();
		
		map.put("cat1", new Cat("뽀삐", 2));
		map.put("cat2", new Cat("나비", 3));

		Cat result = map.get("cat1");
		System.out.println(result);
		
	}

}
