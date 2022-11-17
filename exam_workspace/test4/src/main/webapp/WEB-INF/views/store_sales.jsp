<%@page import="model.StoreSales"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>점포별 매출현황</title>

<%
  String path = request.getContextPath();
%>
<link rel="stylesheet" type="text/css" href="<%=path %>/index.css">
<link rel="stylesheet" type="text/css" href="<%=path %>/list.css">
</head>
<body>

<header>
  <h2>한양 GS 매출관리 ver 1.0</h2>
</header>

<nav>
  <ul>
    <li> <a href="goods-list">상품관리</a> </li>
    <li> <a href="store-sales">매출현황</a> </li>
    <li> <a href="index.html">홈으로</a> </li>
  </ul>
</nav>

<section>

  <table>
  <caption>점포별 매출현황</caption>
    <thead  class="center">
      <tr>
        <th>점포명</th>
        <th>현금매출</th>
        <th>카드매출</th>
        <th>총매출</th>
      </tr>
    </thead>
    <tbody>
<%
  request.setCharacterEncoding("UTF-8");
  ArrayList<StoreSales> list = (ArrayList<StoreSales>)request.getAttribute("list");
  for(StoreSales sales : list){
%>
      <tr>
        <td class="center"> <a href="store?code=<%=sales.getStore_cd() %>&name=<%= sales.getStore_nm() %>"> <%= sales.getStore_nm() %> </a> </td>
        <td> <%=sales.getCash_sales() %> </td>
        <td> <%=sales.getCard_sales() %> </td>
        <td> <%=sales.getTot_sales() %> </td>
      </tr>
<% } %>
    </tbody>
  </table>

</section>

<footer>
  <h3>HRD KOREA</h3>
</footer>
</body>
</html>