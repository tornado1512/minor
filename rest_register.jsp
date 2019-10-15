<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <link rel="stylesheet" type="text/css" href="css/index.css" />
		<script src="js/rest.js"></script>
        <title>Resturant register</title>
    </head>
    <body>

	 <% String errmsg = (String)request.getAttribute("err_msg"); %>

            <% if(errmsg!=null){ %>
            <div style="color:red">
              <%= errmsg %>
            </div>
            <% } %> 


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
            <span id="conterr" class="errmsg">Invalid Contact must be eqaul to 10 character</span></br>
			<%Integer oid= (Integer)request.getAttribute("oid");%>
			Owner id:
			<input type="hidden" value="<%=oid%>"  name="ownerId" id="onwerId"/></br></br>
			
			
			Opening Time
			<input type="time" name="optime"/></br></br>
			
			Closing Time
			<input type="time" name="cltime"/></br></br>

			Category:</br>
			Chinese<input type="checkbox" name="category1" value="Chinese" /></br>
			South Indian<input type="checkbox" name="category2" value="South Indian" /></br>
			North Indian<input type="checkbox" name="category3" value="North Indian" /></br>
			Italian<input type="checkbox" name="category4" value="Italian" /></br>
            

			restaurant Image:
			<div id="box">
            <input type="file" name="img"  id="file1">
			</div>
			<input type="button" value="add more pictures" id="pic"/>
			</br></br>

			Display Image<input type="file" name="disp_img">

			<input type="submit" value="Register"/>
			
        </form>
    </body>
</html>