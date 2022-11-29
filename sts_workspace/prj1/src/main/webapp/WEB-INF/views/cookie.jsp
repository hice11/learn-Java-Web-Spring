<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<!-- ${cookie.id.value} -->

<%
  Cookie[] cookies = request.getCookies();
  for(Cookie cookie : cookies){
    out.println(cookie.getName());
    out.println(cookie.getValue());
  }
%>
<!-- 
<c:forEach var="ck" items="${cookies}">
  
</c:forEach>
 -->
</body>
</html>