<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<p>1~10까지의 합</p>

<% //자바코드 부분 
int sum=0;
for(int i=1; i<=10; i++){
	sum += 1;
}
out.print(sum);
%>

<%=sum %>

</body>
</html>