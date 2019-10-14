<%@page import="java.util.ArrayList,models.User"%>
<!doctype html>
<html lang="en">
 <head>
  <meta charset="UTF-8">
  <meta name="Generator" content="EditPlus®">
  <meta name="Author" content="">
  <meta name="Keywords" content="">
  <meta name="Description" content="">
  <title>Document</title>
 </head>
 <body>
  <% ArrayList<RestRegister> rests=(ArrayList)request.getAttribute("rests");%>
  <table border="2">
	<tr>
		<td>restuarnt name</td>
		<td>restuarnt address</td>
		<td>restuarnt contact</td>
		<td>opening time</td>
		<td>closing time </td>

	</tr>
	<%for(RestRegister rest:rests){%>
	<tr>
		<td><%=rest.getRestName()%></td>
		<td><%=rest.getRestAddress()%></td>
    <td><%=rest.getRestContact()%></td>
    <td><%=rest.getRestOpTime()%></td>
    <td><%=rest.getRestClTime()%></td>
	</tr>
	<%}%>
  </table>
 </body>
</html>