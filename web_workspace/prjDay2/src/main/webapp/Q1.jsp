<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
body{
	margin: 10px auto;
	text-align: center;
}
h3{
	margin: 15px auto;
}
form{
	width: 400px;
	margin: 5px auto;
}
.flex{
	display: flex;
	flex-wrap: wrap;
	line-height: 32px;
	justify-content: center;
	margin: 5px;
}
input {
	display: block;
	width: 70px;
	height: 35px;
	font-size: 16px;
	border: 1px solid darkblue;
	border-radius: 2px;
	box-sizing: border-box;
	padding: 2px;
	margin: 0 5px;
}
button {
	display: inline-block;
	width: 70px;
	height: 35px;
	background-color: darkblue;
	color: white;	
	font-size: 16px;
	border: 1px solid darkblue;
	border-radius: 2px;
	box-sizing: border-box;
	cursor: pointer;
	padding: 2px;
	margin: 0 5px;
}
.btn{
	width: 60px;
	height: 45px;
	font-size: 14px;
	lint-height: 43px;
	background-color: darkblue;
	border: none;
	border-radius: 5px;
	color: white;
	cursor: pointer;
}
.board {
	width: 280px;
	margin: 10px auto;
	padding: 10px;
	font-size: 18px;
	background-color: darkblue;
	color: white;	
	border-radius: 5px;	
	cursor: default;
}

</style>
</head>
<body>

<%
//두 수를 사용자로 부터 입력 받아 사칙연산해서 제공하기

//입력
int n1=0;
String n1_ = request.getParameter("n1");
if(n1_ != null) n1 = Integer.parseInt(n1_);

int n2=0;
String n2_ = request.getParameter("n2");
if(n2_ != null) n2 = Integer.parseInt(n2_);

String cal = request.getParameter("cal");

//처리
int add = n1+n2;
int sub = n1-n2;
int mul = n1*n2;
double div = (double)n1/n2;

%>

<h3>사칙연산</h3>
<form action="">
	<div class="flex">
	n1 : <input type="text" name="n1">
	n2 : <input type="text" name="n2">
	<button type="submit">확인</button> <br>
	</div>
</form>

<div class="board">

n1 = <%=n1 %>, n2 = <%=n2 %> <br>
<%=n1 %> + <%=n2 %> = <%=add %> <br>
<%=n1 %> - <%=n2 %> = <%=sub %> <br>
<%=n1 %> x <%=n2 %> = <%=mul %> <br>
<%=n1 %> / <%=n2 %> = <%=div %> <br>
<% if(cal=="add") System.out.print("add"); %>
</div>

</body>
</html>