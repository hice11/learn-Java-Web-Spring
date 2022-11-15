package week04.day2.objectEx;

public class FoodTest {
	
	public static void main(String[] args) {
		
		Food food = new Food("참치김밥",4500);
		Food food2 = new Food("라면",5000);
		Food food3 = new Food("김밥",3500);
		
		//toString()
		System.out.println(food.toString());
		System.out.println(food2.toString());
		System.out.println(food3.toString());
		//toString 생략가능
		System.out.println(food);
		System.out.println(food2);
		System.out.println(food3);
		
		System.out.println(food.equals(food3));
		
		//getter, setter
		food.setPrice(3500);
		food.setName("김밥");
		
		//equals()
		System.out.println(food.equals(food3));
		
		
	}

}
