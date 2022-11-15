<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="db.jsp" %>
<%

//sql 작성
//String sql = "SELECT rev_id FROM tbl_reservation";
//String sql = "SELECT LAST_NUMBER FROM USER_SEQUENCES";
//String sql = "SELECT rev_seq.currval from dual";
String sql = "SELECT rev_seq.nextval from dual";

//PreparedStatement
PreparedStatement pst = con.prepareStatement(sql);
//db를 ResultSet에 저장하고 실행
ResultSet rs = pst.executeQuery();
//db 값 얻어오기
int rev_id=0;
String rev_id1="";
if(rs.next()){
	//rev_id = rs.getInt(1);
	out.print(rs.getInt(1));
	//rev_id1 = rs.getString("rev_id");
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>