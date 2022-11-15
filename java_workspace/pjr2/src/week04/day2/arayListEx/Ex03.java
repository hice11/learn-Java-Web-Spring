package week04.day2.arayListEx;

import java.util.ArrayList;

public class Ex03 {

	public static void main(String[] args) {

		
		//ArrayList의 generic 버전
		//형변환 필요 없어짐
		ArrayList<Score> list = new ArrayList<>();
		
		//등록
		list.add(new Score("hong",100,100));
		list.add(new Score("kim",90,99));
		list.add(new Score("lee",88,100));
		
		//조회
		for (int i = 0; i < list.size(); i++) {
			//list.get(i).printInfo();
			System.out.println(list.get(i).toString());
		}
		
		
	}

}
