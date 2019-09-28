<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <link rel="stylesheet" type="text/css" href="css/index.css" />
		<script src="js/rest.js"></script>
        <title>Resturant register</title>
    </head>
    <body>
            <% String errMsg = (String)request.getAttribute("err_msg"); %>

            <% if(errMsg!=null){ %>
            <div style="color:red">
              <%= errMsg %>
            </div>
            <% } %>
        <form action="Restaurant.do"method="post" id="regform" enctype="multipart/form-data">
            restaurant name:
            <input type="text" name="restName" id="restName"/></br>
            <!--<span id="reserr" class="errMsg">restaurant name must be at least 3 character</span></br>-->
			City:
			<select name="city" id="city">
				<option>jabalpur</option>
				<option>Bhopal</option>
				<option>Indore</option>
			</select></br>
            restaurant Address:
            <input type="text" name="restAddress" id="restAddress"/>
			</br>
            restaurant Contact no:
            <input type="number" name="restCont" id="restCont"/></br>
            <!--<span id="conterr" class="errMsg">Invalid Contact must be at least 10 character</span></br>-->
			
			Owner id:
			<input type="number" name="ownerId" id="onwerId"/></br>
			
			restaurant Image:
			<div id="box">
            <input type="file" name="img" multiple id="restImage">
			</div>
			<input type="button" value="add more pictures" id="pic"/>
			
            <input type="submit" value="Register"/>

        </form>
    </body>
</html>