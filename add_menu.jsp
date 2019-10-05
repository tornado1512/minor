<!doctype html>
<html lang="en">
 <head>
 <script src="js/add_menu.js"></script>
 <link rel="stylesheet" type="text/css" href="css/add_menu.css">
  <title>Document</title>
 </head>
 <body>
		<span id="add">Add your menu</span>
		<div id="menu_box" style="visibility:hidden;" >
				<table  id="form1" >
						<thead>
							<th>Categories</th>
							<th>Select</th>
						</thead>
						<tbody id="rec">
							
						</tbody>
						<tr>
						  <td colspan="2"><input type="button" value="Choose"  id="chsbtn"/></td>
						 </tr>
				</table>
		</div>
		<div  id="item_box" style="visibility:hidden;">
			<form action="save_menu.do" method="post">	
				<table   id="bbb" >
					<thead>
						<tr>
							<th>Food Items</th>
							<th>Price</th>
						</tr>
						</thead>
						<tbody id="rec2">
							
						</tbody>
						<tr>
							<td colspan="2"><input type="submit" value="Save Menu" /></td>
						 </tr>
				</table>
		</div>
 </body>
</html>
