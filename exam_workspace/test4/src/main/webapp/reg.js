/**
 * 
 */
 function check(){
	let frm = document.getElementById("frm");
	if(frm.goods_cd.value == ""){
		alert("상품코드를 입력하세요.");
		frm.goods_cd.focus();
	}
	else if(frm.goods_nm.value == ""){
		alert("상품명을 입력하세요.");
		frm.goods_nm.focus();
	}
	else if(frm.goods_price.value == ""){
		alert("단가를 입력하세요.");
		frm.goods_price.focus();
	}
	else if(frm.cost.value == ""){
		alert("원가를 입력하세요.");
		frm.cost.focus();
	}
	else if(frm.in_date.value == ""){
		alert("입고일자를 입력하세요.");
		frm.in_date.focus();
	}
	else{
		alert("등록 되었습니다.");
		frm.submit();
	}
	
}