<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>view</title>


<%
//context path
String path =  request.getContextPath();   //현재 프로젝트의 이름 얻어옴 , 프로젝트1개 => 한 개의 웹사이트 %> 
<link rel="stylesheet"   href="<%=path%>/css/hi.css"/> 

</head>


<body>

<%
  String result = (String)request.getAttribute("result");
%>

<h2>view</h2>

<input type="text" value="<%=result%>">

</body>
</html>