package com.acorn.prj1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestDao {
	
	@Autowired
	DataSource ds;

	public TestDao() {
		// TODO Auto-generated constructor stub
	}
	public TestDao(DataSource ds2) {
		ds= ds2;		
	}

	public void select() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "select * from  login";
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);	            
			rs  = pstmt.executeQuery();  

			while( rs.next()){	            	
				System.out.println( rs.getString(1));
				System.out.println( rs.getString(2));
			}
		} catch (SQLException e) {
			e.printStackTrace();

		// finally에 자원의 반납
		} finally { 
			
			// AutoCloseable 이용 
			close(rs, pstmt, conn);   

			/*
			try {
				if(rs!=null) rs.close();
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			*/
		}//f  
	}
	
	public void insert(String id, String pw) {
		Connection conn = null;
		PreparedStatement pst = null;
		
		String sql = "INSERT INTO login VALUES(?,?)";
		try {
			conn = ds.getConnection();
			pst = conn.prepareStatement(sql);
			pst.setString(1, id);
			pst.setString(2, pw);
			pst.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	// close의 인터페이스
	// ...은 매개변수를 개수의 상관 없이 받는다는 의미
	private void close(AutoCloseable... acs) {
		for(AutoCloseable ac :acs)
			try { 
				if(ac!=null) ac.close(); 
			} catch(Exception e) { 
				e.printStackTrace(); 
			}
	}



}
