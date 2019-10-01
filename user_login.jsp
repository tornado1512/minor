<!doctype html>
<html lang="en">
 <head>
  <title>Document</title>
 </head>
 <body>

 <% String errMsg = (String)request.getAttribute("error_msg");  %>
 <% if(errMsg!=null){ %>
  <div style="color:red">
	<%= errMsg %>
  </div>
   <% } %> 

  <form action="user_login.do" method="post">
	Email<input type="email" name="email" >
	Password<input type="password" name="passw" >
	<input type="submit" value="login">
  </form>
  <h1>New User ! create your Account</h1>
  <a href="show_user_register.do">register/user</a></br></br>
 </body>
</html>
