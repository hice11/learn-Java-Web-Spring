<%@page import="prjDay3.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원정보 변경</title>

<style type="text/css">
table {
	width: 300px;
	border: 1px solid black;
	margin: 0 auto;
}
td {
	border: 1px solid black;
	text-align: center;
}


</style>

</head>
<body>

<% 
 User user = (User)request.getAttribute("userInfo");
 //out.println(user.getId());
 //out.println(user.getName());
 //out.println(user.getAddr());
 //out.println(user);
%>


<table>
<caption>회원정보</caption>

<tr>
<td>아이디</td>
<td> <input type="text" value="<%=user.getId() %>"> </td>
</tr>

<tr>
<td>이름</td>
<td> <input type="text" value="<%=user.getName() %>"> </td>
</tr>

<tr>
<td>주소</td>
<td> <input type="text" value="<%=user.getAddr() %>"> </td>
</tr>

<tr>
<td colspan="2"> <button>수정</button> </td>
</tr>

</table>



</body>
</html>