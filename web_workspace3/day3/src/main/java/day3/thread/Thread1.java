package day3.thread;

public class Thread1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Single Thread 싱글쓰레드
		for (int i = 0; i < 100; i++) {
			System.out.println("first="+i);
		}
		for (int i = 0; i < 100; i++) {
			System.out.println("second="+i);
		}
		
	}

}
