<%@page import="model.Goods"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품목록</title>

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
  <caption>상품목록</caption>
    <thead>
      <tr>
        <th>상품코드</th>
        <th>상품명</th>
        <th>판매단가</th>
        <th>(상품)원가</th>
        <th>입고일자</th>
      </tr>
    </thead>
    <tbody>
<%
  request.setCharacterEncoding("UTF-8");
  ArrayList<Goods> list = (ArrayList<Goods>)request.getAttribute("list");
  for(Goods goods : list){
%>
      <tr>
        <td class="center"> <a href="goods-update?code=<%=goods.getGoods_cd() %>"> <%=goods.getGoods_cd() %> </a> </td>
        <td> <%=goods.getGoods_nm() %> </td>
        <td> <%=goods.getGoods_price() %> </td>
        <td> <%=goods.getCost() %> </td>
        <td> <%=goods.getIn_date() %> </td>
      </tr>
<% } %>
      <tr>
        <td colspan="5" class="center">
          <input type="button" value="등록" onclick="location.href='goods-reg'">
        </td>
      </tr>
    </tbody>
  </table>

</section>

<footer>
  <h3>HRD KOREA</h3>
</footer>
</body>
</html>