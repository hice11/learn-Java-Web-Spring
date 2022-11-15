<%@page import="model.Score"%>
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
  //데이터 꺼내기
  ArrayList<Score> list = (ArrayList<Score>)request.getAttribute("list");
%>
<%
  for(Score score:list){
%>
  <input type="text" value="<%=score.getName()%>">
  <input type="text" value="<%=score.getKor()%>">
  <input type="text" value="<%=score.getEng()%>">
  <input type="text" value="<%=score.getTotal()%>">
<%
  }
%>
</body>
</html>