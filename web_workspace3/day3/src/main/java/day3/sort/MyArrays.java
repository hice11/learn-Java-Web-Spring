package day3.sort;

import java.util.Arrays;

interface MyComparator{
	 int compareTo( Object o1, Object o2);    //  양수가오면  교환( 기준 o1, 비교대상  o2)  기준이크면 양수의 값을 반환, 작으면 음수의 값을 )
}

public class MyArrays { 	//정렬하기 기능 
	 
	
	public static void sort( Object[] arr  ,  MyComparator  t ) {	 		
	 
		for( int i=0;  i< arr.length-1 ; i++) {
			for( int  j=i+1 ; j<arr.length; j++) {
				
				if(   t.compareTo(arr[i], arr[j]) >0   ) {
					Object tmp= arr[i];
					arr[i]=arr[j];
					arr[j]= tmp;					
					
				}
			}
		}		 
		
	}
			
	public static  void sort() {
		int[] nums= { 15,8,7,11,3 };  // 정렬
		
		for( int i=0 ; i< nums.length-1 ; i++ ) {			
			for( int j=i+1 ; j< nums.length ;j++) {
				
				if( nums[i] > nums[j] ) {
					int tmp = nums[i];
					nums[i] = nums[j];
					nums[j]=tmp;
				}
				
			}
		}
		
		System.out.println( Arrays.toString(nums));
	}
	 
	
	public static void main(String[] args) {		   
		   sort();
	}
	
}
