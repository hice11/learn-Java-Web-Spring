<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>구매정보 등록</title>
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
  
  <form action="reg-buy" method="post" id="frm">
    <table>
    <caption>구매정보 등록화면</caption>
      <tr>
        <td class="center">고객아이디</td>
        <td>
          <input type="text" name="userid">
        </td>
      </tr>
      <tr>
        <td class="center">구입물품</td>
        <td>
          <input type="text" name="prodname">
        </td>
      </tr>
      <tr>
        <td class="center">분류</td>
        <td>
          <select name="groupname">
            <option value="">선택</option>
            <option value="신발">신발</option>
            <option value="전자">전자</option>
            <option value="의류">의류</option>
            <option value="서적">서적</option>
          </select>
        </td>
      </tr>
      <tr>
        <td class="center">단가</td>
        <td>
          <input type="text" name="price">
        </td>
      </tr>
      <tr>
        <td class="center">판매수량</td>
        <td>
          <input type="text" name="amount">
        </td>
      </tr>
      <tr>
        <td colspan="2" class="center">
          <input type="button" value="등록" onclick="check()">
          <input type="reset" value="다시쓰기">
        </td>
      </tr>
    </table>
  </form>
  
</section>

<footer>
<h3>HRD KOREA</h3>
</footer>

<script type="text/javascript" src="<%=path %>/reg_buy.js"></script>

</body>
</html>