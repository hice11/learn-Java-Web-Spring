<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="db.jsp" %>
<%
  //sql 작성
  String sql = "select s_id, s_name, s_grade, teacher_id, trim(weekday), lpad(start_h,4,'0'), end_h FROM tbl_course_300 ORDER BY CAST(s_id AS number)";
  //sql 실행
  PreparedStatement pst = con.prepareStatement(sql);
  //결과값 저장
  ResultSet rs = pst.executeQuery();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>수강과목 조회</title>
<link rel="stylesheet" type="text/css" href="list.css">
</head>
<body>
<h3>수강과목 조회</h3>
<table>
  <tr>
    <td>교과목 코드</td>
    <td>교과명</td>
    <td>학점</td>
    <td>강사번호</td>
    <td>요일</td>
    <td>수업시작시간</td>
    <td>수업종료시간</td>
  </tr>

<%
while(rs.next()){
%>  
  <tr>
    <td> <%=rs.getString(1) %> </td>
    <td> <%=rs.getString(2) %> </td>
    <td> <%=rs.getString(3) %> </td>
    <td> <%=rs.getString(4) %> </td>
    <td> <%=rs.getString(5) %> </td>
    <td> <%=rs.getString(6) %> </td>
    <td> <%=rs.getString(7) %> </td>
  </tr>
<% }
if(rs!=null) rs.close();
if(pst!=null) pst.close();
if(con!=null) con.close();
%>
</table>
<input type="button" value="첫페이지" onclick="location.href='index.html'"> 

</body>
</html>