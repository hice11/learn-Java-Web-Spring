<%@page import="mvc.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>School</title>

<style>
*{
	margin: 10px;
}
ul {
	list-style: none;
	display: flex;
}
a {
	color: black;
	text-decoration: none;
	padding: 5px;
	margin: 5px;
}
form {
	width: 500px;
	text-align: center;
	margin: 10px auto;
}

table {
	width: 500px;
	text-align: left;
	margin-top: 10px;
}

table, th, td {
	border: 1px solid gray;
	border-collapse: collapse;
	padding: 3px;
}

th, td {
	height: 36px;
	font-weight: 500;
	font-size: 15px;
}

th {
	width: 120px;
	padding-left: 10px;
}

td {
	padding: 1px 0 1px 2px;
}
</style>

</head>
<body>

<% 
 User user = (User)request.getAttribute("userInfo");
 //out.println(user);
%>

<h2>School</h2>

<ul>
  <li> <a href="index.html">로그아웃</a> </li>
  <li> <a href="">회원정보</a> </li>
  <li> <a href="resultIndex.jsp">홈으로</a> </li>
</ul>

<form>

<h2> 회원정보 </h2>
<table>
<!--  -->
<tr>
    <th>이름</th>
    <td>
        <p><%=user.getName() %></p>
    </td>
</tr>

<tr>
    <th>아이디</th>
    <td>
        <p><%=user.getId() %></p>
    </td>
</tr>

<tr>
    <th>비밀번호</th>
    <td>
        <%=user.getPw() %>
    </td>
</tr>

<tr>
    <th>학년/반</th>
    <td>
        <p><%=user.getGrade() %>학년 <%=user.getCls() %>반</p>
    </td>
</tr>

</table>

</form>

</body>
</html>