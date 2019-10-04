window.onload = initAll;

function initAll(){
	getAllElements();
	setAllActions();
}

var add,aaa,rec,menuBox,form1;
var bbb,rec2,itemBox,form2;
function getAllElements(){
	add = document.getElementById("add");
	aaa= document.getElementById("aaa");
     rec = document.getElementById("rec");
	 menuBox = document.getElementById("menu_box");
	 form1 = document.getElementById("form1");

	 bbb= document.getElementById("bbb");
     rec2 = document.getElementById("rec2");
	 form2 = document.getElementById("form2");
	 itemBox = document.getElementById("item_box");
}

function setAllActions(){
	add.onclick=collectRecords;
	form1.onsubmit=collectMenu;
}
var reqObj1
function collectMenu(){
	menuBox.style.display="none";
	alert("hello");
	reqObj1 =  new XMLHttpRequest();
	reqObj1.open('get','collect_item.do',true);
	reqObj1.onreadystatechange = showRecord1;
	reqObj1.send(null);
}

function showRecord1(){
	if(reqObj1.readyState==4&&reqObj1.status==200){
				alert(reqObj1.responseText);
		
	var records = eval(reqObj1.responseText);
		alert(records);

		var len = records.length;
		for(i=0;i<len;i++){
				var row = rec2.insertRow(i);
				var n=0;
				var obj = records[i];
				for(x in obj){
						var cell1= row.insertCell( n);
						cell1.innerHTML= obj[x];
						n++;	
				}
		   }
		}
}

}

var reqObj;
function collectRecords(){
	menuBox.style.visibility="visible";
	alert("hello");
	reqObj =  new XMLHttpRequest();
	reqObj.open('get','collect_category.do',true);
	reqObj.onreadystatechange = showRecord;
	reqObj.send(null);
}

function showRecord(){
		if(reqObj.readyState==4&&reqObj.status==200){
				//alert(reqObj.responseText);
		
	var records = eval(reqObj.responseText);
		//alert(records);

		var len = records.length;
		for(i=0;i<len;i++){
				var row = rec.insertRow(i);
				var n=0;
				var obj = records[i];
				for(x in obj){
						var cell1= row.insertCell( n);
						cell1.innerHTML= obj[x];
						n++;	
						var cell2=row.insertCell(n);
						var inp =document.createElement("input");
						inp.setAttribute("type","radio");
						inp.setAttribute("name","category");
						cell2.appendChild(inp);	
				}
		   }
		}
}
