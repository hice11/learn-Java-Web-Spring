package week5.day1;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ex01 {

	public static void main(String[] args) {
		
		//날짜
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.getTime());
		
		//특정포맷으로 날짜 표현하기
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sf.format(calendar.getTime()));
		
		
		calendar.add(Calendar.DATE ,14);
		System.out.println(sf.format(calendar.getTime()));
		
		// 2달후 
		calendar.add(Calendar.MONTH ,2);
		System.out.println(sf.format(calendar.getTime()));
		
		// 2년후 
		calendar.add(Calendar.YEAR ,2);
		System.out.println(sf.format(calendar.getTime()));

		calendar.set(2022, 9, 13);
		System.out.println(calendar.get(Calendar.MONTH));
		System.out.println(sf.format(calendar.getTime()));
		
		
	}
}
