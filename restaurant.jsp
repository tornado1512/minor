<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <link rel="stylesheet" type="text/css" href="css/index.css" />
        <title>Resturant register</title>
    </head>
    <body>
            <% String errMsg = (String)request.getAttribute("err_msg"); %>

            <% if(errMsg!=null){ %>
            <div style="color:red">
              <%= errMsg %>
            </div>
            <% } %>
        <form action="Restaurant.do" id="regform">
            restaurant name:
            <input type="text" name="uname" id="resname"/>
            <span id="reserr" class="errMsg">Invalid username must be at least 3 character</span>

            restaurant Address:
            <input type="text" name="resaddres" id="resaddres"/>
            <span id="addserr" class="errMsg">Invalid Address must be at least 10 character</span>

            restaurant Contact no.:
            <input type="number" name="rescont" id="rescont"/>
            <span id="conterr" class="errMsg">Invalid Contact must be at least 10 character</span>

            restaurant Image:
            <input type="file" name="img" multiple id="resimage">
            <span id="imagerr" class="errMsg">select Image</span>

            <input type="submit" value="Restaurant"/>

        </form>
    </body>
</html>