package week04.day1;

import java.util.ArrayList;

public class Score2Test {

	public static void main(String[] args) {

		Score2[] scores = new Score2[3];
		scores[0] = new Score2("홍길동",90,100);
		scores[1] = new Score2("가길동",90,90);
		scores[2] = new Score2("나길동",90,100);
		
		for (Score2 score2 : scores) {
			//System.out.println(score2.toString());
			System.out.println(score2);
		}
		for (int i = 0; i < scores.length; i++) {
			//System.out.println(scores[i].toString());
			System.out.println(scores[i]);
		}
		
		
		Object o = scores[0];  // 가능
		Object o2 = new Score2();  // 가능 //업캐스팅
		((Score2)o2).print();  //다운캐스팅
		
		
		
		
		
		//
		ArrayList list = new ArrayList();
		list.add(new Score2("홍길동",90,100));
		list.add(new Score2("가길동",90,90));
		list.add(new Score2("나길동",90,100));
		
		for (int i = 0; i < list.size(); i++) {
			//System.out.println(list.get(i).toString());
			System.out.println(list.get(i));
		}
		
		
		
		
		
	////	
	}

}
