<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>참가자 등록 완료</title>
</head>
<body>

<%
  request.setCharacterEncoding("UTF-8");
  //넘어온 데이터 얻어오기
  String id = request.getParameter("join_id");
  String name = request.getParameter("join_nm");
  String birthY = request.getParameter("birthY");
  String birthM = request.getParameter("birthM");
  String birthD = request.getParameter("birthD");
  String gender = request.getParameter("gender");
  String skill = request.getParameter("specialty");
  String appeal = request.getParameter("charm");
  
  //넘어온 데이터 화면에 보여주기 (콘솔)
  //out.println("등록 완료");
  System.out.println("참가자Id: "+id);
  System.out.println("참가자이름: "+name);
  System.out.println("생년월일: "+birthY+"-"+birthM+"-"+birthD);
  System.out.println("성별: "+gender);
  System.out.println("실력무대: "+skill);
  System.out.println("매력무대: "+appeal);
  
  //데이터베이스에 저장
  
  Connection con = null;
  Statement st = null;
  ResultSet rs = null;
  
  try{
	  //데이터베이스 연동방법
	  String driver = "oracle.jdbc.driver.OracleDriver" ;
	  String url = "jdbc:oracle:thin:@localhost:1521:xe";
	  String user = "system";
	  String password = "1234";
	  
	  //1. 오라클드라이버 로딩
	  Class.forName(driver);
	  //2. 데이터베이스 연결
	  con = DriverManager.getConnection(url, user, password);
	  //3. statement 얻어오기
	  st = con.createStatement();
	  //4. 필요한 sql 작성
	  String sql = "select * from test_user";
	  //5. 최종적으로 실행
	  rs = st.executeQuery(sql);
	  //6. 가져온 쿼리 결과를 화면에 출력하기
	  while(rs.next()){
		  //out으로 브라우저에 출력
		  out.print(rs.getString(1));
		  out.print(rs.getString(2));
	  }
	  
  }catch(Exception e){
	  e.printStackTrace();
  }
  finally{
	  //자원의 반납
	  if(rs != null) rs.close();
	  if(st != null) st.close();
	  if(con != null) con.close();
  }
  
%>


</body>
</html>