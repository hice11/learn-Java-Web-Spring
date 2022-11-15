<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
//인코딩 
request.setCharacterEncoding("UTF-8");
//데이터 가져오기
String s_id = request.getParameter("s_id");

//디비 연동
String driver = "oracle.jdbc.driver.OracleDriver";
String url = "jdbc:oracle:thin:@localhost:1521:xe";
String user = "system";
String password = "1234";

//오라클 드라이버 로딩
Class.forName(driver);
//디비 연결
Connection con = DriverManager.getConnection(url, user, password);
//sql
// sql 작성
String sql = "insert into tbl_course_300 values(?,?,?,?,?,?,?)";
PreparedStatement pst = con.prepareStatement(sql);
// 데이터 등록
pst.setString(1, s_id);
// sql 실행
pst.executeUpdate();
//페이지 이동
response.sendRedirect("index.html");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>등록 완료</title>
</head>
<body>

</body>
</html>