<!doctype html>
<html lang="en">
 <head>
 
  <title>Document</title>
 </head>
 <body>
<h1 align="center" >Accomodation details</h1>
<form align="center"  action=" save_accomodation.do" enctype="multipart/form-data" method="post">
	<table>
		<tr>
			<td>Name</td>
			<td>:</td>
			<td><input type="text" name="aname"></td>
		</tr>
		<tr>
			<td>Address</td>
			<td>:</td>
			<td><input type="text" name="address"></td>
		</tr>
		<tr>
			<td>City</td>
			<td>:</td>
			<td><input type="text" name="city"></td>
		</tr>
		<tr>
			<td>Upload Pic</td>
			<td>:</td>
			<td><input type="file" name="pic"></td>
		</tr>
		<tr>
			<td colspan="3"><input type="submit" value="save"></td>
		</tr>
	</table>
</form>
</body>
</html>