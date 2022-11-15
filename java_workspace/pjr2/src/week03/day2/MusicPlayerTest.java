package week03.day2;

public class MusicPlayerTest {

	public static void main(String[] args) {

		MusicPlayer player = new MusicPlayer();
		
		String music = player.랜덤재생();
		System.out.println(music);

		player.다음곡();
		music = player.재생하기();
		
		System.out.println(music);
		
		
		// 속성을 기능으로 사용
		player.printMusicList();
		
		// 속성을 직접 사용 (속성을 private로 바꾸면 쓸수없음)
		/*
		for (int i = 0; i < player.음악목록.length; i++) {
			System.out.println(player.음악목록[i]);
		}
		*/
		
	////	
	}

}
