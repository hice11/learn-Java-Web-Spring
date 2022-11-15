<%@page import="java.sql.PreparedStatement"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="dbcon.jsp" %>    
<%
  //값 얻어오기
  String id = request.getParameter("s_id");
  out.print(id);
  //sql 작성
  String sql = " DELETE FROM tbl_course_300 WHERE s_id= ? ";
  //sql 실행
  PreparedStatement pst = con.prepareStatement(sql);
  pst.setString(1, id);
  pst.executeUpdate();
  
  //자원 반납
  pst.close();
  con.close();
  
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