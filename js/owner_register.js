window.onload = initAll;

function initAll(){
	getAllElements();
	setAllActions();
}

var oname,email,passw,repass;
var regform,unmerr,emerr,perr,rperr;
function getAllElements(){
	regform = document.getElementById('regform');

	oname = document.getElementById('oname');
	email = document.getElementById('email');
	passw = document.getElementById('passw');
	repass = document.getElementById('repass');	
	
	unmerr = document.getElementById('unmerr');
	emerr = document.getElementById('emerr');
	perr = document.getElementById('perr');
	rperr = document.getElementById('rperr');
}

function setAllActions(){
	alert("hello");
	regform.onsubmit = validateForm;
	
	oname.onblur = function(){
						if(oname.value.length<3){
							flag = false;
							unmerr.style.visibility = 'visible';
						}else{
							unmerr.style.visibility = 'hidden';
							flag = true;
						}					
					};
	
	email.onblur = function(){
						var emTest = /\w+@[a-zA-Z_]+?\.[a-zA-Z]{2,3}/.test(email.value)
	
						if(!emTest){
							flag = false;
							emerr.style.visibility = 'visible';
						}else{
							flag = true;
							emerr.style.visibility = 'hidden';
						}
					};

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
	
	
	if(oname.value.length<3){
		unmerr.style.visibility = 'visible';
		flag =false;
	}

	var emTest = /\w+@[a-zA-Z_]+?\.[a-zA-Z]{2,3}/.test(email.value)
	
	if(!emTest){
		emerr.style.visibility = 'visible';
		flag = false;
	}

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





