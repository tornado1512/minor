window.onload=initAll;
function initAll(){
	getAllElements();
	setAllActions();
}

var categ,but,but1,but2;
function getAllElements(){
	categ=document.getElementById("categ");
	but1=document.getElementById("but1");
	but2=document.getElementById("but2");
	but=document.getElementsByClassName("but");
}

function setAllActions(){
	but1.onclick=getNPack;
	but2.onclick=getIPack;
}
var req1;
function getNPack(){
	req1=new XMLHttpRequest();
	req1.open("get","collect_npack.do",true);
	req1.onreadystatechange=showNPack;
	req1.send(null);
}

function showNPack(){
	if(req1.readystate==4&&req1.status==400){
		
	}
}
