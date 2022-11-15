<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="db.jsp" %>
<%

//sql 작성
String sql = "SELECT DECODE(j.region, 'P','부산', 'S','서울', 'K','경기'), COUNT(r.rev_id) cnt FROM tbl_reservation r JOIN tbl_join_12 j ON r.join_no  = j.id WHERE r.ck != 'N' GROUP BY region ORDER BY cnt desc";
//Pre
PreparedStatement pst = con.prepareStatement(sql);
//db를 rs에 저장하고 실행
ResultSet rs = pst.executeQuery();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>지역별 백신예약 인원수</title>
<link href="list.css" rel="stylesheet" type="text/css">
<link href="index.css" rel="stylesheet" type="text/css">
</head>
<body>

<header>
  <h1>백신예약 및 접종 조회 프로그램</h1>
</header>

<nav>
  <span> <a href="reserv.jsp">백신 예약</a> </span>
  <span> <a href="list.jsp">백신 예약 현황</a> </span>
  <span> <a href="region.jsp">백신 지역별 접종 횟수 조회</a> </span>
  <span> <a href="index.html">홈으로</a> </span>
</nav>

<section>
  <table class="regionT">
    <caption>지역별 백신예약 인원수</caption>
    <tr>
      <td>지역</td>
      <td>인원수</td>
    </tr>
<%
while(rs.next()){
%>
    <tr>
      <td> <%=rs.getString(1) %> </td>
      <td> <%=rs.getString(2) %> </td>
    </tr>
<%}
//반납
if(rs!=null) rs.close();
if(pst!=null) pst.close();
if(con!=null) con.close();
%>
  </table>
</section>

<footer>
  <h4>백신예약 및 접종 조회 프로그램</h4>
</footer>

</body>
</html>