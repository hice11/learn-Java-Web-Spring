<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>회원 가입</title>

    <style>
      table {
        border: 1px solid gray;
        padding: 10px;
        margin: 0 auto;
      }
      caption {
        font-size: 18px;
        font-weight: 600;
        margin: 15px;
      }
      td {
        padding: 5px 3px;
      }
      td:nth-child(1) {
        text-align: center;
      }
      td:nth-child(2) {
        padding-right: 7px;
      }
      label {
        font-size: 14px;
      }
      input[type='text'] {
        padding: 5px;
      }
      .cbox {
        margin: 0;
        padding: 0;
        margin-right: 3px;
      }
    </style>
  </head>
  <body>
    <form action="/prj3/member/reg" method="post">
      <table>
        <caption>
          회원가입
        </caption>
        <tr>
          <td>아이디</td>
          <td><input type="text" name="id" /></td>
        </tr>
        <tr>
          <td>이름</td>
          <td><input type="text" name="name" /></td>
        </tr>
        <tr>
          <td>주소</td>
          <td><input type="text" name="addr" /></td>
        </tr>
        <tr>
          <td>sns</td>
          <td colspan="2">
            <label for="kakao">카톡</label>
            <input type="checkbox" name="sns" value="kakao" id="kakao" class="cbox" />
            <label for="instagram">인스타</label>
            <input type="checkbox" name="sns" value="instagram" id="instagram" class="cbox" />
            <label for="twitter">트위터</label>
            <input type="checkbox" name="sns" value="twitter" id="twitter" class="cbox" />
          </td>
        </tr>
        <tr>
          <td colspan="2"><input type="submit" value="등록" /></td>
        </tr>
      </table>
    </form>
  </body>
</html>
