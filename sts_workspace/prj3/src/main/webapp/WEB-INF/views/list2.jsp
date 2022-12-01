<%@page import="java.util.List"%>
<%@page import="java.util.Arrays"%>
<%@page import="com.acorn.prj3.Member"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.acorn.prj3.Member2"%>
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
      .kakao1, .instagram1, .twitter1{
        color: black;
      }
      .kakao2, .instagram2, .twitter2{
        color: lightgray;
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
          <%
            ArrayList<Member> list = (ArrayList<Member>)request.getAttribute("list");
          
            for(Member member : list){
          %>
          <tr>
            <td><%=member.getId() %></td>
            <td><%=member.getName() %></td>
            <td><%=member.getAddr() %></td>
            <td>
            <%
              String[] snss = member.getSns();
              List<String> snsList = new ArrayList<String>(Arrays.asList(snss)); 
              int kakao, instagram, twitter = 0;
              kakao = (snsList.contains("kakao")) ? 1 : 0;
              instagram = (snsList.contains("instagram")) ? 1 : 0;
              twitter = (snsList.contains("twitter")) ? 1 : 0;
              pageContext.setAttribute("kakao", kakao);
              pageContext.setAttribute("instagram", instagram);
              pageContext.setAttribute("twitter", twitter);
            %>
              <c:choose>
                <c:when test="${kakao == 1}">
                  <span class="kakao1">kakao</span>
                </c:when>
                <c:otherwise>
                  <span class="kakao2">kakao</span>
                </c:otherwise>
              </c:choose>
              
              <c:choose>
                <c:when test="${instagram == 1}">
                  <span class="instagram1">instagram</span>
                </c:when>
                <c:otherwise>
                  <span class="instagram2">instagram</span>
                </c:otherwise>
              </c:choose>
              
              <c:choose>
                <c:when test="${twitter == 1}">
                  <span class="twitter1">twitter</span>
                </c:when>
                <c:otherwise>
                  <span class="twitter2">twitter</span>
                </c:otherwise>
              </c:choose>
            </td>
          </tr>
          <%
          }
          %>
      </tbody>
    </table>
  </body>
</html>
