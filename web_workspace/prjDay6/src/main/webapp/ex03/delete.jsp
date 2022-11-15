<%@page import="java.sql.PreparedStatement"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="db.jsp" %>
<%
  //인코딩
  request.setCharacterEncoding("UTF-8");

  String id = request.getParameter("id");
  //sql 작성
  String sql = "DELETE tbl_course_300 WHERE s_id=?";
  PreparedStatement pst = con.prepareStatement(sql);
  pst.setString(1, id);
  //sql 실행
  pst.executeUpdate();
  //반납
  if(pst!=null) pst.close();
  if(con!=null) con.close();
  
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