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

Index!

  <a href="<c:url value="/login" />">로그인</a>
  <a href="<c:url value="/order.do" />">order</a>
  <a href="<c:url value="/border.do" />">border</a>

</body>
</html>