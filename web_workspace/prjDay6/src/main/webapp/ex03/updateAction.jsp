<%@page import="java.sql.PreparedStatement"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="db.jsp" %>
<%
  //인코딩
  request.setCharacterEncoding("UTF-8");
  //데이터값 가져오기
  String s_id = request.getParameter("s_id");
  String s_name = request.getParameter("s_name");
  String s_grade = request.getParameter("s_grade");
  String teacher_id = request.getParameter("teacher_id");
  String weekday = request.getParameter("weekday");
  String start_h = request.getParameter("start_h");
  String end_h = request.getParameter("end_h");
  //sql 작성
  String sql = "UPDATE tbl_course_300 SET s_name=?, s_grade=?, teacher_id=?, weekday=?, start_h=?, end_h=? WHERE s_id=?";
  PreparedStatement pst = con.prepareStatement(sql);
  pst.setString(1, s_name);
  pst.setString(2, s_grade);
  pst.setString(3, teacher_id);
  pst.setString(4, weekday);
  pst.setString(5, start_h);
  pst.setString(6, end_h);
  pst.setString(7, s_id);
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
<title>수정 완료</title>
</head>
<body>

</body>
</html>