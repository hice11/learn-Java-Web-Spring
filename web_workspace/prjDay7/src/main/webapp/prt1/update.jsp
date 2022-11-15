<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="db.jsp" %>
<%
//값 받아오기
String id = request.getParameter("id");
//sql 작성
String sql = "SELECT s_id, s_name, s_grade, teacher_id, trim(weekday), lpad(start_h, 4, '0'), end_h FROM tbl_course_300 WHERE s_id=?";
//sql 파라미터 등록
PreparedStatement pst = con.prepareStatement(sql);
pst.setString(1, id);
//sql 실행
ResultSet rs = pst.executeQuery();
//sql 값 얻어오기
String s_id="";
String s_name="";
String s_grade="";
String teacher_id="";
String weekday="";
String start_h="";
String end_h="";
if(rs.next()){
	s_id = rs.getString(1);
	s_name = rs.getString(2);
	s_grade = rs.getString(3);
	teacher_id = rs.getString(4);
	weekday = rs.getString(5);
	start_h = rs.getString(6);
	end_h = rs.getString(7);
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>수강과목 변경</title>
<link href="reg.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="reg.js"></script>
</head>
<body>

<form action="updateAction.jsp" name="frm" method="post">

<table>
  <caption>수강과목 등록</caption>
  <tr>
    <td>교과목 코드</td>
    <td> <input type="text" name="s_id">  </td>
  </tr>

  <tr>
    <td>교과명</td>
    <td> <input type="text" name="s_name">  </td>
  </tr>

  <tr>
    <td>담당강사</td>
    <td> 
      <select name="teacher_id">
        <option value=""> 선택 </option>
        <option value="1">정국교수</option>
        <option value="2">뷔교수</option>
        <option value="3">지민교수</option>
        <option value="4"> 제이홉교수</option>
        <option value="5"> 슈가교수</option>
        <option value="6"> 진교수</option>
        <option value="7"> RM교수</option>
      </select>
    </td>
  </tr>

  <tr>
    <td>학점</td>
    <td> <input type="text" name="s_grade">  </td>
  </tr>

  <tr>
    <td>요일</td>
    <td>
      <input type="radio" name="weekday" value="M" id="M"> <label for="M">월</label>
      <input type="radio" name="weekday" value="TU" id="TU"> <label for="TU">화</label>
      <input type="radio" name="weekday" value="W" id="W"> <label for="W">수</label>
      <input type="radio" name="weekday" value="TH" id="TH"> <label for="TH">목</label>
      <input type="radio" name="weekday" value="F" id="F"> <label for="F">금</label>
      <input type="radio" name="weekday" value="S" id="S"> <label for="S">토</label>
    </td>
  </tr>

  <tr>
    <td>수업시작시간</td>
    <td> <input type="text" name="start_h">  </td>
  </tr>

  <tr>
    <td>수업종료시간</td>
    <td> <input type="text" name="end_h">  </td>
  </tr>

  <tr>
    <td colspan="2" class="tdL">
    <input type="button" value="변경" onclick="check()">
    <input type="button" value="목록으로" onclick="location.href='listM.jsp'">
    </td>
  </tr>
</table>

</form>

<script type="text/javascript">
let frm = document.frm;
frm.s_id.value = "<%=s_id %>";
frm.s_name.value = "<%=s_name %>";
frm.s_grade.value = "<%=s_grade %>";
frm.teacher_id.value = "<%=teacher_id %>";
frm.weekday.value = "<%=weekday %>";
frm.start_h.value = "<%=start_h %>";
frm.end_h.value = "<%=end_h %>";
</script>

</body>
</html>