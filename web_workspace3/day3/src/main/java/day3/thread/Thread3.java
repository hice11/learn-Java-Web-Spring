package day3.thread;

public class Thread3 {

	public static void main(String[] args) {
		ThreadEx2 th0 = new ThreadEx2();
		th0.start();
		
		
		//1. 인터페이스를 구현한 클래스를 정의, 객체를 생성
		//2. 인터페이스를 익명클래스로 정의한다음 객체를 생성
		//3. 람다식
		
		
		//1. 인터페이스를 구현한 클래스를 정의, 객체를 생성
		
		
		//쓰레드 실행요청
		//실제로는 run()이 실행
		R r = new R();
		Thread th = new Thread(r);
		th.start();
		
		
	}////
}

//1. 쓰레드 생성방법1 Thread 클래스를 상속받는다
// run에 실행 코드 구현
class ThreadEx2 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("bye");
		}
	}
}


class R implements Runnable{
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("hi");
		}
	}
}



