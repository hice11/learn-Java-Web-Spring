<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
  //연결정보
  // 데이터베이스에 등록
  String driver = "oracle.jdbc.driver.OracleDriver" ;
  String url = "jdbc:oracle:thin:@localhost:1521:xe";
  String user = "system";
  String password = "1234";
  
  //드라이브 로드
  Class.forName(driver);
  
  //디비 연결
  Connection con = DriverManager.getConnection(url, user, password);
  if(con != null){
	  out.println("db ok");
  }else{
	  out.println("db fail");
  }
  
  //sql 작성 및 실행
  String sql = "select * from tbl_course_300";
  Statement st = con.createStatement();
  ResultSet rs = st.executeQuery(sql);

%>    
    
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>수강과목 조회</title>

<link rel="stylesheet" type="text/css" href="list.css">

</head>
<body>

<form action="" name="frm2" method="post">
<h3>수강과목 조회</h3>
<table>
<tr>
  <td>과목코드</td>
  <td>과목명</td>
  <td>학점</td>
  <td>강사코드</td>
  <td>요일</td>
  <td>시작시간</td>
  <td>종료시간</td>
</tr>

<% while(rs.next()) { %>
<tr>
  <td> <%= rs.getString(1) %> </td>
  <td> <%= rs.getString(2) %> </td>
  <td> <%= rs.getString(3) %> </td>
  <td> <%= rs.getString(4) %> </td>
  <td> <%= rs.getString(5) %> </td>
  <td> <%= rs.getString(6) %> </td>
  <td> <%= rs.getString(7) %> </td>
</tr>
<%} 
rs.close();
st.close();
%>
</table>
</form>

</body>
</html>