<!doctype html>
<html lang="en">
 <head>
  <meta charset="UTF-8">
  <title>Document</title>
 </head>
 <body>
 <% Integer ownerId=(Integer)session.getAttribute("ownerId");%>
 <h1>ownerId<%=ownerId%> <h1>
  <h1 align="center">My Rest home </h1>
  <h1><a href="view_booking.jsp">View my bookings</a></h1>
  <h1><a href="add_menu.do">add menu</a></h1>
  

 </body>
</html>
