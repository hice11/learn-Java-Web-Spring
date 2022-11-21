<%@page import="model.Branch"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>지점 조회</title>
<%
  String path = request.getContextPath();
%>
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
    <caption>지점 조회</caption>
    <thead>
      <tr>
        <th class="center">지점코드</th>
        <th class="center">지점명</th>
        <th class="center">지역</th>
        <th class="center">전화번호</th>
      </tr>
    </thead>
    
    <tbody>
<%
  request.setCharacterEncoding("UTF-8");
  ArrayList<Branch> list = (ArrayList<Branch>)request.getAttribute("list");
  for(Branch branch : list){
%>
      <tr>
        <td class="center"> <a href="/center/course-list?code=<%=branch.getBr_code() %>&name=<%=branch.getBr_name() %>"> <%=branch.getBr_code() %> </a></td>
        <td><%=branch.getBr_name() %></td>
        <td><%=branch.getBr_region() %></td>
        <td><%=branch.getBr_tel() %></td>
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