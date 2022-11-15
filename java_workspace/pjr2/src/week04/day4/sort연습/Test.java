package week04.day4.sort연습;

public class Test {

	public static void main(String[] args) {

		Dessert[] arr = new Dessert[3];
		arr[0] = new Dessert("쿠키",3500,5);
		arr[1] = new Dessert("마카롱",2300,10);
		arr[2] = new Dessert("케이크",6000,3);
		
		System.out.println("========================================\ncompareTo(이름)");
		
		//정렬1 compareTo (이름정렬)
		MyArrays.sort(arr);
		//출력1
		for (Dessert dessert : arr) {
			System.out.println(dessert);
		}
		System.out.println("========================================\ncompare(가격)");
		
		//정렬2 compare (가격정렬)
		MyArrays.sort(arr, new MyImp1());
		//출력2
		for (Dessert dessert : arr) {
			System.out.println(dessert);
		}
		System.out.println("========================================\ncompare(판매량)");
		
		//정렬3 compare (판매량정렬)
		MyArrays.sort(arr, new MyImp2());
		//출력3
		for (Dessert dessert : arr) {
			System.out.println(dessert);
		}
		System.out.println("========================================\n익명클래스(이름)");
		
		
		//익명클래스
		MyArrays.sort(arr, new MyComparator() {
			@Override
			public int compare(Object o1, Object o2) {
				if(o1 instanceof Dessert && o2 instanceof Dessert) {
					return ( ((Dessert)o1).name.compareTo( ((Dessert)o2).name ) );
				}
				return 0;
			}
		});
		//출력
		for (Dessert dessert : arr) {
			System.out.println(dessert);
		}
		
	////	
	}
}
