package prjDay8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class ScoreProgram  {
	Scanner sc = new Scanner(System.in);

	ArrayList<Score> list;
	
	public ScoreProgram() {
		list = new ArrayList<>();
	}
	
	//등록
	public void addScore(Score score) {
		list.add(score);
	}	
	//조회
	public void showScores() {
		System.out.println("list size: "+list.size());
		for(Score score : list) {
			System.out.println(score);
		}
	}
	//class 안의 class 생성
	class sortNameAscending implements Comparator<Score>{

		@Override
		public int compare(Score o1, Score o2) {
			// TODO Auto-generated method stub
			return o1.name.compareTo(o2.name);
		}
		
	}
	//정렬
	public void sortNameAscending() {
		//클래스 생성해서 사용
		Collections.sort(list, new sortNameAscending());
	}	
	public void sortKorAscending() {
		Collections.sort(list);
	}
	
	public void sortGradeAscending() {
		//익명 클래스 사용
		Collections.sort(list, new Comparator<Score>() {

			@Override
			public int compare(Score o1, Score o2) {
				return o1.grade-o2.grade;
			}
		});
	}
	
	public void run() {
		
		loop1:while(true) {
			
			System.out.println("메뉴: 1.등록, 2.정렬, 3.조회, 4.종료");
			int menu = sc.nextInt();
			switch (menu) {
			case 1:
				System.out.println("성적을 등록합니다.\n 이름 국어 영어 \nex) 홍길동 90 100");
				String name = sc.next();
				int kor = sc.nextInt();
				int eng = sc.nextInt();
				addScore(new Score(name, kor, eng));
				break;
			case 2:
				System.out.println("1.이름순정렬 2.국어점수정렬 3.학점순정렬");
				int sort = sc.nextInt();
				if(sort==1) {
					sortNameAscending();
				}else if (sort==2) {
					sortKorAscending();
				}else if (sort==3) {
					sortGradeAscending();
				}else {
					System.out.println("잘못된 입력");
				}
				break;
			case 3:
				showScores();
				break;
			case 4:
				System.out.println("종료합니다.");
				break loop1;
			default:
				System.out.println("잘못된 메뉴입니다.");
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		/*
		 * ScoreProgram sProgram = new ScoreProgram(); sProgram.addScore(new
		 * Score("나길동", 100, 90)); sProgram.addScore(new Score("다길동", 90, 80));
		 * sProgram.addScore(new Score("강길동", 40, 90));
		 * 
		 * sProgram.showScores();
		 * 
		 * sProgram.sortKorAscending(); sProgram.showScores();
		 * 
		 * sProgram.sortNameAscending(); sProgram.showScores();
		 * 
		 * sProgram.sortGradeAscending(); sProgram.showScores();
		 */
		
		ScoreProgram scoreProgram = new ScoreProgram();
		scoreProgram.run();
		
	}
	
	
	
}
