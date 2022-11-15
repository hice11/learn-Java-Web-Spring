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
  String[] strs = (String[])request.getAttribute("result");

  for(String message : strs){
	  out.println(message);
  }
%>

</body>
</html>