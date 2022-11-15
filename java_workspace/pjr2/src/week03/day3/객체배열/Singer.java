package week03.day3.객체배열;

public class Singer {  //캡슐화 , 정보은닉 , 정해진 인터페이스만으로 사용하게 하겠다. 
	
	 String name;
	 String album;
	 int release;
	 String track;
	 String GPA;
	 
	 //생성자: 멤버변수의 초기화 담당
	 // 클래스명 동일
	 // 반환타입 없어야 함 
	 // 생성자 오버로딩 가능  , 매개변수 차이 =>개수, type이 달라야 함 	 
	 // 생성자를 만들면 기본생성자를 제공하지 않습니다.
	 	 
	 public Singer() {
		 
	 }
	 
	 public Singer(String name, String album, int release, String track, String GPA) {
			this.name = name;
			this.album = album;
			this.release = release;
			this.track = track;
			this.GPA = GPA; 
	 }
	 
	
	// 입력
	/*public void input(String name, String album, int release, String track, String GPA) {
		this.name = name;
		this.album = album;
		this.release = release;
		this.track = track;
		this.GPA = GPA;
	}*/	 
	 
	
	// 출력
	public void printInfo() {
		System.out.println(name);
		System.out.println(album);
		System.out.println(release);
		System.out.println(track);
		System.out.println(GPA);
	}	
	
 
}
