package week01.day4;

public class Ex10 {

	public static void main(String[] args) {
	 
		
		int sum =0 ;
		int index=11;

		while (index-- >1) {
			sum += index;
			}
		System.out.println(sum);		
		
		/*
		11      n--    sum 
        10     11     10 
        9      10     19
        8       9      27
        7       8      34
        6       7      40
        5       6      45
        4       5      49
        3       4      52
        2       3      54
        1       2      55
        0       1      55
		 */

	}

}

