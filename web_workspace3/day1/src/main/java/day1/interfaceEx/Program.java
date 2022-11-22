package day1.interfaceEx;

interface MyRunnable {

	public void run();
	
}

class ChRunnable implements MyRunnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=0; i<=10; i++) {
			sum+=i;
		}
		System.out.println("1~10까지의 합"+sum);
	}
	
}

public class Program {
	
	public void execute(MyRunnable runnable) {
		runnable.run();
	}
}
