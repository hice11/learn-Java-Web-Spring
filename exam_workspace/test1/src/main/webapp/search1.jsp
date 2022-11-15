<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="dbcon.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>백신예약 현황 조회</title>
<link href="css/index.css" rel="stylesheet">
<link href="css/search1.css" rel="stylesheet">
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
  <table>
    <caption>백신예약 현황 조회</caption>
    <thead>
      <tr>
        <td>예약번호</td>
        <td>이름</td>
        <td>전화번호</td>
        <td>백신종류</td>
        <td>예약일자</td>
        <td>본인인증</td>
        <td>접종상태</td>
      </tr>
    </thead>
    
    <%
    	String sql = "SELECT rev_id, name, tel, DECODE(kind, 'H','화이자','M','모더나','Y','얀센') kind,"
    		+ " TO_CHAR(rev_dt, 'yyyy/dd/mm') rev_dt, DECODE(certification, 'C',' 핸드폰', 'I','아이핀',"
    		+ "'P','공인인증') certification, DECODE(ck, 'Y','완료', 'N','미완료') ck "
    		+ "FROM tbl_reservation r "
    		+ "JOIN tbl_join_12 j "
    		+ "ON r.join_no = j.id";
    	PreparedStatement pst = con.prepareStatement(sql);
    	ResultSet rs = pst.executeQuery();
    %>
    
    <tbody>
    <% while(rs.next()){ %>
      <tr>
        <td><%=rs.getString(1) %></td>
        <td><%=rs.getString(2) %></td>
        <td><%=rs.getString(3) %></td>
        <td><%=rs.getString(4) %></td>
        <td><%=rs.getString(5) %></td>
        <td><%=rs.getString(6) %></td>
        <td><%=rs.getString(7) %></td>
      </tr>
    <% 
    }
    rs.close();
    pst.close();
    con.close();
    %>
    </tbody>
  </table>
</section>

<footer>
  HRD KOREA
</footer>

</body>
</html>