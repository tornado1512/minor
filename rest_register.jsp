<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <link rel="stylesheet" type="text/css" href="css/index.css" />
		<script src="js/rest.js"></script>
        <title>Resturant register</title>
    </head>
    <body>
        <form action="Restaurant.do"method="post" id="regform" enctype="multipart/form-data">
            Restaurant name:
            <input type="text" name="restName" id="restName"/></br>
			City:
			<select name="city" id="city">
				<option>jabalpur</option>
				<option>Bhopal</option>
				<option>Indore</option>
			</select></br>
            restaurant Address:
            <input type="text" name="restAddress" id="restAddress"/>
			</br></br>
            restaurant Contact no:
            <input type="text" name="restContact" id="restContact"/></br></br>
            <!--<span id="conterr" class="errMsg">Invalid Contact must be at least 10 character</span></br>-->
			
			Owner id:
			<input type="number" name="ownerId" id="onwerId"/></br></br>
			
			
			Opening Time
			<input type="time" name="optime"/></br></br>
			
			Closing Time
			<input type="time" name="cltime"/></br></br>
            

			restaurant Image:
			<div id="box">
            <input type="file" name="img"  id="file1">
			</div>
			<input type="button" value="add more pictures" id="pic"/>
			</br></br>
			<input type="submit" value="Register"/>

        </form>
    </body>
</html>