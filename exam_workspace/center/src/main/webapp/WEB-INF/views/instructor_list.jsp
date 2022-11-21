<%@page import="model.Instructor"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<%
  String path = request.getContextPath();
  String courseName = (String) request.getAttribute("name");
%>
<title>강사 조회</title>
<link rel="stylesheet" type="text/css" href="<%=path %>/index.css">
<link rel="stylesheet" type="text/css" href="<%=path %>/table.css">
</head>
<body>

<header>
  <h2>AC 문화센터</h2>
</header>
<nav>
  <ul>
    <li>
      <a href="reg-course">강좌 등록</a>
    </li>
    <li>
      <a href="branch-list">지점 조회</a>
    </li>
    <li>
      <a href="instructor-list">강사 조회</a>
    </li>
    <li>
      <a href="index.html">홈으로</a>
    </li>
  </ul>
</nav>

<section>
  
  <table>
    <caption>강사 조회</caption>
    <thead>
      <tr>
        <th class="center">강사코드</th>
        <th class="center">강사이름</th>
        <th class="center">이메일</th>
        <th class="center">담당강좌</th>
      </tr>
    </thead>
    
    <tbody>
<%
  request.setCharacterEncoding("UTF-8");
  ArrayList<Instructor> list = (ArrayList<Instructor>) request.getAttribute("list");
  for(Instructor instructor: list){
	  String[] strs = instructor.getCo_name().split(",");
	  String result = "";
	  for(int i=0; i<strs.length; i++){
      	result += strs[i] + "<br>";  	
      }
%>
      <tr>
        <td class="center"><%= instructor.getInst_code() %></td>
        <td><%= instructor.getInst_name() %></td>
        <td><%= instructor.getInst_email() %></td>
        <td><%= result %></td>
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