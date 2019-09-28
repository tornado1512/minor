<!DOCTYPE html>
<html>
    <head>
            <meta charset="UTF-8">
            <link rel="stylesheet" type="text/css" href="css/index.css" />
            <script src="js/owner_register.js"></script>
        <title>owner Register</title>
    </head>
    <body>

            <% String errmsg = (String)request.getAttribute("err_msg"); %>

            <% if(errmsg!=null){ %>
            <div style="color:red">
              <%= errMsg %>
            </div>
            <% } %> 



        <form action="owner_regsiter.do" id="regform" method="post">
            Owner name:
            <input type="text" name="oname" id="oname"/>
            <span id="unmerr" class="errmsg"> User Name must be at least 3 characters</span><br>
            
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
		    <span id="rperr" class="errmsg">Password and RePassword must Match</span>
		    <br />
	      <input type="submit" value="owner_regsiter" />
        </form>
    </body>
</html>