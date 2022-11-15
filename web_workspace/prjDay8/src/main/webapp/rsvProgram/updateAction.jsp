<%@page import="java.sql.PreparedStatement"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="db.jsp" %>
<%
//인코딩
request.setCharacterEncoding("UTF-8");
//데이터값 받아오기
String rev_id = request.getParameter("rev_id");
String join_no = request.getParameter("join_no");
String kind = request.getParameter("kind");
String rev_dt = request.getParameter("rev_dt");
String certification = request.getParameter("certification");
String ck = request.getParameter("ck");
//sql 작성
String sql = "UPDATE tbl_reservation SET join_no=?, kind=?, rev_dt=?, certification=?, ck=? WHERE rev_id=?";
//Pre~
PreparedStatement pst = con.prepareStatement(sql);
//sql 파라미터 등록
pst.setString(1, join_no);
pst.setString(2, kind);
pst.setString(3, rev_dt);
pst.setString(4, certification);
pst.setString(5, ck);
pst.setString(6, rev_id);
//sql 실행
pst.executeUpdate();
//자원 반납
if(pst!=null) pst.close();
if(con!=null) con.close();
//페이지이동
response.sendRedirect("list.jsp");
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