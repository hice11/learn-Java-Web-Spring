package prjDay7.ncs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//방법1
		Score score1 = new Score("이학생", 90, 90);
		Score score2 = new Score("김학생", 80, 82);
		Score score3 = new Score("전학생", 60, 70);
		
		score1.getGrade();
		score2.getGrade();
		score3.getGrade();
		
		System.out.println(score1);
		System.out.println(score2);
		System.out.println(score3);
		
		//방법2 - 배열 이용
		Score[] scores = new Score[3];
		
		scores[0] = new Score("이학생", 90, 90);
		scores[1] = new Score("김학생", 80, 82);
		scores[2] = new Score("전학생", 60, 70);
		//  계산1
		for (int i = 0; i < scores.length; i++) {
			scores[i].getGrade();
		}
		//  계산2
		for(Score sc: scores) {
			sc.getGrade();
		}
		// 출력
		for(Score s: scores) {
			System.out.println(s);
		}
		
		//방법3 - ArrayList 이용
		ArrayList<Score> list = new ArrayList<>();
		
		list.add(new Score("이학생", 90, 90));
		list.add(new Score("김학생", 80, 82));
		list.add(new Score("전학생", 60, 70));
		
		//처리
		for(Score s: list) {
			s.getGrade();
		}
		//출력
		for(Score s1: list) {
			System.out.println(s1);
		}
		
		/////////////////////////////////////////////////
		
		//정렬1 Comparable 오버라이딩 사용
		System.out.println("=================");
		//ArrayList 정렬 라이브러리
		Collections.sort(list);
		
		for(Score score: list) {
			System.out.println(score);
		}
		
		//정렬2 Comparator 오버라이딩 사용
		class ComparatorImp implements Comparator<Score>{
			@Override
			public int compare(Score o1, Score o2) {
				// TODO Auto-generated method stub
				return o1.eng - o2.eng;
			}
			
		}//
		Collections.sort(list, new ComparatorImp());
		System.out.println("===============");
		for(Score sc: list) {
			System.out.println(sc);
		}
		
	}////

}
