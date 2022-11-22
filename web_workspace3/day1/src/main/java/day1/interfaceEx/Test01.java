package day1.interfaceEx;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Program p = new Program();
		
		ChRunnable ch = new ChRunnable();
		p.execute(ch);
		

		//2. 익명클래스
		p.execute(new MyRunnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				int sum=0;
				for(int i=0; i<=10; i++) {
					sum+=i;
				}
				System.out.println("1~10까지의 합"+sum);
			}
		});
		
		
		//3. 람다식
		//구현할 메서드가 한개인 인터페이스 : functional interface
		p.execute(
				() -> {
					int sum=0;
					for(int i=0; i<=10; i++) {
						sum+=i;
					}
					System.out.println("1~10까지의 합"+sum);
				}
				);
		
		
	}////

}
