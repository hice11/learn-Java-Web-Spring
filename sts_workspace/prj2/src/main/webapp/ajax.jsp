<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Insert title here</title>
  </head>
  <body></body>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script>
    $(document).ready(function () {
    	alert("dd");
    	
      $.ajax(
	      {
	        type: 'GET',
	        url: '/prj2/js2',
	        success: function (data) {
	          alert(data);
	          console.log(data);
	        },
	        error: function () {
	          alert("error!");
	          console.log('통신실패!!');
	        },
	      }
      );
      
    });
  </script>
</html>
