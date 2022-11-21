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
	
	//강좌 등록
	public void insertCourseInfo(Course course) {
		dbCon();
		String sql = "INSERT INTO course_tbl_22 VALUES(course_seq.NEXTVAL,?,?,?,?,?,?)";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, course.getCo_name());
			pst.setString(2, course.getBr_code());
			pst.setString(3, course.getInst_code());
			pst.setString(4, course.getPrice());
			pst.setString(5, course.getStart_date());
			pst.setString(6, course.getEnd_date());
			
			pst.executeUpdate();
			
			pst.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//강좌번호 조회
	public int selectCourseCode() {
		dbCon();
		int co_code = 0;
		String sql = "SELECT co_code FROM "
				+ "  (SELECT co_code FROM course_tbl_22 ORDER BY ROWNUM DESC) "
				+ "WHERE ROWNUM = 1 ";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				co_code = rs.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return co_code;
	}
	
	//지점 조회
	public ArrayList<Branch> selectBranchs() {
		dbCon();
		ArrayList<Branch> list = new ArrayList<>();
		String sql = "SELECT * FROM branch_tbl_22";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				String br_code = rs.getString(1);
				String br_name = rs.getString(2);
				String br_region = rs.getString(3);
				String br_tel = rs.getString(4);
				list.add(new Branch(br_code, br_name, br_region, br_tel));
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
	//지점별 강좌 조회
	public ArrayList<CourseList> selectCourseLists(String code) {
		dbCon();
		ArrayList<CourseList> list = new ArrayList<>();
		String sql = "SELECT co_code, co_name, inst_name, LTRIM(TO_CHAR(price,'L999,999')), start_date || ' ~ ' || end_date AS c_date "
				+ "FROM course_tbl_22 c "
				+ "JOIN instructor_tbl_22 i "
				+ "ON c.inst_code = i.inst_code "
				+ "WHERE br_code = ?";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, code);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				String co_code = rs.getString(1);
				String co_name = rs.getString(2);
				String inst_name = rs.getString(3);
				String price = rs.getString(4);
				String date = rs.getString(5);
				list.add(new CourseList(co_code, co_name, inst_name, price, date));
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
	
	//강사 조회
	public ArrayList<Instructor> selectInstructors() {
		dbCon();
		ArrayList<Instructor> list = new ArrayList<>();
		String sql = "SELECT i.inst_code, inst_name, inst_email, co_name "
				+ "FROM instructor_tbl_22 i "
				+ "JOIN course_tbl_22 c "
				+ "ON c.inst_code = i.inst_code";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				String inst_code = rs.getString(1);
				String inst_name = rs.getString(2);
				String inst_email = rs.getString(3);
				String co_name = rs.getString(4);
				list.add(new Instructor(inst_code, inst_name, inst_email, co_name));
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
	//강사 조회 2
	public ArrayList<Instructor> selectInstructors2() {
		dbCon();
		ArrayList<Instructor> list = new ArrayList<>();
		String sql = "SELECT i.inst_code, inst_name, inst_email, "
				+ "  LISTAGG(co_name, ',') WITHIN GROUP(ORDER BY i.inst_code) "
				+ "FROM instructor_tbl_22 i "
				+ "JOIN course_tbl_22 c "
				+ "ON c.inst_code = i.inst_code "
				+ "GROUP BY i.inst_code, inst_name, inst_email";
		try {
			PreparedStatement pst = con.prepareStatement(sql);

			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				String inst_code = rs.getString(1);
				String inst_name = rs.getString(2);
				String inst_email = rs.getString(3);
				String co_name = rs.getString(4);
				list.add(new Instructor(inst_code, inst_name, inst_email, co_name));
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

	public static void main(String[] args) {
		Dao dao = new Dao();
		dao.dbCon();
		int code = dao.selectCourseCode();
		System.out.println(code);
		
	}

}
