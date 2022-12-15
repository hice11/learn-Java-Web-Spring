package day3.thread;

public class 쓰레드 {
	
	static int index =0;  //�����ڿ��� ���� �߻�

	
	public static void widhdraw1() {
		
		Thread  th= new Thread(  new Runnable() {

			@Override
			public void run() {
				 print();
				
			} });
		
		th.start();
		
	}
	
	public static void widhdraw2() {
		Thread  th= new Thread( new Runnable() {

			@Override
			public void run() {
				print();
			    }  });
		th.start();
		
	}
	
	public static void print() {
		
		 
		for( int i=1; i<=100; i++) {
			try {
				Thread.sleep(100);
				index++;					   
				   System.out.println( "th=" + index );
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
		
	}
	
	public static void main(String[] args) {
		widhdraw1();
		widhdraw2();
		 
		 

	}

}
