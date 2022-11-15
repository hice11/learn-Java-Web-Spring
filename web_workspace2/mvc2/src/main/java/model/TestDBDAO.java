package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class TestDBDAO {

	//DB작업
	// 연결정보 - 멤버로
	String driver = "oracle.jdbc.driver.OracleDriver" ;
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "system";
	String password = "1234";
	Connection con = null;
	
	//DB연결
	private void dbCon() {
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}//
	
	//배열에 데이터 가져오기
	//전체 고객목록 조회기능
	public ArrayList<Member> members() {
		//배열
		ArrayList<Member> list = new ArrayList<>();
		
		//디비에서 데이터 가져오기
		dbCon();  //디비 연결
		String sql = "SELECT * FROM testdb";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				String id = rs.getString(1);
				String pw = rs.getString(2);
				Member member = new Member(id, pw);
				list.add(member);
			}
			//자원 반환
			rs.close();
			pst.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}//
	
	
	//디비에 INSERT
	//고객 등록 기능
	public void insert(Member member) {
		
		dbCon();
		String sql = "INSERT INTO testdb VALUES(?,?)";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, member.getId());
			pst.setString(2, member.getPw());
			pst.executeUpdate();
			
			pst.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	//고객한명 조회
	public Member member(String id) {

		dbCon();
		String sql = " select * from testdb  where id  =? " ; 
		Member member = null;
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, id);
			ResultSet  rs= pst.executeQuery();

			if(rs.next()) {
				String tmpId = rs.getString(1);
				String tmpPw = rs.getString(2);
				member = new Member( tmpId, tmpPw);
			}	

			rs.close();
			pst.close();
			con.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 		
		return member;
	}
	
	//비밀번호 변경
	public void changePassword(String id, String newPw) {
		dbCon();
		String sql = "UPDATE testdb SET pw=? WHERE id=?";
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, newPw);
			pst.setString(2, id);
			pst.executeUpdate();
			
			pst.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	//데이터 삭제
	public void delete(String id) {
		dbCon();
		String sql ="DELETE FROM testdb WHERE id=?";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, id);
			pst.executeUpdate();
			
			pst.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {

		TestDBDAO dao = new TestDBDAO();
		
		// members 기능 테스트
		ArrayList<Member> list  = dao.members();
		
		for( Member member  : list) {
			System.out.println(  member);
		}
		
		//member 기능 테스트 
		String userId ="test02";
		Member member  =dao.member(userId);		
		System.out.println("고객정보 한명:" + member);
		
		//member 등록 테스트
		String userId2 = "test04";
		String userPw2 = "3333";
		Member newMember = new Member(userId2, userPw2);
		//dao.insert(newMember);
		
		//비밀번호 변경 테스트
		String id = "test04";
		String newPw = "6666";
		//dao.changePassword(id, newPw);
		
		//데이터 삭제 테스트
		//dao.delete(id);
		
	}///
	
	
}
