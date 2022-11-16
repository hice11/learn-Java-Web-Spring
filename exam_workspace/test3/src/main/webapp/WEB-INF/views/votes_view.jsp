<%@page import="model.Votes"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>득표 조회</title>
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
  <caption>득표 조회</caption>
  <thead>
	  <tr>
	    <th>후보자번호</th>
	    <th>후보자이름</th>
	    <th>후보자득표수</th>
	  </tr>
  </thead>
  <tbody>
<%
  ArrayList<Votes> list = (ArrayList<Votes>) request.getAttribute("list");
  for(Votes votes: list){
%>
	  <tr>
	    <td><%=votes.getN_no() %></td>
	    <td><%=votes.getN_name() %></td>
	    <td><%=votes.getN_votes() %></td>
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