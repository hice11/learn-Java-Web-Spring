<%@page import="model.Member"%>
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


<table>
  <tr>
    <td>아이디</td>
    <td>비번</td>
  </tr>

<%
  ArrayList<Member> list = (ArrayList<Member>) request.getAttribute("list");

  for(Member member : list){
%>  
  <tr>
    <td> <%= member.getId() %> </td>
    <td> <%= member.getPw() %> </td>
  </tr>
<% } %>
</table>

</body>
</html>