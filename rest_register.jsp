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
            <input type="number" name="restCont" id="restCont"/></br></br>
            <!--<span id="conterr" class="errMsg">Invalid Contact must be at least 10 character</span></br>-->
			
			Owner id:
			<input type="number" name="ownerId" id="onwerId"/></br></br>
			
			
			Opening Time
			<input type="time" name="optime"/></br></br>
			
			Closing Time
			<input type="time" name="cltime"/></br></br>
            <input type="submit" value="Register"/>

			restaurant Image:
			<div id="box">
            <input type="file" name="img" multiple id="restImage">
			</div>
			<input type="button" value="add more pictures" id="pic"/>
			</br></br>

        </form>
    </body>
</html>