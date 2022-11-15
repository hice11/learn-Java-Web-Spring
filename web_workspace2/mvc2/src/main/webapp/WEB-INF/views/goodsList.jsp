<%@page import="model.Goods"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 조회</title>
<link type="text/css" rel="stylesheet" href="./goods.css">
</head>
<body>
<h3>상품 조회</h3>
 <table>
   <tr>
     <td>
       상품코드
     </td>
     <td>
       상품명
     </td>
     <td>
       종류
     </td>
     <td>
       상품금액
     </td>
   </tr>
   
<%
  //데이터 꺼내기
  ArrayList<Goods> list = (ArrayList<Goods>)request.getAttribute("list");
  for(Goods goods: list){
%>
    <tr>
     <td> <%=goods.getGoods_code() %> </td>
     <td> <%=goods.getGoods_name() %> </td>
     <td> <%=goods.getKind() %> </td>
     <td> <%=goods.getGoods_price() %> </td>
   </tr>
<% 
  }
%>
 </table>


</body>
</html>