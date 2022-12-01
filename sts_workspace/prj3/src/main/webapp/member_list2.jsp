<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>조회</title>
  </head>
  <body>
    <div id="result"></div>

    <button id="searchBtn">고객조회</button>

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script type="text/javascript">
      $(document).ready(function () {
        $('#searchBtn').click(function () {
          search();
        });
      });
      
      function search() {
        //alert('ddd');
        $.ajax({
          type: 'GET',
          url: '/prj3/member/list3',
          success: function (data) {
            console.log(data);
            let dataHtml = toHtml(data);
            alert(dataHtml);
            $('#result').html(dataHtml);
          },
          error: function (data) {
            alert('오류 발생');
          },
        });
      }

      function toHtml(data) {
        alert(data);
        let str = '';
        for (let i = 0; i < data.length; i++) {
          let item = data[i];
          str += '<div>' + item.id + item.name + '</div>';
        }
        return str;
      }
    </script>
  </body>
</html>
