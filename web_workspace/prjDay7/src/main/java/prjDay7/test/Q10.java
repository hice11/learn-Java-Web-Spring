package prjDay7.test;

public class Q10 {

	public static void main(String[] args) {
		//문제10) 3명의 학생성적을 출력하는 프로그램을 작성하시오    (10점)
		//이학생   90   90  A
		//김학생   80   82  B
		//전학생   60   70  F
		
		Score score1 = new Score("이학생", 90, 90);
		Score score2 = new Score("김학생", 80, 82);
		Score score3 = new Score("전학생", 60, 70);
		
		System.out.println(score1);
		System.out.println(score2);
		System.out.println(score3);

	}

}
