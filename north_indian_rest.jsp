<%@page import="java.util.ArrayList,models.RestRegister"%>
<!doctype html>
<html lang="en">
 <head>
  <meta charset="UTF-8">
  <meta name="Generator" content="EditPlus®">
  <meta name="Author" content="">
  <meta name="Keywords" content="">
  <meta name="Description" content="">
  <link rel="stylesheet" href="css/view_rest.css"/>
  <title>Document</title>
 </head>
 <body>
 <h1 align="center">Restaurant Display</h1>
 <div id="box1">	
	<span id='all' class="but"><a href="national.do">All restaurants</a></span>
	<span class="but" id='but1' ><a href="chinese_rest.do">Chinese</a></span>
	<span id='but2' class="but"><a href="italian_rest.do">Italian</a></span>
	<span id='but3' class="but"><a href="south_indian_rest.do">South Indian</a></span>
	<span id='but4' class="but"><a href="north_indian_rest.do">North Indian</a><span>
	</div></br></br>
	<h1 align="center">~~~~NorthIndian Restaurant~~~</h1>
	<% ArrayList<RestRegister> rests=(ArrayList)request.getAttribute("rests");%>
	<table border="2" align="center">
	<tr>
		<td>restuarnt name</td>
		<td>restuarnt address</td>
		<td>restuarnt contact</td>
		<td>opening time</td>
		<td>closing time </td>

	</tr>
	<%for(RestRegister rest:rests){%>
	<tr>
		<td><%=rest.getRestName()%></td>
		<td><%=rest.getRestAddress()%></td>
    <td><%=rest.getRestContact()%></td>
    <td><%=rest.getOpTime()%></td>
    <td><%=rest.getClTime()%></td>
	<td rowspan="2">img url:<img src="<%= rest.getDispImg()%>"/></td>
	</tr>
	<%}%>
  </table>
 </body>
</html>