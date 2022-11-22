package day1.polymorphism;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person[] persons  = new Person[3];


		persons[0] = new 김사람();
		persons[1] = new 이사람();
		persons[2] = new 박사람();

		/*
		persons[0].잠을잔다(); 
		persons[1].잠을잔다();
		persons[2].잠을잔다(); 
		 */
		
		//반복문

		for( Person person :  persons) {			
			person.잠을잔다();
		}		

		// 하나의 메시지 (매서드호출방법) => 다른 기능이 수행 (다른기능이 구현 되어 있음)
		for( Person person :  persons) {			
			person.춤을춘다();  
			//다운캐스팅
			if(person instanceof 김사람)
				((김사람)persons[0]).김사람발표();
		}
		


	}

}
