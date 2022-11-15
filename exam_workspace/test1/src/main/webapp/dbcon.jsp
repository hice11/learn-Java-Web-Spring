<%@page import="org.apache.catalina.filters.SetCharacterEncodingFilter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.sql.*" %> 
<% 
	String driver = "oracle.jdbc.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521/xe";
	String user = "system";
	String password = "1234";
	Class.forName(driver);
	Connection con = DriverManager.getConnection(url, user, password);
	//if(con!=null) out.println("db ok");
%>
 