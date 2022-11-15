<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="dbcon.jsp" %>
<%
  //예약번호 구하기
  String sql = "SELECT rev_id FROM tbl_reservation "
		  +"WHERE ROWNUM = 1 "
		  +"ORDER BY rev_id DESC ";
  PreparedStatement pst = con.prepareStatement(sql);
  ResultSet rs = pst.executeQuery();
  String num_ = "";
  if(rs.next()){
	  num_ = rs.getString(1);
  }
  int num = Integer.parseInt(num_); // 마지막번호
  num = num + 1;
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>백신예약</title>
<link href="css/index.css" rel="stylesheet">
<link href="css/reg.css" rel="stylesheet">

<script type="text/javascript" src="reg.js"></script>


</head>
<body>

<header>
  <h2>백신예약 및 접종 조회 프로그램</h2>
</header>

<nav>
  <ul>
    <li><a href="reg.jsp">백신예약</a></li>
    <li><a href="search1.jsp">백신접종조회</a></li>
    <li><a href="search2.jsp">백신 지역별 접종횟수 조회</a></li>
    <li><a href="index.jsp">홈으로</a></li>
  </ul>
</nav>

<section>
  <!-- 조회 -->
  <form action="reg_action.jsp" method="post" id="reg-frm">
  
  <table>
    <caption>백신접종 예약</caption>
    <tr>
      <td>접종예약번호</td>
      <td> <input type="text" name="rev_id" value="<%=num%>"> </td>
    </tr>
    <tr>
      <td>접수자번호</td>
      <td> <input type="text" name="join_no"> </td>
    </tr>
    <tr>
      <td>접종백신종류</td>
      <td>
        <select name="kind">
          <option value="">선택</option>
          <option value="H">화이자</option>
          <option value="M">모더나</option>
          <option value="Y">얀센</option>
        </select>
      </td>
    </tr>
    <tr>
      <td>접종예약일자</td>
      <td> <input type="text" name="rev_dt"> </td>
    </tr>
    <tr>
      <td>본인인증 방법</td>
      <td>
        <select name="certification">
          <option value="">선택</option>
          <option value="C">휴대폰</option>
          <option value="I">아이핀</option>
          <option value="P">공인인증</option>
        </select>
      </td>
    </tr>
    <tr>
      <td>접종완료여부</td>
      <td> 
        <input type="radio" name="ck" value="Y" id="Y"> <label for="Y">Y</label>
        <input type="radio" name="ck" value="N" id="N"> <label for="N">N</label>
      </td>
    </tr>
    <tr>
      <td colspan="2">
        <input type="button" value="저장" onclick="check()">
        <input type="reset" value="취소">
      </td>
    </tr>
  </table>
  
  </form>
</section>

<footer>
  HRD KOREA
</footer>

</body>
</html>