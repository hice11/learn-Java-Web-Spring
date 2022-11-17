<%@page import="model.Goods"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 정보 변경</title>

<%
  String path = request.getContextPath();
%>
<link rel="stylesheet" type="text/css" href="<%=path %>/index.css">
<link rel="stylesheet" type="text/css" href="<%=path %>/list.css">
<script type="text/javascript" src="<%=path %>/reg.js"></script>
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
<form action="goods-update" method="post" id="frm">
  <table>
  <caption>상품 정보 변경</caption>
    <tr>
      <td>상품코드</td>
      <td> <input type="text" name="goods_cd" readonly="readonly"> </td>
    </tr>
    <tr>
      <td>상품명</td>
      <td> <input type="text" name="goods_nm"> </td>
    </tr>
    <tr>
      <td>단가</td>
      <td> <input type="text" name="goods_price"> </td>
    </tr>
    <tr>
      <td>원가</td>
      <td> <input type="text" name="cost"> </td>
    </tr>
    <tr>
      <td>입고일자</td>
      <td> <input type="text" name="in_date" readonly="readonly"> </td>
    </tr>
  
    <tr>
      <td colspan="2" class="center">
        <input type="button" value="저장" onclick="check()">
        <input type="button" value="상품목록" onclick="location.href='goods-list'">
      </td>
    </tr>
  </table>
</form>
</section>

<footer>
  <h3>HRD KOREA</h3>
</footer>
</body>
</html>