/**
 * 
 */
function check(){
	let frm = document.getElementById("reg-frm");
	if(frm.rev_id.value == ""){
		alert("예약번호를 입력하세요.");
		frm.rev_id.focus();
	}
	else if(frm.join_no.value == ""){
		alert("접수자번호를 입력하세요.");
		frm.join_no.focus();
	}
	else if(frm.kind.value == ""){
		alert("접종백신종류를 선택하세요.");
		frm.kind.focus();
	}
	else if(frm.rev_dt.value == ""){
		alert("접종예약일자를 입력하세요.");
		frm.rev_dt.focus();
	}
	else if(frm.certification.value == ""){
		alert("본인인증 방법을 선택하세요.");
		frm.certification.focus();
	}
	else if(frm.ck.value == ""){
		alert("접종완료여부를 체크하세요.");
		frm.ck.focus();
	}
	else{
		alert("등록 완료");
		frm.submit();
	}
	
}