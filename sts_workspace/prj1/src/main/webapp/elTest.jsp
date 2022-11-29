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

<h2> 저장소 pageContext, request, session, application</h2>

<%session.setAttribute("id","idS"); %>
<%request.setAttribute("id","idR"); %>
<%pageContext.setAttribute("id","idP"); %>
<%application.setAttribute("id","idA"); %>

<%
  String id = (String) session.getAttribute("id");
%>
<%= id %>
<br>

<!-- pageContext → request → session → application 의 순서로 가져온다 -->
${id} <br>

${sessionScope.id} <br>
${requestScope.id} <br>
${applicationScope.id} <br>
${pageScope.id} <br>
 
<%
  String test = "test";
  // EL은 저장소에 저장된것만 사용 가능
  pageContext.setAttribute("test", test);
%>
${test} <br>

<h1>JSTL</h1>

<!-- pageContext 저장소에 test2 키 값을 저장 -->
<c:set var="test2" value="test2입니다"></c:set>

${test2}

<h2>if문</h2>
<c:if test="${id2 == null}">
  <h2> 로그인하세요 ! </h2>
</c:if>

<c:if test="${id2 eq null}">
  <h2> 로그인하세요 ! </h2>
</c:if>

<c:if test="${empty id2}">
  <h2> 로그인하세요 ! </h2>
</c:if>

<% pageContext.setAttribute("id2", "testid2"); %>

<c:if test="${id2 != null}">
  <h2>로그인 상태입니다.</h2>
</c:if>

<c:if test="${id2 ne null}">
  <h2>로그인 상태입니다.</h2>
</c:if>

<c:if test="${not empty id2}">
  <h2>로그인 상태입니다.</h2>
</c:if>



<%
  ArrayList<String> list = new ArrayList<String>();
  list.add("일");
  list.add("이");
  list.add("삼");
  
  pageContext.setAttribute("list", list);
%>

<c:forEach var="str" items="${list}">
  ${st.count} ${ str } 
  <br>
</c:forEach>
<br><br>
<c:forEach var="str" items="${list}" varStatus="st">
  index : ${st.index} ${ str } | 
  count : ${st.count} ${ str } 
  <br>
</c:forEach>


</body>
</html>