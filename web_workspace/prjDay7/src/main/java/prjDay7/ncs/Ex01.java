package prjDay7.ncs;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String str="hello java";		

		char[] str = {'h','e','l','l','o' ,' ' ,'j','a','v','a' };
		char[] str2 = {'h','e','l','l','o',' ','j','a','v','a'};

		// 출력		

		for( int i=0; i< str.length; i++) {
			System.out.print(str[i]);
		}
		for(int i=0; i< str2.length; i++) {
			System.out.println(str2[i]);
		}

		System.out.println( );
		printchars(str);


		System.out.println( );
		System.out.println(str);


	}

	private static void printchars(char[] str) {
		for( int i=0; i< str.length;i++) {
			System.out.print(str[i]);
		}

	}

}