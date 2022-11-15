package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import model.Member;

@WebServlet("/db2")
public class DBServlet2 extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 고객목록 데이터 (아이디, 비번), Member
		// ArryaList, HashSet
		ArrayList<Member> list = new ArrayList<>();
		
		
		//DB작업
		// 연결정보
		String driver = "oracle.jdbc.driver.OracleDriver" ;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "system";
		String password = "1234";
		
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, user, password);
			
			String sql = "SELECT * FROM testdb";
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				String id = rs.getString(1);
				String pw = rs.getString(2);
				Member member = new Member(id, pw);
				list.add(member);
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

		//view를 거쳐서 출력
		request.setAttribute("list", list);
		request.getRequestDispatcher("WEB-INF/views/list.jsp").forward(request, response);
		
	}//
	
	

}
