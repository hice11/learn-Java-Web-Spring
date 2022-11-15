<%@page import="java.sql.PreparedStatement"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="db.jsp" %>
<%
//인코딩
request.setCharacterEncoding("UTF-8");
//데이터값 받아오기
String id = request.getParameter("id");
//sql 작성
String sql = "DELETE FROM tbl_reservation WHERE rev_id=?";
//Pre
PreparedStatement pst = con.prepareStatement(sql);
//sql의 파라미터값 등록
pst.setString(1, id);
//sql 실행
pst.executeUpdate();
//자원 반납
if(pst!=null) pst.close();
if(con!=null) con.close();
//페이지 이동
response.sendRedirect("list.jsp");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>삭제 완료</title>
</head>
<body>

</body>
</html>