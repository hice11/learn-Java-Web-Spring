package com.acorn.prj1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class DBTest2 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		//spring jdbc 사용해서 데이터베이스 연동 
		String driver = "oracle.jdbc.driver.OracleDriver" ;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "system";
		String password = "1234";

		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName(driver);
		ds.setUrl(url);
		ds.setUsername(user);
		ds.setPassword(password);

		Connection conn = ds.getConnection(); // 
		System.out.println("conn = " + conn);
		System.out.println(conn!=null);

		Statement stmt  = conn.createStatement(); // Statement를 생성한다.        
		//String query = "SELECT SYSDATE, SYSTIMESTAMP FROM dual"; // 시스템의 현재 날짜시간을 출력하는 쿼리(query)
		String query = "SELECT * from member_tbl_11";
		ResultSet rs = stmt.executeQuery(query); // query를 실행한 결과를 rs에 담는다.

		// 실행결과가 담긴 rs에서 한 줄씩 읽어서 출력
		while (rs.next()) {
			String field1 = rs.getString(1);  // 읽어온 행의 첫번째 컬럼의 값을 String으로 읽어서 curDate에 저장
			String field2 = rs.getString(2);  // 읽어온 행의 두번째 컬럼의 값을 String으로 읽어서 curDate에 저장
			System.out.println( field1 + " " + field2 );       // 2022-01-11 13:53:00.0
		}


	}

}
