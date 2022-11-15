<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.Score"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>scoreView</title>
</head>
<body>

  View3
  
  <%
    Score score = (Score)request.getAttribute("score");
  %>
  
  <input type="text" value="<%=score.getName()%>">
  <input type="text" value="<%=score.getKor()%>">
  <input type="text" value="<%=score.getEng()%>">
  <input type="text" value="<%=score.getTotal()%>">

</body>
</html>