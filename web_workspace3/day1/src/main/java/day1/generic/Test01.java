package day1.generic;

import java.util.ArrayList;

public class Test01 {
	
	public static void main(String[] args) {
		
		//객체배열
		
		ArrayList list = new ArrayList();
		list.add(3);
		list.add("hi");
		
		//JDK 1.7 이후
		ArrayList<Member> listG = new ArrayList<>();
		listG.add(new Member("test01","1234"));
		
		for(Member member : listG) {
			System.out.println(member);
		}
		
	}

}
