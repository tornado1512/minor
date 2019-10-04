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
		
		<form action="get_item.do" id="form1">
				<table  id="aaa" >
						<thead>
							<th>Categories</th>
							<th>Select</th>
						</thead>
						<tbody id="rec">
							
						</tbody>
						<tr>
						  <td colspan="2"><input type="submit" value="Choose" /></td>
						 </tr>
				</table>
			</form>
		</div>
		<div  id="item_box" style="visbility:hidden;">
			<form action="add_items.do"  id="form2">
				<table   id="bbb" >
					<thead>
							<th>Food Items</th>
							<th>Select</th>
							<th>Price</th>
						</thead>
						<tbody id="rec2">
							
						</tbody>
						<tr>
						  <td colspan="2"><input type="submit" value="Show Menu" /></td>
						 </tr>
				</table>
			</form>
		</div>
 </body>
</html>
