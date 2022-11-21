/**
 * 
 */
 function check(){
	let frm = document.getElementById("frm");
	if(frm.co_name.value == ""){
		alert("강좌명을 입력하세요.");
		frm.co_name.focus();
	}
	else if(frm.br_code.value == ""){
		alert("지점을 선택하세요.");
		frm.br_code.focus();
	}
	else if(frm.inst_code.value == ""){
		alert("강사코드를 입력하세요.");
		frm.inst_code.focus();
	}
	else if(frm.price.value == ""){
		alert("수강료를 입력하세요.");
		frm.price.focus();
	}
	else if(frm.start_date.value == ""){
		alert("시작날짜를 입력하세요.");
		frm.start_date.focus();
	}
	else if(frm.end_date.value == ""){
		alert("종료날짜를 입력하세요.");
		frm.end_date.focus();
	}
	else{
		alert("등록 완료했습니다.");
		frm.submit();
	}
}