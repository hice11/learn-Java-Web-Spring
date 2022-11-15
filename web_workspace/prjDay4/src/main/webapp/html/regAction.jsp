<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원등록</title>
</head>
<body>

	<%
	//넘어온 데이터 얻어오기
	request.setCharacterEncoding("UTF-8");
	
	String userId = request.getParameter("userId");
	String userName = request.getParameter("userName");
	String userPw = request.getParameter("userPw");
	String userAddr = request.getParameter("userAddr");

	//넘어온 데이터 화면에 보여주기 (콘솔)
	System.out.println(userId);
	System.out.println(userName);
	System.out.println(userPw);
	System.out.println(userAddr);

	//데이터베이스에 저장
	
	
	%>


</body>
</html>