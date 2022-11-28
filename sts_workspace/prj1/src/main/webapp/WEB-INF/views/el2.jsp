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

<%
  //ArrayList<String> list = (ArrayList<String>) request.getAttribute("list");
  //for(String string : list){
	//  out.println(string);
  //}
  
  String test="test 입니다";
%>
${test} -> EL로 불가능
<h2>JSTL + EL</h2>
<c:forEach var="item" items="${list}">
   <p> ${item} </p>
</c:forEach>

<c:set var="message" value="비로그인"></c:set>

<c:if test="${message eq '비로그인'}">
  <h2>로그인</h2>
</c:if>

</body>
</html>