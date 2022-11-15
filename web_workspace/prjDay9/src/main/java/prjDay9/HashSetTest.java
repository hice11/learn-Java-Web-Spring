package prjDay9;

import java.util.HashSet;

public class HashSetTest {

	
	public static void main(String[] args) {
		 
		
		
		 HashSet<String > StringSet = new HashSet<> ();
		 StringSet.add("one");
		 StringSet.add("one");
		 StringSet.add("one");		 
		 System.out.println(   StringSet.size());
		 
		 
		
		 HashSet<Person> personSet = new   HashSet<>(); 
		 //set 사용시 주의사항
		 //사용자 객체를 담을경우  hashcode, equals override 해야함 
		 personSet.add(new Person("홍길동",20));
		 personSet.add(new Person("홍길동",20));
		 personSet.add(new Person("홍길동",20));
		  
		 System.out.println(  personSet.size() );
		  
		 

	}

}
