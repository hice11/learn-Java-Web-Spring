<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
String code = request.getParameter("code");
out.println(code);
//code에 대한 수강정보 조회 (디비 변경)

	//데이터베이스 연동
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "system";
	String password = "1234"; 
	//오라클 드라이버 로딩
	Class.forName(driver);
	//데이터베이스 연결
	Connection con = DriverManager.getConnection(url, user, password);
	
	//연결 확인 테스트 코드
	if(con != null) out.println("ok");
	else out.println("fail");
	
	//sql 작성
	String sql = "select * from tbl_course_300 where s_id = ?";
	//prepareStatement 사용
	PreparedStatement pst = con.prepareStatement(sql);
	//데이터 입력
	pst.setString(1, code);
	//sql 실행, 결과 저장 // sql 두번 사용하면 안됨
	ResultSet rs = pst.executeQuery();
	
	String s_id="";
	String s_name="";
	String s_grade="";
	String teacher_id="";
	String weekday="";
	String start_h="";
	String end_h="";
	
	if(rs.next()){
		s_id = rs.getString(1);
		s_name = rs.getString(2);
		s_grade = rs.getString(3);
		teacher_id = rs.getString(4);
		weekday = rs.getString(5);
		start_h = rs.getString(6);
		end_h = rs.getString(7);
	}

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>수강과목 변경</title>

<link href="update.css" rel="stylesheet">
<script type="text/javascript" src="update.js"></script>

</head>
<body>

<form action="update_action.jsp" name="frm" method="post">
		<h3>수강과목 변경</h3>
		<table>
		<tr>
			<td>교과목 코드</td>
			<td> <input type="text" name="s_id" value="<%=s_id %>"> </td>
		</tr>
		<tr>
			<td>교과명</td>
			<td> <input type="text" name="s_name" value="<%=s_name %>"> </td>
		</tr>
		<tr>
			<td>담당강사</td>
			<td>
				<select name="teacher_id">
					<option value="">선택</option>
					<option value="1">정국교수</option>
					<option value="2">뷔교수</option>
					<option value="3">지민교수</option>
					<option value="4">제이홉교수</option>
					<option value="5">슈가교수</option>
					<option value="6">진교수</option>
					<option value="7">RM교수</option>
				</select>
			</td>
		</tr>
		<tr>
			<td>학점</td>
			<td> <input type="text" name="s_grade" value="<%=s_grade %>"> </td>
		</tr>
		<tr>
			<td>요일</td>
			<td>
				<input type="radio" name="weekday" value="M" id="M"> <label for="M">월</label>
				<input type="radio" name="weekday" value="TU" id="TU"> <label for="TU">화</label>
				<input type="radio" name="weekday" value="W" id="W"> <label for="W">수</label>
				<input type="radio" name="weekday" value="TH" id="TH"> <label for="TH">목</label>
				<input type="radio" name="weekday" value="F" id="F"> <label for="F">금</label>
				<input type="radio" name="weekday" value="S" id="S"> <label for="S">토</label>
			</td>
		</tr>
		<tr>
			<td>수업시작시간</td>
			<td> <input type="text" name="start_h" value="<%=start_h %>"> </td>
		</tr>
		<tr>
			<td>수업종료시간</td>
			<td> <input type="text" name="end_h" value="<%=end_h %>"> </td>
		</tr>
		<tr>
			<td colspan="2" class="tdLast">
				<input type="button" value="수정" onclick="check()">
				<input type="button" value="이전페이지" onclick="location.href='list.jsp'">
			</td>
		</tr>
		</table>
		
		<input type="hidden" name="teacher_id_h" value="<%=teacher_id %>">
		<input type="hidden" name="weekday_h" value="<%=weekday %>">
</form>
</body>
</html>