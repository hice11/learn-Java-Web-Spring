package prjDay9;

public class EqualsTest {

	public static void main(String[] args) {
		  
        //   두 고양이가 같나요?
		//  뽀삐  3   , 뽀삐 3  
		
		Cat cat1 = new Cat("뽀삐", 3);
		Cat cat2 = new Cat("뽀삐", 3); 
		
		System.out.println( cat1.equals(cat2));
		
	}

}
