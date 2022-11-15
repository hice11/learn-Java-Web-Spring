<%@page import="prjDay3.Food"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
ArrayList<Food> list = (ArrayList<Food>) request.getAttribute("foodList");
%>

<h3>음식LIST</h3>

<table>
<% for(int i=0; i<list.size(); i++){ 
	Food food = list.get(i);
%>
  <tr>
    <td><%=food.getName() %></td>
    <td><%=food.getPrice() %></td>
  </tr>
<% } %>
  
</table>

</body>
</html>