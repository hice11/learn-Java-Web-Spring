package week04.day3.myRunnable;

public class Program2 {

	public void mainrun(Myrunnable runnable) {
		runnable.run();
	}
		
	
	
	
	public static void main(String[] args) {
		Program2 p = new Program2();
		
		ScoreAverage average = new ScoreAverage();
		//p.mainrun(average);
		
		//익명클래스
		p.mainrun(new Myrunnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("실행");
			}
		});
		
		
	////
	}
	
}
