package day3.thread;

public class Thread2 {

	public static void main(String[] args) {
		
		ThreadEx th = new ThreadEx();
		//쓰레드 실행요청
		//실제로는 run()이 실행
		th.start();
		
		
		for (int i = 0; i < 1000; i++) {
			System.out.println("main="+i);
		}
		
	}////
	
	
	
}


class ThreadEx extends Thread {
	
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("thread="+i);
		}
	}
}