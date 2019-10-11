<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <link rel="stylesheet" type="text/css" href="css/index.css" />
		<script src="js/package.js"></script>
        <title>Resturant register</title>
    </head>
    <body>
		<form action="package.do" method="post" enctype="multipart/form-data">
			Package Name:<input type="text" name="pacname" id="pacname" /></br></br>
			
			Package Category:</br>
			National:<input type="radio" name="category" value="National" />
			International:<input type="radio" name="category" value="International" /></br></br>

			Type Category:</br>
			religious:<input type="radio" name="typecategory" value="religious" />
			Honeymoon:<input type="radio" name="typecategory" value="Honeymoon" />
			Family Vacation:<input type="radio" name="typecategory" value="Family Vacation" />
			Adventurous:<input type="radio" name="typecategory" value="Adventurous" /></br></br>

			Accomodation:<input type="text" name="accomodation" id="accomodation"/></br></br>

			Days:<input type="text" name="day" id="day" /></br></br>

			Cost:<input type="text" name="cost" id="cost" /></br></br>

			Start-End point:<input type="text" name="sepoint" id="sepoint"/></br></br>

			Food:<input type="text" name="food" id="food" /></br></br>

			Place Visit:<input type="text" name="placevisit" id="placevisit"/></br></br>

			Transport:<input type="text" name="transport" id="transport"/></br></br>

			Package Details:<textarea  name="details" id="details"></textarea></br></br>

			Contact No:<input type="text" name="number" id="number" /></br></br>

			Package Image:</br>
			<div id="pac_box">
				<input type="file" name="img" id="file1">
			</div>
			<input type="button" value="add more pictures" id="pic"/>
			</br></br>
			
			Display Image<input type="file" name="disp_img">
			<input type="submit" value="add Pacakge" />
		</form>
	
    </body>
</html>