<%@page import="model.Store"%>
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
<%
  request.setCharacterEncoding("UTF-8");
  ArrayList<Store> list = (ArrayList<Store>)request.getAttribute("list");
  String store_name = (String)request.getAttribute("store_name");
%>
  <table>
  <caption> <%= store_name %> </caption>
    <thead  class="center">
      <tr>
        <th>판매구분</th>
        <th>판매번호</th>
        <th>판매일자</th>
        <th>상품명</th>
        <th>판매수량</th>
        <th>판매금액</th>
        <th>수취구분</th>
      </tr>
    </thead>
    <tbody>
<%
  
  for(Store store : list){
%>
      <tr>
        <td> <%= store.getSale_fg() %> </td>
        <td> <%= store.getSale_no() %> </td>
        <td> <%= store.getSale_ymd() %> </td>
        <td> <%= store.getGoods_nm() %> </td>
        <td> <%= store.getSale_cnt() %> </td>
        <td> <%= store.getSales() %> </td>
        <td> <%= store.getPay_type() %> </td>
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