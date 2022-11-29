package com.acorn.prj1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTest1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String driver = "oracle.jdbc.driver.OracleDriver" ;
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="system";
		String password="1234";
		
		Class.forName(driver);         
        Connection conn = DriverManager.getConnection(url, user, password); // 데이터베이스의 연결을 얻는다.
        Statement stmt  = conn.createStatement(); // Statement를 생성한다.

        System.out.println( conn);
        String query = "SELECT sysdate from dual"; // 시스템의 현재 날짜시간을 출력하는 쿼리(query)
        ResultSet rs = stmt.executeQuery(query); // query를 실행한 결과를 rs에 담는다.

        // 실행결과가 담긴 rs에서 한 줄씩 읽어서 출력
        while (rs.next()) {
            String curDate = rs.getString(1);  // 읽어온 행의 첫번째 컬럼의 값을 String으로 읽어서 curDate에 저장
            System.out.println(curDate);       // 2022-01-11 13:53:00.0
        }
		

	}

}
