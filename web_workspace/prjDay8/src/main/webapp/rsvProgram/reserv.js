function check(){
	let frm = document.frm;
	let rev_id = frm.rev_id;
	let join_no = frm.join_no;
	let kind = frm.kind;
	let rev_dt = frm.rev_dt;
	let certification = frm.certification;
	let ck = frm.ck;
	
	if(rev_id.value == ""){
		alert("접종예약번호를 입력하세요.");
		rev_id.focus();
	}
	else if(join_no.value == ""){
		alert("접수자번호를 입력하세요.");
		join_no.focus();
	}
	else if(kind.value == ""){
		alert("접종백신종류를 선택하세요.");
		kind.focus();
	}
	else if(rev_dt.value == ""){
		alert("접종예약일자를 입력하세요.");
		rev_dt.focus();
	}
	else if(certification.value == ""){
		alert("본인인증 방법을 선택하세요.");
		certification.focus();
	}
	else if(ck.value == ""){
		alert("접종완료여부를 체크하세요.");
		ck.focus();
	}
	else{
		frm.submit();
	}
	
}