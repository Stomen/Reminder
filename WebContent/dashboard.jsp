
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>


	<div class="all">

			<div class="header">
					<a href="home">Home</a>
					<a href="add">Add</a> 
					<a href="display">Dashboard</a>
					<hr>
			</div>
			
			<div class = "aside">
					<h2 class="text">My right col</h2>
			</div>
		
			<div class="content">
			
					<form action="search" method="get">
						<input class="input-search" type="text" name="param">
						<input type="submit" value="search" class="input"> <br>
					</form>		
								
						<p><font color = "green"><c:out value='${True}'/></font></p>
						<p><font color = "red"><c:out value="${False}"></c:out></font></p>	
						
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