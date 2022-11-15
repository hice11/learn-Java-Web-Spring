<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	table{
		width: 300px;
		border: 1px solid black;
	}
	td{
	border: 1px solid black;
	}
</style>
</head>
<body>

<table>
<%
	for(int i=1; i<=3; i++){
%>
	<tr>
		<td>a</td>
		<td>b</td>
		<td>c</td>
	</tr>
	
<% } %>
</table>
</body>
</html>