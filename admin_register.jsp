<!DOCTYPE html>
<html>
    <head>
            <meta charset="UTF-8">
            <link rel="stylesheet" type="text/css" href="css/index.css" />
			<script src="js/admin_register.js"></script>
        <title>admin Register</title>
    </head>
    <body>

		<form action="admin_register.do" id="regform" method="post">
			Email:<input type="email" name="email" id="email" /><br />
			Password: <input type="password" name="passw" id="passw" />
			<span class="errmsg" id="perr">Password must be at least 6 character and at max 12 characters length</span><br />
			Retype Password: <input type="password" name="repass" id="repass" />
			<span id="rperr" class="errmsg">Password and RePassword must Match</span><br />
			<input type="submit" value="admin_regsiter" />
        </form>
    </body>
</html>