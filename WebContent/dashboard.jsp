<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="ua.krasovskij.model.Event"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Reminder</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body class="background">


	<div class="all">

			<div class="header">
					<a class="links" href="home">Home</a>
					<a class="links" href="add">Add</a> 
					<a class="links" href="display">Dashboard</a>
					<hr>
			</div>
			
			<div class = "aside">
					<h2 class="text h2">My right col</h2>
			</div>
		
			<div class="content">
			
					<form action="search" method="get">
						<input class="input-search" type="text" name="param">
						<input type="submit" value="search" class="input"> <br>
					</form>		
								
						<p><font color = "green"><c:out value='${removeTrue}'/></font></p>
						<p><font color = "red"><c:out value="${removeFalse}"></c:out></font></p>	
						
					<table class="table-style text">
				
						<tr>
							<td>Number</td>
							<td>Title</td>
							<td>Description	</td>
							<td>Date and Time </td>
							<td></td>
						</tr>
			
							<c:set var="count" value="1"></c:set>
						<c:forEach var="event" items="${listEvent}">
						<tr>
							<td>${count}</td>
							<td>${event.title}</td>
							<td>Description	</td>
							<td>${event.date} : ${event.time} </td>
							<td>
								<form action="remove" method="get">
									<input type="hidden" name="id" value="${event.id}" >
									<input type="submit" value="delete">
								</form>
							</td>
						</tr>
							<c:set var="count" value="${count + 1}"></c:set>
						</c:forEach>
				
					</table>
				
			</div>
			
		
		
			<div class="footer">
				<hr>
				<p class="text">Develop by Re</p>
			</div>
			
		</div>	
	
</body>
</html>