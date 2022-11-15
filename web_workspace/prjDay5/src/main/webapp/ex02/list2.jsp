<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<%

//디비 연동
String driver = "oracle.jdbc.driver.OracleDriver";
String url = "jdbc:oracle:thin:@localhost:1521:xe";
String user = "system";
String password = "1234";
//오라클 드라이버 로딩
Class.forName(driver);
//디비 연결
Connection con = DriverManager.getConnection(url, user, password);
//statement 가져오기
Statement st = con.createStatement();
//sql 작성
String sql = "select * from tbl_course_300";
//sql 결과 저장, 실행
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
<h2>수강과목 조회</h2>
<table>
  <tr>
    <td>과목코드</td>
    <td>과목명</td>
    <td>학점</td>
    <td>담당강사</td>
    <td>요일</td>
    <td>시작시간</td>
    <td>종료시간</td>
  </tr>
<% while(rs.next()) { %>  
  <tr>
  	<td> <%= rs.getString(1) %> </td>
  </tr>
  
<%}
//자원 반납
con.close();
st.close();
rs.close();
%>  
</table>
<input type="button" value="첫페이지" onclick="location.href='index.html'">


</body>
</html>