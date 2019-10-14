<!doctype html>
<html lang="en">
 <head>
  <meta charset="UTF-8">
  <title>Document</title>
 </head>
 <body>
 
 <h1>MyPAckage</h1>
 <h1 align="center">${packagee.packageName}</h1>
 <div id="box">
<table align = "center">
	<tr>
		<td>Package Name</td>
		<td>:</td>
		<td>${requestScope.packagee.packageName}<td>
	</tr>
	<tr>
		<td>No of Days</td>
		<td>:</td>
		<td>${packagee.days}<td>
	</tr>
	<tr>
		<td>Cost Per Person</td>
		<td>:</td>
		<td>${packagee.cost}<td>
	</tr>
	<tr>
		<td>Starting Point and End Point</td>
		<td>:</td>
		<td>${packagee.startEndPoint}<td>
	</tr>
	<tr>
		<td>Food Facility</td>
		<td>:</td>
		<td>${packagee.food}<td>
	</tr>
	<tr>
		<td>Places To Visit</td>
		<td>:</td>
		<td>${packagee.placeVisit}<td>
	</tr>
	<tr>
		<td>Transport Facility</td>
		<td>:</td>
		<td>${packagee.transport}<td>
	</tr>
	<tr>
		<td>Package Details</td>
		<td>:</td>
		<td>${packagee.packageDetails}<td>
	</tr>
	<table align="center">
		<tr>
			<td>Accomodation Name</td>
			<td>:</td>
			<td>${accomodation.accomodationName}</td>
		</tr>
		<tr>
			<td>Address</td>
			<td>:</td>
			<td>${accomodation.address}</td>
		</tr>
		<tr>
			<td rowspan="3"><img src="${accomodation.accomodationPicPath}"/></td>
		</tr>
	</table>
</div>
</table>

  </body>
</html>