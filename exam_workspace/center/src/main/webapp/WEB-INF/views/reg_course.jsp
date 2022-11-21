<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>강좌 등록</title>
<%
  String path = request.getContextPath();
%>
<link rel="stylesheet" type="text/css" href="<%=path %>/index.css">
<link rel="stylesheet" type="text/css" href="<%=path %>/table.css">
</head>
<body>

<header>
  <h2>AC 문화센터</h2>
</header>
<nav>
  <ul>
    <li>
      <a href="reg-course">강좌 등록</a>
    </li>
    <li>
      <a href="branch-list">지점 조회</a>
    </li>
    <li>
      <a href="instructor-list">강사 조회</a>
    </li>
    <li>
      <a href="index.html">홈으로</a>
    </li>
  </ul>
</nav>

<section>
  
  <form action="reg-course" method="post" id="frm">
    <table class="tbl">
    <caption>강좌 등록화면</caption>
      <tr>
        <td class="center">강좌코드</td>
        <td>
<%
  int code = (int)request.getAttribute("code");
%>
          <input type="text" name="co_code" readonly="readonly" value="<%= code %>">
        </td>
      </tr>
      <tr>
        <td class="center">강좌명</td>
        <td>
          <input type="text" name="co_name">
        </td>
      </tr>
      <tr>
        <td class="center">지점</td>
        <td>
          <select name="br_code">
            <option value="">선택</option>
            <option value="S001">가든파이브점</option>
            <option value="S002">목동점</option>
            <option value="K001">중동점</option>
            <option value="C001">충청점</option>
            <option value="K002">킨텍스점</option>
            <option value="K003">판교점</option>
          </select>
        </td>
      </tr>
      <tr>
        <td class="center">강사코드</td>
        <td>
          <input type="text" name="inst_code">
        </td>
      </tr>
      <tr>
        <td class="center">수강료</td>
        <td>
          <input type="text" name="price">원
        </td>
      </tr>
      <tr>
        <td class="center">시작날짜</td>
        <td>
          <input type="text" name="start_date">
        </td>
      </tr>
      <tr>
        <td class="center">종료날짜</td>
        <td>
          <input type="text" name="end_date">
        </td>
      </tr>
      <tr>
        <td colspan="2" class="center">
          <input type="button" value="등록" onclick="check()">
          <input type="reset" value="다시쓰기">
        </td>
      </tr>
    </table>
  </form>
  
</section>

<footer>
<h3>HRD KOREA</h3>
</footer>

<script type="text/javascript" src="<%=path %>/reg_course.js"></script>

</body>
</html>