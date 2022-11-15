<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>수강과목 등록 완료</title>
</head>
<body>

<%
//넘어온 데이터
  request.setCharacterEncoding("UTF-8");
  String s_id = request.getParameter("s_id");
  String s_name = request.getParameter("s_name");
  String teacher_id = request.getParameter("teacher_id");
  String s_grade = request.getParameter("s_grade");
  String weekday = request.getParameter("weekday");
  String start_h = request.getParameter("start_h");
  String end_h = request.getParameter("end_h");
  out.println(s_id);
  out.println(s_name);
  out.println(teacher_id);
  out.println(s_grade);
  out.println(weekday);
  out.println(start_h);
  out.println(end_h);

//데이터베이스에 등록
  Connection con = null;
  Statement st = null;
  ResultSet rs = null;
	  //데이터베이스 연동방법
	  String driver = "oracle.jdbc.driver.OracleDriver" ;
	  String url = "jdbc:oracle:thin:@localhost:1521:xe";
	  String user = "system";
	  String password = "1234";
	  
	  //1. 오라클드라이버 로딩
	  Class.forName(driver);
	  //2. 데이터베이스 연결
	  con = DriverManager.getConnection(url, user, password);
	  //3. sql작성, 실행 
	  // statement 얻어오기
	  st = con.createStatement();
	  // 필요한 sql 작성
	  //String sql = "insert into tbl_course_300 values('1011', '한식만들기', 2, 1, 'M', 0900, 1100)";
	  String sql = "insert into tbl_course_300 values(?, ?, ?, ?, ?, ?, ?)";
	  PreparedStatement pst = con.prepareStatement(sql);
	  //데이터베이스의 순서대로 등록
	  pst.setString(1, s_id);
	  pst.setString(2, s_name);
	  pst.setString(3, s_grade);
	  pst.setString(4, teacher_id);
	  pst.setString(5, weekday);
	  pst.setString(6, start_h);
	  pst.setString(7, end_h);
	  // 실행
	  // PreparedStatement 로 실행
	  pst.executeUpdate();
	  
	  //6. 가져온 쿼리 결과를 화면에 출력하기
  /*
  
	  
  try{
	  
	  }
  }catch(Exception e){
	  e.printStackTrace();
  }
  finally{
	  //자원의 반납
	  
  }
  */
  
//페이지 이동

response.sendRedirect("index.html");

%>

</body>
</html>