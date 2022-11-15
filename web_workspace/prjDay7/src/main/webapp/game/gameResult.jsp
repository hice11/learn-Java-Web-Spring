<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> 
    
    <%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%

String path =  request.getContextPath();   //현재 프로젝트의 이름 얻어옴 , 프로젝트1개 => 한 개의 웹사이트 %>
 
 <link href="<%=path%>/game/game.css" rel="stylesheet">
<style>

  


</style> 
  
</head>
<body>
 

<%  HashSet<String>   set  = (HashSet<String>  ) request.getAttribute("result");
 
    Iterator<String> list  = set.iterator();
    
    

%>



<h2>축하합니다!!^^</h2>
<div class="show">

  <%  while( list.hasNext()){	  
	   out.println( list.next()); 
	   
  }
%>
</div>

</body>
</html>