<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> <%@ page language="java" contentType="text/html;
charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>회원 조회</title>

    <style>
      table {
        border: 1px solid gray;
        border-collapse: collapse;
        padding: 10px;
        margin: 0 auto;
      }
      caption {
        font-size: 18px;
        font-weight: 600;
        margin: 15px;
      }
      thead,
      th {
        border-bottom: 1px solid gray;
      }
      td, th {
        padding: 10px;
      }
    </style>
  </head>
  <body>
    <table>
      <caption>
        회원 조회
      </caption>
      <thead>
        <tr>
          <th>아이디</th>
          <th>이름</th>
          <th>주소</th>
          <th>sns</th>
        </tr>
      </thead>
      <tbody>
        <c:forEach items="${list}" var="member">
          <tr>
            <td>${member.id}</td>
            <td>${member.name}</td>
            <td>${member.addr}</td>
            <td>${member.sns}</td>
          </tr>
        </c:forEach>
      </tbody>
    </table>
  </body>
</html>
