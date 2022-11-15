package B조;

public class ScreenData {

	
	static Movie[] movies = {new Movie("듄",155),new Movie("인터스텔라",169),new Movie("인생은 아름다워",122)};
	static Theater[][][][] theaters;
	
	static Date[] dates = {new Date(2022,10,7), new Date(2022,10,8), new Date(2022,10,9)};
	static Time[] times = {new Time("09:30"), new Time("16:05"), new Time("20:40")};
	
	public ScreenData() { }
	
	
	public static void theaterArray() {
		// [극장별][영화별][날짜별][시간별] => 3*3*3*3 = 81개..
		theaters = new Theater[3][3][3][3];
		//압구정
		for (int i = 0; i < theaters.length; i++) {
			for (int j = 0; j < theaters.length; j++) {
				// 영화1
				theaters[0][0][i][j] = new Theater("압구정 1관",7,16);
				// 영화2
				theaters[0][1][i][j] = new Theater("압구정 2관",10,16);
				// 영화3
				theaters[0][2][i][j] = new Theater("압구정 3관",12,16);
			}
		}
		//왕십리
		for (int i = 0; i < theaters.length; i++) {
			for (int j = 0; j < theaters.length; j++) {
				// 영화1
				theaters[1][0][i][j] = new Theater("왕십리 1관",10,16);
				// 영화2
				theaters[1][1][i][j] = new Theater("왕십리 2관",12,16);
				// 영화3
				theaters[1][2][i][j] = new Theater("왕십리 3관",7,16);
			}
		}
		//용산
		for (int i = 0; i < theaters.length; i++) {
			for (int j = 0; j < theaters.length; j++) {
				// 영화1
				theaters[2][0][i][j] = new Theater("용산 1관",12,16);
				// 영화2
				theaters[2][1][i][j] = new Theater("용산 2관",7,16);
				// 영화3
				theaters[2][2][i][j] = new Theater("용산 3관",10,16);
			}
		}
	}
	
	/*
	static Theater[][] theaters = 
		{
			{new Theater("압구정 1관",7,16),new Theater("왕십리 1관",10,16),new Theater("용산 1관",12,16)},
			{new Theater("압구정 2관",10,16),new Theater("왕십리 2관",12,16),new Theater("용산 2관",7,16)},
			{new Theater("압구정 3관",12,16),new Theater("왕십리 3관",7,16),new Theater("용산 3관",10,16)}
		};
	*/
}
