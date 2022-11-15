<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    

<%
  String fruite="p";
  String color="b";

%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script src="test3.js"></script>
</head>
<body>

<form name="frm">
	
	좋아하는과일
	<select name="fruite">
	<option value="">선택하세요</option>
	<option value="s">딸기</option>
	<option value="a">사과</option>
	<option value="p">복숭아</option>
	</select>

    좋아하는 색
    <input type="radio" name="color" value="r">red
    <input type="radio" name="color" value="b">blue
    <input type="radio" name="color" value="g">green


   <input type="hidden"  name="fruiteH"  value="<%=fruite %>">
   <input type="hidden"  name="colorH" value="<%=color%>">

</form>

</body>
</html>
