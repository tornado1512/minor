window.onload = initAll;

function initAll(){
	getAllElements();
	setAllActions();
}

var add,package_box,form1,rec,chsbtn;
function getAllElements(){
	add=document.getElementById('add');
	packageBox=document.getElementById('package_box');
	form1=document.getElementById('form1');
	chsbtn=document.getElementById('chsbtn');
}

function setAllActions(){
	add.onclick=collectRecords1;
}