package week03.day2;

public class MusicPlayer {

	// 이름, 색깔, 크기
	private String 이름;
	private String 색깔;
	private int 크기;
	private int 볼륨;
	private String[] 음악목록 = {"음악1","음악2","음악3","음악4"};
	private int index;
	//on/off
	//볼륨조절
	//랜덤재생
	//이전곡/다음곡
	
	//
	
	
	public void on_off(boolean flag) {
		if(flag) System.out.println("전원켜기");
		else System.out.println("전원끄기");
	}
	
	public void 볼륨증가() {
		볼륨+=2;
		System.out.println("볼륨을 증가했습니다");
	}
	
	public void 볼륨감소() {
		볼륨-=2;
		System.out.println("볼륨을 감소했습니다");
	}
	
	public String 랜덤재생() {
		int index = (int)(Math.random()*4);
		this.index = index;
		String result = 음악목록[index];
		return result;
	}
	
	public void 이전곡() {
		if(index>0)
			index--;
		else 
			index = 음악목록.length-1;
	}
	
	public void 다음곡() {
		if(index<음악목록.length-1)
			index++;
		else {
			index = 0;
		}
	}
	
	public String 재생하기() {
		String result = 음악목록[index];
		return result;
	}
	
	public void printInfo() {
		//객체정보 출력
		System.out.println(이름);
		System.out.println(색깔);
		System.out.println(크기);
		System.out.println(볼륨);
	}

	//음악목록
	public void printMusicList() {
		for (int i = 0; i < 음악목록.length; i++) {
			System.out.println((i+1)+"번째 노래: "+음악목록[i]);
		}
	}
	
	
}
