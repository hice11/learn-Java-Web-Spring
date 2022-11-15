package week02.day1;

public class Ex05Array {
	
	public static void main(String[] args) {
		
		// 변수
		int kor1, kor2, kor3, kor4, kor5;
		
		kor1=90;
		kor2=80;
		kor3=70;
		kor4=100;
		kor5=80;
		
		int sum = kor1+kor2+kor3+kor4+kor5;
		System.out.println("변수 5개의 총합="+sum);
		
		// 배열 사용
		int[] kors = new int[5];
		
		kors[0]=90;
		kors[1]=80;
		kors[2]=70;
		kors[3]=100;
		kors[4]=80;
		int sum2 = kors[0]+kors[1]+kors[2]+kors[3]+kors[4];
		
		System.out.println(kors[0]);
		System.out.println(kors[1]);
		System.out.println(kors[2]);
		System.out.println(kors[3]);
		System.out.println(kors[4]);
		System.out.println("배열을 사용한 합계="+sum2);
		
		// for문 함께 사용
		for(int i=0; i<kors.length; i++) {
			System.out.println(kors[i]);
		}
		
		int sum3=0;
		for(int i=0; i<kors.length; i++) {
			sum3= sum3+kors[i];   // sum3 += kors[i];
		}
		System.out.println("배열반복문을 사용한 합계="+sum3);
		
		
		
		///
	}

}
