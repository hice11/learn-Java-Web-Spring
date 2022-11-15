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
button {
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
div {
	width: 280px;
	height: 60px;
	margin: 10px auto;
	padding: 10px;
	font-size: 40px;
	line-height: 58px;
	border: 1px solid darkblue;
	border-radius: 5px;	
	cursor: default;
}

</style>
</head>
<body>

<%
//두 수를 사용자로 부터 입력 받아 사칙연산해서 제공하기

//입력
String n1_ = request.getParameter("n1");
int n1 = Integer.parseInt(n1_);
String n2_ = request.getParameter("n2");
int n2 = Integer.parseInt(n1_);
String cal = request.getParameter("cal");
//처리
int add = n1+n2;
int sub = n1-n2;
int mul = n1*n2;
double div = (double)n1/n2;

%>

<h3>사칙연산</h3>
<form action="Q1.jsp">
	<button type="button" value="add">더하기</button>
	<button type="button" value="sub">빼기</button>
	<button type="button" value="mul">곱하기</button>
	<button type="button" value="div">나누기</button>
</form>
<div>
<%
if(cal=="add") out.print(n1+" + "+n2+" = "+add);
else if(cal=="sub") out.print(n1+" - "+n2+" = "+sub);
else if(cal=="mul") out.print(n1+" x "+n2+" = "+mul);
else if(cal=="div") out.print(n1+" / "+n2+" = "+div);
%>
</div>

</body>
</html>