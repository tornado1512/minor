window.onload=initAll;

function initAll(){
	getAllElements();
	setAllActions();
}

var pac_box,pic;
function getAllElements(){
	pacBox = document.getElementById("pac_box");
	pic = document.getElementById("pic");
}

function setAllActions(){
	pic.onclick=add;
}

var i=2;
function add(){
	var br=document.createElement('br');
	pacBox.appendChild(br);
	var inp=document.createElement("input");
	inp.setAttribute("type","file");
	inp.setAttribute("name","file"+i);
	i++;
	pacBox.appendChild(inp);
}