<%@page import="java.util.ArrayList"%>
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

<c:set var="age" value="22"></c:set>

<c:if test="${age <= 19}">
  <p>미성년자 입니다.</p>
</c:if>

<c:if test="${age > 19}">
  <p>성인 입니다.</p>
</c:if>

<%
  ArrayList<String> list = new ArrayList<String>();
  list.add("햄버거");
  list.add("피자");
  list.add("치킨");
  
  pageContext.setAttribute("list", list);
%>

<c:forEach var="str" items="${list}" varStatus="s">
  ${s.count}. ${str}
</c:forEach>



</body>
</html>