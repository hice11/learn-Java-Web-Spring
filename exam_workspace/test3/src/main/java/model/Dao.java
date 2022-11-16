package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Dao {

	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "system";
	String password = "1234";
	Connection con = null;
	
	public void dbCon() {
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			if(con!=null) System.out.println("db ok");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	//투표자 조회 voter
	public ArrayList<Voter> selectVoter() {
		dbCon();
		ArrayList<Voter> list = new ArrayList<>();
		String sql = "SELECT v_name, v_birth, v_age, v_gender, v_area, v_confirm  "
				+ "FROM voter_emp";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				String v_name = rs.getString(1);
				String v_jumin = rs.getString(2);
				int v_age = rs.getInt(3);
				String v_gender = rs.getString(4);
				String v_area = rs.getString(5);
				String v_confirm = rs.getString(6);
				list.add(new Voter(v_name, v_jumin, v_age, v_gender, v_area, v_confirm));
			}
			
			rs.close();
			pst.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
	
	//득표 조회
	public ArrayList<Votes> selectVotes() {
		dbCon();
		ArrayList<Votes> list = new ArrayList<>();
		String sql="SELECT m.n_no, m.n_name, COUNT(v_confirm) "
				+ "FROM tbl_member_010 m "
				+ "JOIN tbl_vote_010 v "
				+ "ON m.n_no = v.n_no "
				+ "WHERE v_confirm='y' "
				+ "GROUP BY  m.n_no, m.n_name "
				+ "ORDER BY m.n_no";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				int n_no = rs.getInt(1);
				String n_name = rs.getString(2);
				int n_votes = rs.getInt(3);
				list.add(new Votes(n_no, n_name, n_votes));
			}
			
			rs.close();
			pst.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
	//후보자 조회
	public ArrayList<Candidate> selectCand() {
		dbCon();
		ArrayList<Candidate> list = new ArrayList<>();
		String sql = "SELECT n_no, n_name, "
				+ "	SUBSTR(n_jumin,1,6) || '-' || SUBSTR(n_jumin,7,7) AS n_jumin, "
				+ "	DECODE(n_degree, '01','고졸', '02','학사', '03','석사', '04','박사') AS n_degree, "
				+ "	m.p_no, "
				+ "	p_tel1 || '-' || p_tel2 || '-' || p_tel3 AS p_tel "
				+ "FROM tbl_member_010 m "
				+ "JOIN tbl_party_010 p "
				+ "ON m.p_no = p.p_no ";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				int n_no = rs.getInt(1);
				String n_name = rs.getString(2);
				String n_jumin = rs.getString(3);
				String n_degree = rs.getString(4);
				int p_no = rs.getInt(5);
				String p_tel = rs.getString(6);
				list.add(new Candidate(n_no, n_name, n_jumin, n_degree, p_no, p_tel));
			}
			
			rs.close();
			pst.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
	//투표자 등록
	public void insertVoter(VoterReg voterReg) {
		dbCon();
		String sql = "INSERT INTO tbl_vote_010 VALUES(?,?,?,?,?,?)";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, voterReg.getV_jumin());
			pst.setString(2, voterReg.getV_name());
			pst.setString(3, voterReg.getV_area());
			pst.setString(4, voterReg.getV_time());
			pst.setString(5, voterReg.getV_confirm());
			pst.setString(6, voterReg.getN_no());
			pst.executeUpdate();
			
			pst.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		Dao dao = new Dao();
		dao.dbCon();
		ArrayList<Voter> list = dao.selectVoter();
		ArrayList<Votes> list2 = dao.selectVotes();
		ArrayList<Candidate> list3 = dao.selectCand();
		for(Candidate voter : list3) {
			System.out.println(voter);
		}
	}
	
}
