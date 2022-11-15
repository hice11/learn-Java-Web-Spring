package prjDay9;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class HashMapTest3 {

	public static void main(String[] args) {

		// 1조
		HashMap<Integer, HashSet<String>> map = new HashMap<>();
		
		HashSet<String> team1 = new HashSet<>();
		team1.add("김소영");
		team1.add("이호진");
		team1.add("임영빈");
		team1.add("원재호");
		
		map.put(1, team1);
		
		// 2조
		HashSet<String> team2 = new HashSet<>();
		team2.add("유다현");
		team2.add("이용재");
		team2.add("고기현");
		team2.add("김준서");
		
		map.put(2, team2);
		
		
		//1조 꺼내서 출력
		HashSet<String> team11 = map.get(1);
		Iterator<String> list = team11.iterator();
		
		while(list.hasNext()) {
			System.out.println(list.next());
		}
		
		//2조 꺼내서 출력
		HashSet<String> team22 = map.get(2);
		Iterator<String> list2 = team22.iterator();
		
		while(list2.hasNext()) {
			System.out.println(list2.next());
		}
		
	}

}
