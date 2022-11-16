<%@page import="model.Candidate"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>후보자 조회</title>
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
  <caption>후보자 조회</caption>
  <thead>
	  <tr>
	    <th>후보자번호</th>
	    <th>후보이름</th>
	    <th>후보자주민번호</th>
	    <th>후보자학위</th>
	    <th>당번호</th>
	    <th>당전화번호</th>
	  </tr>
  </thead>
  <tbody>
<%
  ArrayList<Candidate> list = (ArrayList<Candidate>)request.getAttribute("list");
  for(Candidate cand : list){
%>
	  <tr>
	    <td><%=cand.getN_no() %></td>
	    <td><%=cand.getN_name() %></td>
	    <td><%=cand.getN_jumin() %></td>
	    <td><%=cand.getN_degree() %></td>
	    <td><%=cand.getP_no() %></td>
	    <td><%=cand.getP_tel() %></td>
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