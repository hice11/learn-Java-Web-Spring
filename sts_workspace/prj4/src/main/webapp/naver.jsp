<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Naver API</title>
  </head>
  <body>
    <button id="btn">naver</button>

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

    <script>
      function naverAjax() {
        $.ajax({
          type: 'GET',
          url: '/prj4/naver2',
          success: function (data) {
            alert('data');
            console.log(data);
          },
          error: function () {
            alert('error');
          },
        });
      }

      function btnClick() {
        $('#btn').click(naverAjax);
      }

      $(document).ready(btnClick);
    </script>
  </body>
</html>
