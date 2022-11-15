<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
//디비연동
String driver = "oracle.jdbc.driver.OracleDriver";
String url = "jdbc:oracle:thin:@localhost:1521:xe";
String user = "system";
String password = "1234";
//오라클 드라이버 로딩
Class.forName(driver);
//디비 연결
Connection con = DriverManager.getConnection(url, user, password);

//연결 확인
if(con != null) System.out.println("ok");
else System.out.println("fail");
%>