<%@page import="model.SalesTotal"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>점포별 매출현황(전체)</title>
<%
	String path = request.getContextPath();
%>
<link rel="stylesheet" type="text/css" href="<%=path %>/index.css">
<link rel="stylesheet" type="text/css" href="<%=path %>/sales.css">
</head>
<body>

<header>
  <h3>HY쇼핑몰</h3>
</header>

<nav>
  <ul>
    <li> <a href="reg-buy">구매정보 등록화면</a> </li>
    <li> <a href="sales1">점포별 매출현황(전체)</a> </li>
    <li> <a href="sales2">점포별 매출현황(회원)</a> </li>
    <li> <a href="sales3">점포별 매출현황(물품)</a> </li>
  </ul>
</nav>

<section>

  <table>
  <caption>점포별 매출현황</caption>
  <thead>
	  <tr>
	    <th>매출순번</th>
	    <th>회원아이디</th>
	    <th>회원명</th>
	    <th>물품명</th>
	    <th>분류</th>
	    <th>단가</th>
	    <th>수량</th>
	    <th>매출액</th>
	  </tr>  
  </thead>
  <tbody>
  <%
    ArrayList<SalesTotal> list = (ArrayList<SalesTotal>) request.getAttribute("list");
    for(SalesTotal sales : list){
  %>
	  <tr>
	    <td><%= sales.getNum() %></td>
	    <td class="right"><%= sales.getUserid() %></td>
	    <td class="right"><%= sales.getName() %></td>
	    <td><%= sales.getProdname() %></td>
	    <td><%= sales.getGroupname() %></td>
	    <td><%= sales.getPrice() %></td>
	    <td><%= sales.getAmount() %></td>
	    <td><%= sales.getSales() %></td>
	  </tr>
  <%
    }
  %>
  </tbody>
</table>


</section>

<footer>
  <h4>HY쇼핑몰</h4>
</footer>

</body>
</html>