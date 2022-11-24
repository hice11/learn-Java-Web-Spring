package day3.thread;

public class Thread4 {

	public static void main(String[] args) {
		
		//1. 쓰레드1
		MYThread11 thread1 = new MYThread11();
		thread1.start();
		
		//2. 쓰레드2
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 20; i++) {
					System.out.print("★");
				}
			}
		});
		thread2.start();
		
		//3. 쓰레드3
		Thread thread3 = new Thread( ()->{
			for (int i = 0; i < 20; i++) {
				System.out.print("○");
			}
		});
		thread3.start();
		
		
	}////
	
	
}
class MYThread11 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.print("☆");
		}
	}
}






