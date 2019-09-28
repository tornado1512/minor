window.onload=initAll;
function initAll(){

	getAllElements();
	setAllActions();
}

var restName,restAddress,box,pic;
function getAllElements(){
	alert("hello");
	restName = document.getElementById('restName');
	restAddress = document.getElementById('restAddress');
	box = document.getElementById('box');
	pic=document.getElementById("pic");
}
function setAllActions(){
	pic.onclick=addPic;
}
var i=2;
function addPic(){
	var br=document.createElement('br');
	box.appendChild(br);
	var inp=document.createElement("input");
	inp.setAttribute("type","file");
	inp.setAttribute("name","file"+i);
	i++;
	box.appendChild(inp);
	
}