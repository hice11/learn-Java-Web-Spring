<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
//인코딩
request.setCharacterEncoding("UTF-8");
//데이터 얻어오기
String s_id = request.getParameter("s_id");
String s_name = request.getParameter("s_name");
String s_grade = request.getParameter("s_grade");
String teacher_id = request.getParameter("teacher_id");
String weekday = request.getParameter("weekday");
String start_h = request.getParameter("start_h");
String end_h = request.getParameter("end_h");

//데이터베이스 연동
String driver = "oracle.jdbc.driver.OracleDriver";
String url = "jdbc:oracle:thin:@localhost:1521:xe";
String user = "system";
String password = "1234";
//1. 오라클 드라이버 로딩
Class.forName(driver);
//2. 데이터베이스 연결
Connection con = DriverManager.getConnection(url, user, password);
//3. sql 작성
String sql = "insert into tbl_course_300 values(?, ?, ?, ?, ?, ?, ?)";
PreparedStatement pst = con.prepareStatement(sql);
//4. 데이터 등록
pst.setString(1, s_id);
pst.setString(2, s_name);
pst.setString(3, s_grade);
pst.setString(4, teacher_id);
pst.setString(5, weekday);
pst.setString(6, start_h);
pst.setString(7, end_h);
//5. sql 실행
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