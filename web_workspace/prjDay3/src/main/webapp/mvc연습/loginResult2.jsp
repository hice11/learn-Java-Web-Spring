<%@page import="mvc.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인2</title>
<style>
* {
	margin: 10px;
}

.wrap {
	width: 400px;
	height: 300px;
	padding: 30px;
	text-align: center;
	box-sizing: border-box;
	border: 1px solid black;
	margin: 30px auto;
}

h2 {
	margin: 20px;
}

input {
	width: 250px;
	height: 35px;
	box-sizing: border-box;
	display: block;
	margin: 5px auto;
	border: 1px solid black;
}

button {
	width: 250px;
	height: 35px;
	box-sizing: border-box;
	display: block;
	border: 1px solid lightgray;
	background-color: lightgray;
	margin: 10px auto;
	cursor: pointer;
	font-weight: 500;
}

</style>

</head>
<body>
<% 
 User user = (User)request.getAttribute("userInfo2");
User user2 = new User(user.getName(), user.getId(), user.getPw(), user.getGrade(), user.getCls());
request.setAttribute("userInfo3", user2);
 //out.println(user);
%>
<div class="wrap">
	<h2>로그인</h2>
	<p>회원가입 완료!</p>
	<p>로그인을 해주세요.</p>
	<form action="login2.sc" method="post">
	
	<input type="text" name="id" placeholder="아이디">
	<input type="password" name="pw" placeholder="비밀번호">
	<button>로그인</button>
	
	</form>
	
</div>
</body>
</html>