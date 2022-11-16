/**
 * 
 */
 function check(){
	//alert("dd");
	let frm = document.getElementById("frm");
	if(frm.v_jumin.value == ""){
		alert("투표자주민번호를 입력하세요.");
		frm.v_jumin.focus();
	}
	else if(frm.v_name.value == ""){
		alert("투표자이름을 입력하세요.");
		frm.v_name.focus();
	}
	else if(frm.n_no.value == ""){
		alert("후보자이름을 선택하세요.");
		frm.n_no.focus();
	}
	else if(frm.v_area.value == ""){
		alert("투표장을 입력하세요.");
		frm.v_area.focus();
	}
	else if(frm.v_time.value == ""){
		alert("투표시간을 입력하세요.");
		frm.v_time.focus();
	}
	else if(frm.v_confirm.value == ""){
		alert("유권자확인을 체크하세요.");
		frm.v_confirm.focus();
	}
	else{
		alert("등록 완료했습니다.");
		frm.submit();
	}
}