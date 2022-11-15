<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="dbcon.jsp" %>
<%
	
	//sql 작성
	String sql = "select * from tbl_course_300";
	//prepareStatement 사용
	PreparedStatement pst = con.prepareStatement(sql);
	//sql 실행, 결과 저장 // sql 두번 사용하면 안됨
	ResultSet rs = pst.executeQuery();
	

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>수강과목 조회</title>

<link href="list.css" rel="stylesheet">

</head>
<body>

<table>
<caption>수강과목 조회</caption>

<tr>
	<td>과목코드</td>
    <td>과목명</td>
    <td>학점</td>
    <td>담당강사</td>
    <td>요일</td>
    <td>시작시간</td>
    <td>종료시간</td>
    <td></td>
</tr>

<%
// next : 데이터를 한 행 씩 담아온다 데이터 없으면 false
while(rs.next()){
%>

<tr>
	<td> <%= rs.getString(1) %> </td>
	<td> <%= rs.getString(2) %> </td>
	<td> <%= rs.getString(3) %> </td>
	<td> <%= rs.getString(4) %> </td>
	<td> <%= rs.getString(5) %> </td>
	<td> <%= rs.getString(6) %> </td>
	<td> <%= rs.getString(7) %> </td>
	<td> <a href="update.jsp?s_id=<%=rs.getString(1)%>">수정</a> / <a href="delete.jsp?s_id=<%=rs.getString(1)%>">삭제</a> </td>
</tr>

<% }
con.close();
pst.close();
rs.close();
%>

</table>

<input type="button" value="첫페이지" onclick="location.href='index.html'">

</body>
</html>