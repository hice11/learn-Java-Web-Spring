function check(){
	let frm = document.frm;
	let s_id = frm.s_id;
	let s_name = frm.s_name;
	let teacher_id = frm.teacher_id;
	let s_grade = frm.s_grade;
	let weekday = frm.weekday;
	let start_h = frm.start_h;
	let end_h = frm.end_h;
	if(s_id.value == ""){
		alert("교과목 코드를 입력해주세요.");
		s_id.focus();
	}
	else if(s_name.value == ""){
		alert("교과명을 입력해주세요.");
		s_name.focus();
	}
	else if(teacher_id.value == ""){
		alert("담당강사를 입력해주세요.");
		teacher_id.focus();
	}
	else if(s_grade.value == ""){
		alert("학점을 입력해주세요.");
		s_grade.focus();
	}
	else if(weekday.value == ""){
		alert("요일을 입력해주세요.");
		weekday.focus();
	}
	else if(start_h.value == ""){
		alert("수업시작시간을 입력해주세요.");
		start_h.focus();
	}
	else if(end_h.value == ""){
		alert("수업종료시간을 입력해주세요.");
		end_h.focus();
	}
	else{
		frm.submit();
	}
	
	
}