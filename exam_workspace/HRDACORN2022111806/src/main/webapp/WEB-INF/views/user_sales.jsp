<%@page import="model.UserSales"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>점포별 매출현황(회원)</title>
</head>
<%
  String path = request.getContextPath();
%>
<link rel="stylesheet" type="text/css" href="<%=path %>/index.css">
<link rel="stylesheet" type="text/css" href="<%=path %>/table.css">
</head>

<body>

<header>
<h2>HY쇼핑몰</h2>
</header>

<nav>
  <ul>
    <li>
      <a href="reg-buy">구매정보 등록</a>
    </li>
    <li>
      <a href="tot-sales">점포별 매출현황(전체)</a>
    </li>
    <li>
      <a href="user-sales">점포별 매출현황(회원)</a>
    </li>
    <li>
      <a href="prod-sales">점포별 매출현황(물품)</a>
    </li>
    <li>
      <a href="index.html">홈으로</a>
    </li>
  </ul>
</nav>

<section>
  
    <table>
    <caption>점포별 매출현황(회원)</caption>
    <thead>
      <tr>
        <th class="center">회원id</th>
        <th class="center">회원명</th>
        <th class="center">지역명</th>
        <th class="center">출생년도</th>
        <th class="center">총매출액</th>
      </tr>
    </thead>
    
    <tbody>
<%
  ArrayList<UserSales> list = (ArrayList<UserSales>)request.getAttribute("list");
  for(UserSales user : list){
%>
      <tr>
        <td class="center"><%= user.getUserid() %></td>
        <td class="right"><%= user.getName() %></td>
        <td class="right"><%= user.getAddr() %></td>
        <td class="right"><%= user.getBirthday() %></td>
        <td class="center"><%= user.getTotSales() %></td>
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