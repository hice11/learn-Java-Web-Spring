<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//데이터베이스 연동
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "system";
	String password = "1234"; 
	//오라클 드라이버 로딩
	Class.forName(driver);
	//데이터베이스 연결
	Connection con = DriverManager.getConnection(url, user, password);
	
	//연결 확인 테스트 코드
	if(con != null) out.println("ok");
	else out.println("fail");
%>