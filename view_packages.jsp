<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="models.*"%>
<%@page import="java.util.*"%>
<!doctype html>
<html lang="en">
 <head>
  <meta charset="UTF-8">
  <link rel="stylesheet" href="css/view_pack.css"/>
  <title>Document</title>
 </head>
 <body>
  <h1 align="center">Packages</h1></br>
	<div id="box1">	
	<span id='all' class="but">All packages</span>
	<span class="but" id='but1'>Religous</span>
	<span id='but2' class="but">Adventorous</span>
	<span id='but3' class="but">Family Vacations</span>
	<span id='but4' class="but">HoneyMoon<span>
	</div>
	<%ArrayList<Packagee> packages= (ArrayList<Packagee>)session.getAttribute("packages");%>
  <div id="main" border="1">
  <%for(Packagee pac:packages){%>
	<div id="iner1">
		<table border="1">
			<tr >
				<td rowspan="2"><img src="<%= pac.getDispImg()%>"/></td>
				<td><%=pac.getPackageName()%></td>
				<td rowspan="2">Price:<%=pac.getCost()%></td>
			</tr>
			<tr >
				<td><a href="#?id=<>">Read More</a></td>
			</tr>
		</table>
	<div>
	<%}%>
  </div>
 </body>
</html>

