<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="db.jsp" %>
<%
//sql 작성
String sql = "SELECT rev_id, name, tel, DECODE(kind, 'H','화이자', 'M','모더나', 'Y','얀센'), TO_CHAR(rev_dt, 'yyyy/mm/dd'), DECODE(certification, 'C','휴대폰', 'I','아이핀', 'P','공인인증'), DECODE(ck, 'Y','완료', 'N','미완료') FROM tbl_reservation r join tbl_join_12 j ON r.join_no = j.id";
//PreparedStatement
PreparedStatement pst = con.prepareStatement(sql);
//db를 ResultSet에 저장하고 실행
ResultSet rs = pst.executeQuery();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>백신 예약 현황 조회</title>
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
  <table>
    <caption>백신 예약 현황 조회</caption>
    <tr>
      <td>예약번호</td>
      <td>이름</td>
      <td>전화번호</td>
      <td>백신종류</td>
      <td>예약일자</td>
      <td>본인인증</td>
      <td>접종상태</td>
      <td></td>
    </tr>
    
<%
//반복문 데이터 출력
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
      <td>
        <a class="aList" href="update.jsp?id=<%=rs.getString(1) %>">수정</a> | 
        <a class="aList" href="delete.jsp?id=<%=rs.getString(1) %>">삭제</a>
      </td>
    </tr>
<%
}
//자원 반납
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