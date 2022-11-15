package week04.day4.sort연습;

public class MyArrays {

	public static void sort(Object[] obj) {
		for (int i = 0; i < obj.length-1; i++) {
			for (int j = i+1; j < obj.length; j++) {
				if ( ( (MyComparable)obj[i] ).compareTo(obj[j]) > 0 ) {
					Object tmp = obj[i];
					obj[i] = obj[j];
					obj[j] = tmp;
				}
			}
		}
	}
	//
	
	public static void sort(Object[] obj, MyComparator c) {
		for (int i = 0; i < obj.length-1; i++) {
			for (int j = i+1; j < obj.length; j++) {
				if (c.compare(obj[i], obj[j]) > 0) {
					Object tmp = obj[i];
					obj[i] = obj[j];
					obj[j] = tmp;
				}
			}
		}
	}
	//
	
	
}
