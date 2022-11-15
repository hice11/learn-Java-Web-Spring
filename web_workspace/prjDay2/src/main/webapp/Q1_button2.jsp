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
p{
	font-size: 12px;
	color: darkgray;
}
form{
	width: 400px;
	margin: 5px auto;
}
.flex{
	display: flex;
	flex-wrap: wrap;
	height: 35px;
	line-height: 32px;
	justify-content: center;
	margin: 10px;
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
	margin: 0 10px 0 5px ;
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
	min-height: 58px;
	max-height: 174px;
	margin: 10px auto;
	padding: 10px;
	font-size: 40px;
	line-height: 58px;
	word-break:break-all;
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
int n2=0;
String cal="";
try{
	String n1_ = request.getParameter("n1");
	if(n1_ != null) n1 = Integer.parseInt(n1_);
	
	String n2_ = request.getParameter("n2");
	if(n2_ != null) n2 = Integer.parseInt(n2_);
	
	cal = request.getParameter("cal");
}catch(NumberFormatException e){
}

//처리
int add = n1+n2;
int sub = n1-n2;
int mul = n1*n2;
double div = (double)n1/n2;
%>

<h3>사칙연산</h3>
<p>숫자 두 개를 입력 후 연산 버튼 중 하나를 클릭하세요</p>
<form action="">
	<div class="flex">
	n1 : <input type="text" name="n1">
	n2 : <input type="text" name="n2">
	</div>
	<button type="submit" name="cal" value="add" class="btn">더하기</button>
	<button type="submit" name="cal" value="sub" class="btn">빼기</button>
	<button type="submit" name="cal" value="mul" class="btn">곱하기</button>
	<button type="submit" name="cal" value="div" class="btn">나누기</button>
</form>

<div class="board">

<% 
try{
	if(cal.equals("add")) out.print(n1+" + "+n2+" = "+add);
	else if(cal.equals("sub")) out.print(n1+" - "+n2+" = "+sub);
	else if(cal.equals("mul")) out.print(n1+" × "+n2+" = "+mul);
	else if(cal.equals("div")) out.print(n1+" ÷ "+n2+" = "+div);
}catch (NullPointerException e){
}%>
</div>

</body>
</html>