<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	//입력 값 받아오기
	String s_id = request.getParameter("s_id");
	String weekday = request.getParameter("weekday");

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
	
	//sql 작성
	String sql = "UPDATE tbl_course_300 SET weekday = ? where s_id  = ?";
	PreparedStatement pst = con.prepareStatement(sql);
	//데이터 입력
	pst.setString(1, weekday);
	pst.setString(2, s_id);
	//sql 실행
	pst.executeUpdate();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>변경 완료</title>
</head>
<body>

</body>
</html>