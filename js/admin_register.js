window.onload = initAll;

function initAll(){
	getAllElements();
	setAllActions();
}

var passw,repass;
var regform,errmerr,perr,rperr;
function getAllElements(){
	regform = document.getElementById('regform');

	passw = document.getElementById('passw');
	repass = document.getElementById('repass');	
	
	perr = document.getElementById('perr');
	rperr = document.getElementById('rperr');
}

function setAllActions(){
	alert("hello");
	regform.onsubmit = validateForm;
	
	passw.onblur = function(){
						var plen = passw.value.length;
						if(plen<6||plen>12){
							flag = false;
							perr.style.visibility = 'visible';							
						}else{
							flag = true;
							perr.style.visibility = 'hidden';							
						}
					}
	
	repass.onkeyup = function(){
							if(repass.value.length<6||passw.value!=repass.value){
								rperr.style.visibility = 'visible';
								flag = false;
							}else{
								alert(12)
								flag = true;
								rperr.style.visibility = 'hidden';
							}
						}
}

var flag = true;
function validateForm(){
	
   var plen = passw.value.length;
	if(plen<6||plen>12){
		perr.style.visibility = 'visible';
		flag = false;
	}

	if(passw.value!=repass.value){
		flag = false;
		rperr.style.visibility = 'visible';
	}

	if(!flag){
		return flag;
	}
}





