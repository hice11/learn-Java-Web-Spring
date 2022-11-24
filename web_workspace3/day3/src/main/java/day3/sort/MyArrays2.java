package day3.sort;

import java.util.Arrays;

public class MyArrays2 {
	
	public static void sort() {
		int[] nums = {15,8,7,11,3};
		
		for (int i = 0; i < nums.length-1; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if (nums[i]>nums[j]) {
					int tmp = nums[i];
					nums[i] = nums[j];
					nums[j] = tmp;
				}
			}
		}//for
		System.out.println(Arrays.toString(nums));
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sort();
	}

}
