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
    <script>
      $(document).ready(function () {
        let customer = { id: 't3', name: 'test333' };
        $('#btn').click(function () {
          $.ajax({
            type: 'PUT', // 수정 요청 메시지
            url: '/prj3/member/modify/t3', // 요청 URI // 변수 이름으로 보낸다
            headers: { 'content-type': 'application/json' }, // 요청 헤더
            data: JSON.stringify(customer), // 서버로 전송할 데이터. stringify()로 직렬화 필요.
            success: function (result) {
              alert('수정완료');
            },
            error: function () {
              alert('error');
            }, // 에러가 발생했을 때, 호출될 함수
          }); // $.ajax()
        });
      });
    </script>
  </body>
</html>
