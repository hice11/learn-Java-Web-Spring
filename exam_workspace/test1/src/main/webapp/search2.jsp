<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="dbcon.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>지역별 백신예약 인원수</title>
<link href="css/index.css" rel="stylesheet">
<link href="css/search2.css" rel="stylesheet">
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
    <caption>지역별 백신예약 인원수</caption>
    <thead>
      <tr>
        <td>지역</td>
        <td>인원수</td>
      </tr>
    </thead>
    
    <%
    	String sql = "SELECT DECODE(region, 'S','서울', 'K','경기', 'P','부산' ) region, COUNT( * ) cnt "
    			+"FROM tbl_reservation r "
    			+"JOIN tbl_join_12 j "
    			+"ON r.join_no = j.id "
    			+"WHERE r.ck = 'Y' "
    			+"GROUP BY region "
    			+"ORDER BY cnt DESC ";
    	PreparedStatement pst = con.prepareStatement(sql);
    	ResultSet rs = pst.executeQuery();
    %>
    
    <tbody>
    <% while(rs.next()){ %>
      <tr>
        <td><%=rs.getString(1) %></td>
        <td><%=rs.getString(2) %></td>
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