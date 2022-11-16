<%@page import="model.Voter"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>투표자 조회</title>
<%
  String path = request.getContextPath();
%>
<link rel="stylesheet" type="text/css" href="<%=path %>/index.css">
<link rel="stylesheet" type="text/css" href="<%=path %>/view.css">
</head>
<body>

<header>
  <h2>HY 투표관리 ver 1.0</h2>
</header>
<nav>
  <ul>
    <li> <a href="cand">후보자조회</a> </li>
    <li> <a href="reg-vote">투표등록</a> </li>
    <li> <a href="voter">투표자조회</a> </li>
    <li> <a href="votes">득표조회</a> </li>
    <li> <a href="index.html">홈으로</a> </li>
  </ul>
</nav>

<section>
  <table class="center">
  <caption>투표자 조회</caption>
  <thead>
	  <tr>
	    <th>투표자이름</th>
	    <th>투표자생년월일</th>
	    <th>투표자나이</th>
	    <th>투표자성별</th>
	    <th>투표장</th>
	    <th>유권자확인</th>
	  </tr>
  </thead>
  <tbody>
<%
  ArrayList<Voter> list = (ArrayList<Voter>) request.getAttribute("list");
  for(Voter voter : list){
%>
	  <tr>
	    <td><%=voter.getV_name() %></td>
	    <td><%=voter.getV_jumin() %></td>
	    <td><%=voter.getV_age() %></td>
	    <td><%=voter.getV_gender() %></td>
	    <td><%=voter.getV_area() %></td>
	    <td><%=voter.getV_confirm() %></td>
	  </tr>
<%
  }
%>
  </tbody>
</table>

</section>

<footer>
  <h3>HRD KOREA</h3>
</footer>

</body>
</html>