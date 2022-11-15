<%@page import="java.sql.PreparedStatement"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="db.jsp" %>
<%
//값 받아오기
String id = request.getParameter("id");
//sql 작성
String sql = "DELETE FROM tbl_course_300 WHERE s_id=?";
//sql 파라미터 등록
PreparedStatement pst = con.prepareStatement(sql);
pst.setString(1, id);
//sql 실행
pst.executeUpdate();
//반납
if(pst!=null)pst.close();
if(con!=null)con.close();
//페이지 이동
response.sendRedirect("listM.jsp");
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