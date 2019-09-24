<!DOCTYPE html>
<html>
    <head>
            <meta charset="UTF-8">
            <link rel="stylesheet" type="text/css" href="css/index.css" />
            <script src="js/index.js"></script>
        <title>owner Register</title>
    </head>
    <body>

            <% String errmsg = (String)request.getAttribute("err_msg"); %>

            <% if(errmsg!=null){ %>
            <div style="color:red">
              <%= errMsg %>
            </div>
            <% } %> 



        <form action="owner_regsiter.do" id="regform">
            Owner name:
            <input type="text" name="oname" id="oname"/>
            <span id="onmerr" class="errmsg">Invalid User Name must be at least 3 characters</span><br>
            
            Email: 
		    <input type="email" name="email" id="email" />
		    <span id="emerr" class="errmsg">Invalid Email!!</span>	
		    <br />
    
            Password: 
		    <input type="password" name="passw" id="passw" />
		    <span class="errmsg" id="perr">Password must be at least 6 character and at max 12 characters length</span>
		    <br />
		
	        Retype Password: 
		    <input type="password" name="repass" id="repass" />
		    <span id="rperr" class="errmsg">Password and RePassword Must Match</span>
		    <br />
	      <input type="submit" value="owner_regsiter" />
        </form>
    </body>
</html>