<!doctype html>
<html lang="en">
 <head>
  <meta charset="UTF-8">
  <title>Document</title>
 </head>
 <body>
 
 <h1>MyRest</h1>
 <h1 align="center">${rest.restName}</h1>
 <div id="box">
<table align = "center">
	<tr>
		<td>Restaurant Name</td>
		<td>:</td>
		<td>${requestScope.rest.restName}<td>
	</tr>
	<tr>
		<td>Address</td>
		<td>:</td>
		<td>${rest.restAddress}<td>
	</tr>
	<tr>
		<td>restContact</td>
		<td>:</td>
		<td>${rest.restContact}<td>
	</tr>
	<tr>
		<td>Opening Time</td>
		<td>:</td>
		<td>${rest.opTime}<td>
	</tr>
	<tr>
		<td>Closing Time</td>
		<td>:</td>
		<td>${rest.clTime}<td>
	</tr>
	<tr>
		
	</table>
</div>
</table>
<span><h1 align="center"><a href="my_order.do?rest_id=${rest.restRegisterId}" align="center">order Food</a></h2></span>

  </body>
</html>