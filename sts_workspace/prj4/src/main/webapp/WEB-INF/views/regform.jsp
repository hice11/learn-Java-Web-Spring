<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>등록</title>
  </head>
  <body>
    <form action="/prj4/body" method="POST">
      아이디 <input type="text" name="id" /> <br />
      비번 <input type="text" name="pw" /> <br />
      이름 <input type="text" name="name" /> <br />
      <button>등록</button>
    </form>

    <h2>ajax 등록</h2>
    <button id="btn">ajax등록</button>

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script>
      function btnClick() {
        //alert('dd');
        $('#btn').click(() => {
          //alert('click');
          let person = {
            id: 'ch11',
            name: 'pch',
            age: '33',
          };

          $.ajax({
            type: 'POST',
            url: '/prj4/body',
            headers: { 'context-type': 'application/jason' },
            data: JSON.stringify(person),
            success: function (data) {
              alert('등록완료');
            },
            error: function (data) {
              alert('error');
            },
          });
        });
      }
      $(document).ready(btnClick);
    </script>
  </body>
</html>
