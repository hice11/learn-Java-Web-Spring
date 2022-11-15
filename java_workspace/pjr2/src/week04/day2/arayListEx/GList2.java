package week04.day2.arayListEx;

import java.util.ArrayList;

//generic 클래스 -> <T>를 붙인다
public class GList2<T extends Score> {
	
	private Object[] nums;
	private int current;
	 	
	
	public GList2() {		 
		nums = new Object[3];
		current=0;
	}
	
	public void add(T obj) {
		nums[current] = obj;
		current++;
		
	}
	
	public void clear(){
		//current 초기화
		current=0;
		// nums= new int[3];		
	}
	
	public int size()
	{
		return current;
	}
	
	public T get(int index)    { 
		
		return (T) nums[index];
	
	}
	
	
	public static void main(String[] args) {

		GList2<Score> list = new GList2<>();
		GList2<ScoreA> list2 = new GList2<>();
		//GList2<ScoreB> list3 = new GList2<>(); // 에러! Score 상속받지 않음
		
	}

}

