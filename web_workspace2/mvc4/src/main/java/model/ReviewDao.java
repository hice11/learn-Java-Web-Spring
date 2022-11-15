package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ReviewDao {

	//DB작업
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "system";
	String password = "1234";
	Connection con = null;
	
	

	//DB연결
	private void dbCon() {
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			//연결 테스트
			if(con != null) System.out.println("\nConnection ok");
			else System.out.println("\nConnection fail");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}//
	
	
	//전체 리뷰 조회
	public ArrayList<Review> selectReviews() {
		ArrayList<Review> list = new ArrayList<>();
		dbCon();
		String sql = "SELECT title, review FROM review";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				String title = rs.getString(1);
				String review = rs.getString(2);
				list.add(new Review(title, review));
			}
			
			rs.close();
			pst.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	
	public static void main(String[] args) {
		ReviewDao dao = new ReviewDao();
		dao.dbCon();
		
		ArrayList<Review> list = dao.selectReviews();
		for(Review review:list) {
			System.out.println(review);
		}
	}


}
