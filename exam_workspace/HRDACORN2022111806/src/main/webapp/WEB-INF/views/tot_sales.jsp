<%@page import="model.TotalSales"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>점포별 매출현황(전체)</title>
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
    <caption>점포별 매출현황(전체)</caption>
    <thead>
      <tr>
        <th class="center">매출순번</th>
        <th class="center">회원아이디</th>
        <th class="center">회원명</th>
        <th class="center">물품명</th>
        <th class="center">분류</th>
        <th class="center">단가</th>
        <th class="center">수량</th>
        <th class="center">매출액</th>
      </tr>
    </thead>
    
    <tbody>
<%
  request.setCharacterEncoding("UTF-8");
  ArrayList<TotalSales> list = (ArrayList<TotalSales>)request.getAttribute("list");
  for(TotalSales total : list){
%>
      <tr>
        <td class="center"><%=total.getNum() %></td>
        <td class="right"><%=total.getUserid() %></td>
        <td class="right"><%=total.getName() %></td>
        <td class="right"><%=total.getProdname() %></td>
        <td class="center"><%=total.getGroupname() %></td>
        <td class="center"><%=total.getPrice() %></td>
        <td class="center"><%=total.getAmount() %></td>
        <td class="center"><%=total.getSales() %></td>
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