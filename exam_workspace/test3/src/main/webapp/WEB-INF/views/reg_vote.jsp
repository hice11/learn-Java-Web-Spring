<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>투표자 등록</title>
<%
  String path = request.getContextPath();
%>
<link rel="stylesheet" type="text/css" href="<%=path %>/index.css">
<link rel="stylesheet" type="text/css" href="<%=path %>/view.css">
<script type="text/javascript" src="<%=path %>/reg_vote.js"></script>
</head>
<body>

<header>
  <h2>HY 투표관리 ver 1.0</h2>
</header>
<nav>
  <ul>
    <li> <a href="cand">후보자조회</a> </li>
    <li> <a href="reg-vote">투표등록</a> </li>
    <li> <a href="voter">투표자조회</a> </li>
    <li> <a href="votes">득표조회</a> </li>
    <li> <a href="index.html">홈으로</a> </li>
  </ul>
</nav>

<section>

<form action="reg-vote" method="post" id="frm">

  <table class="center reg">
  <caption>투표자 등록</caption>
  <tr>
    <td> 투표자주민번호 </td>
    <td> <input type="text" name="v_jumin"> </td>
  </tr>
  <tr>
    <td> 투표자이름 </td>
    <td> <input type="text" name="v_name"> </td>
  </tr>
  <tr>
    <td> 후보자이름 </td>
    <td>
		<select name="n_no">
		  <option value="">선택</option>
		  <option value="1001">김후보</option>
		  <option value="1002">이후보</option>
		  <option value="1003">최후보</option>
		  <option value="1004">박후보</option>
		  <option value="1005">우후보</option>
		  <option value="1006">정후보</option>
		</select>
	</td>
  </tr>
  <tr>
    <td> 투표장 </td>
    <td> <input type="text" name="v_area"> </td>
  </tr>
  <tr>
    <td> 투표시간 </td>
    <td> <input type="text" name="v_time"> </td>
  </tr>
  <tr>
    <td> 유권자확인 </td>
    <td> 
      <input type="radio" name="v_confirm" value="y" id="yes"> <label for="yes">확인</label> 
      <input type="radio" name="v_confirm" value="n" id="no"> <label for="no">미확인</label> 
    </td>
  </tr>
  <tr>
    <td colspan="2" class="center"> 
      <input type="button" value="저장" onclick="check()">
      <input type="reset" value="취소">
    </td>
  </tr>
  </table>
  
</form>

</section>

<footer>
  <h3>HRD KOREA</h3>
</footer>
</body>
</html>