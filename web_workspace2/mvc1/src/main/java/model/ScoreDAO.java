package model;

import java.util.ArrayList;

public class ScoreDAO {
	
	//디비연결
	private void dbCon() {
		System.out.println("db연결");
	}
	
	//전체 조회하기, 모든 학생
	public ArrayList<Score> list() {
		ArrayList<Score> list = new ArrayList<>();
		list.add(new Score("hong",100,100));
		list.add(new Score("lee",50,70));
		list.add(new Score("kim",90,88));
		return list;
	}
	
	//학생번호로 조회하기
	public Score score(String name){
		return new Score("hong",100,100);
	}
	
	
	//DAO 테스트
	public static void main(String[] args) {
		
		ScoreDAO dao = new ScoreDAO();
		ArrayList<Score> list = dao.list();
		
		for(Score score: list) {
			System.out.println(score);
		}
		
	}

}
