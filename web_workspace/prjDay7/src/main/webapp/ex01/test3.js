 
 window.addEventListener("load" ,  function(){
	
	//과일, 색깔  지정된 값으로 선택되도록 
	let frm   =document.frm;
	alert( frm);	
	
	
	let fruiteName  =frm.fruiteH.value;   // a
	let colorName = frm.colorH.value;   //b
	
	
	alert(fruiteName);
	alert(colorName);
	
	//select 태그 선택
	let fruiteSelect =  frm.fruite;
	
	for( let i=0; i<fruiteSelect.options.length; i++ ){
		if(fruiteSelect.options[i].value == fruiteName ){
			fruiteSelect.options[i].selected = true;
		}
	}
	
	
	//radio 태그 선택
	let colorRadio = frm.color;
	for( let i=0;  i< colorRadio.length; i++){
		if(  colorRadio[i].value ==  colorName){
			colorRadio[i].checked = true;
		}
	}
		
	
	
} );
