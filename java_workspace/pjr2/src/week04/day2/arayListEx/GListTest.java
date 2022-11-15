package week04.day2.arayListEx;

public class GListTest {

	public static void main(String[] args) {

		GList<Score> list = new GList<>();
		
		list.add(new Score("kim",90,90));
		list.add(new Score("lee",90,90));
		list.add(new Score("woo",90,90));
		
		for (int i = 0; i < list.size(); i++) {
			list.get(i).printInfo(); //형변환 안해도 메서드 사용가능
		}
		
		
	////	
	}

}
