/**
 * 
 */
 function check(){
	let frm = document.getElementById("frm");
	if(frm.userid.value == ""){
		alert("고객아이디를 입력하세요.");
		frm.userid.focus();
	}
	else if(frm.prodname.value == ""){
		alert("구입물품을 입력하세요.");
		frm.prodname.focus();
	}
	else if(frm.groupname.value == ""){
		alert("분류를 선택하세요.");
		frm.groupname.focus();
	}
	else if(frm.price.value == ""){
		alert("단가를 입력하세요.");
		frm.price.focus();
	}
	else if(frm.amount.value == ""){
		alert("판매수량을 입력하세요.");
		frm.amount.focus();
	}
	else{
		alert("등록 완료했습니다.");
		frm.submit();
	}
}