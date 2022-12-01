<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Insert title here</title>
  </head>
  <body>
    <button id="btn">등록</button>

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script type="text/javascript">
      $(document).ready(function () {
        let customer = { id: 't4', name: 'test4' }; //json
        alert(JSON.stringify(customer));

        $('#btn').click(function () {
          alert('dkdkfkf');
          $.ajax({
            type: 'POST',
            url: '/prj3/member/register',
            headers: { 'content-type': 'application/json' }, // 요청 헤더
            data: JSON.stringify(customer), // 서버로 전송할 데이터. stringify()로 직렬화 필요.
            success: function (data) {
              alert('등록완료');
              console.log(data);
            },
            error: function (data) {
              alert('error');
            },
          });
        });
      });
    </script>
  </body>
</html>
