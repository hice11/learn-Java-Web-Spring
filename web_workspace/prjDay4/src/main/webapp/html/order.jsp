<%@page import="prjDay4.Food"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style type="text/css">

table {
	width: 300px;
}

table, tr, td {
	border: 1px solid black;
	border-collapse: collapse;
	padding: 5px;
}
</style>

</head>
<body>

<%
// DB 조회하기

ArrayList<Food> list = new ArrayList<>();
list.add(new Food("빼빼로",1200));
list.add(new Food("솜사탕",1500));

%>

<table>

  <tr>
    <td>상품명</td>
    <td>가격</td>
  </tr>
  
 <% for(Food food : list) { %>
  <tr>
    <td><%=food.getName() %></td>
    <td><%=food.getPrice() %></td>
  </tr>
 <% } %>
 
</table>



</body>
</html>