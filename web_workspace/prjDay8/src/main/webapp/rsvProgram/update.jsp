<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="db.jsp" %>
<%
//데이터값 받아오기
String id = request.getParameter("id");
//sql 작성
String sql = "SELECT rev_id, join_no, kind, TO_CHAR(rev_dt, 'yyyy-mm-dd'), certification, ck FROM tbl_reservation WHERE rev_id=?";
//Pre
PreparedStatement pst = con.prepareStatement(sql);
//sql의 파라미터값 등록
pst.setString(1, id);
//db를 rs에 저장하고 실행
ResultSet rs = pst.executeQuery();
//db 값 얻어오기
String rev_id="";
String join_no="";
String kind="";
String rev_dt="";
String certification="";
String ck="";
if(rs.next()){
	rev_id = rs.getString(1);
	join_no = rs.getString(2);
	kind = rs.getString(3);
	rev_dt = rs.getString(4);
	certification = rs.getString(5);
	ck = rs.getString(6);
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>백신접종 예약 변경</title>
<link href="index.css" rel="stylesheet" type="text/css">
<link href="reserv.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="reserv.js"></script>
</head>
<body>

<header>
  <h1>백신예약 및 접종 조회 프로그램</h1>
</header>

<nav>
  <span> <a href="reserv.jsp">백신 예약</a> </span>
  <span> <a href="list.jsp">백신 예약 현황</a> </span>
  <span> <a href="region.jsp">백신 지역별 접종 횟수 조회</a> </span>
  <span> <a href="index.html">홈으로</a> </span>
</nav>

<section>
<form action="updateAction.jsp" name="frm" method="post">

<table>
  <caption>백신접종 예약 변경</caption>
  <tr>
    <td>접종예약번호</td>
    <td> <input type="text" name="rev_id" readonly="readonly"> </td>
  </tr>
  
  <tr>
    <td>접수자번호</td>
    <td> <input type="text" name="join_no"> </td>
  </tr>
  
  <tr>
    <td>접종백신종류</td>
    <td> 
      <select name="kind">
        <option value=""> 선택 </option>
        <option value="H"> 화이자 </option>
        <option value="M"> 모더나 </option>
        <option value="Y"> 얀센 </option>
      </select>
    </td>
  </tr>
  
  <tr>
    <td>접종예약일자<br>(예시: 2021-04-01)</td>
    <td> <input type="text" name="rev_dt"> </td>
  </tr>
  
  <tr>
    <td>본인인증 방법</td>
    <td>
      <select name="certification">
        <option value=""> 선택 </option>
        <option value="C"> 휴대폰 </option>
        <option value="I"> 아이핀 </option>
        <option value="P"> 공인인증 </option>
      </select>
    </td>
  </tr>
  
  <tr>
    <td>접종완료여부</td>
    <td>
      <input type="radio" name="ck" value="Y" id="radioY"> <label for="radioY">Y </label> 
      <input type="radio" name="ck" value="N" id="radioN"> <label for="radioN">N</label> 
    </td>
  </tr>
  
  <tr>
    <td colspan="2" class="tdL"> 
      <input type="button" value="변경" onclick="check()"> 
      <input type="reset" value="취소"> 
    </td>
  </tr>
</table>

</form>
</section>

<footer>
  <h4>백신예약 및 접종 조회 프로그램</h4>
</footer>

<script type="text/javascript">
let frm = document.frm;
frm.rev_id.value = "<%=rev_id %>";
frm.join_no.value = "<%=join_no %>";
frm.kind.value = "<%=kind %>";
frm.rev_dt.value = "<%=rev_dt %>";
frm.certification.value = "<%=certification %>";
frm.ck.value = "<%=ck %>";


</script>


</body>
</html>