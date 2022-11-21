<%@page import="model.CourseList"%>
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
<title><%=courseName %> 강좌 목록</title>
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
    <caption><%=courseName %> 강좌 목록</caption>
    <thead>
      <tr>
        <th class="center">강좌코드</th>
        <th class="center">강좌명</th>
        <th class="center">강사이름</th>
        <th class="center">수강료</th>
        <th class="center">기간</th>
      </tr>
    </thead>
    
    <tbody>
<%
  request.setCharacterEncoding("UTF-8");
  ArrayList<CourseList> list = (ArrayList<CourseList>)request.getAttribute("list");
  for(CourseList course : list){
%>
      <tr>
        <td class="center"><%=course.getCo_code() %></td>
        <td><%=course.getCo_name() %></td>
        <td><%=course.getInst_name() %></td>
        <td><%=course.getPrice() %></td>
        <td><%=course.getDate() %></td>
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