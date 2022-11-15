<%@page import="model.SalesProd"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>점포별 매출현황(회원)</title>
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
	    <th>물품명</th>
	    <th>분류</th>
	    <th>총매출액</th>
	    <th>순위</th>
	  </tr>  
  </thead>
  <tbody>
  <%
    ArrayList<SalesProd> list = (ArrayList<SalesProd>) request.getAttribute("list");
    for(SalesProd sales : list){
  %>
	  <tr>
	    <td><%=sales.getProdname() %></td>
	    <td class="right"><%=sales.getGroupname() %></td>
	    <td class="right"><%=sales.getSales() %></td>
	    <td class="right"><%=sales.getRank() %></td>
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