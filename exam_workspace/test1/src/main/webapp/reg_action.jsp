<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="dbcon.jsp" %>

<%
  request.setCharacterEncoding("UTF-8");

  //form 데이터 받기
  String rev_id = request.getParameter("rev_id");
  String join_no = request.getParameter("join_no");
  String kind = request.getParameter("kind");
  String rev_dt = request.getParameter("rev_dt");
  String certification = request.getParameter("certification");
  String ck = request.getParameter("ck");
  
  //out.println(rev_id);

  //데이터베이스 등록
  String sql = "INSERT INTO tbl_reservation VALUES (?, ?, ?, ?, ?, ?)";
  PreparedStatement pst = con.prepareStatement(sql);
  pst.setString(1, rev_id);
  pst.setString(2, join_no);
  pst.setString(3, kind);
  pst.setString(4, rev_dt);
  pst.setString(5, certification);
  pst.setString(6, ck);
  
  pst.executeUpdate();
  
  pst.close();
  con.close();
  
  //페이지 이동
  response.sendRedirect("index.jsp");

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>예약등록</title>
</head>
<body>


</body>
</html>