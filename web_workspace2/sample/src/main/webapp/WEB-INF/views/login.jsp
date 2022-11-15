<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
</head>
<body>


<h2>로그인</h2>

 
 <%
   String message  = (String) request.getAttribute("message");
   if(message != null) {
       out.println( message);
   }
 %>
 
 <form  action="/sample/login.do"  method="post">	 
     ID: <input type="text" >  <br>
     PW: <input type="text">  <br>
   <button>Login</button>   
 </form>


</body>
</html>