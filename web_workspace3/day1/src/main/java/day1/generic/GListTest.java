package day1.generic;

public class GListTest {

	public static void main(String[] args) {
		
		GList<Student> list = new GList<>();
		
		list.add(new Student("홍", "서울"));
		list.add(new Student("김", "부산"));
		
		for(int i=0; i<list.size(); i++) {
			list.get(i).special();
		}
		
	}
	
}
