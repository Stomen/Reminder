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
					
					<h2 class="text h2">Enter your event</h2>
					
					<p><font color = "green"><c:out value='${messageTrue}'/></font></p>
					<p><font color = "red"><c:out value="${messageFalse}"></c:out></font></p>	
																														
					<form action="add" method="post">
						<table class="table-style-add text">
								<tr>
									<td>Title:</td>
									<td><input type="text" name="title" class="input"></td>
								</tr>
								<tr>
									<td>Description:</td>
									<td><textarea name="description" cols="22" rows="10" class="textarea"></textarea></td>
								</tr>
								<tr>
									<td>Type:</td>
									<td><select name="type" size="1">
										<option value="first">first</option>
										<option value="second">second</option>
										<option value="thirth">thirth</option>
			
										</select></td>
								</tr>
								<tr>
									<td>Available:</td>
									<td><input type="checkbox" name="available" class="input"></td>
								</tr>
								<tr>
									<td>Day:</td>
									<td><input type="date" name="date" class="input"></td>
								</tr>
								<tr>
									<td>Time:</td>
									<td><input type="time" name="time" class="input"></td>
								</tr>
								<tr>
									<td></td>
									<td><input type="submit" value="SAVE" class="save-button" class="input"></td>
								</tr>
			
			
						</table>
					</form>
			</div>
			
		
		
			<div class="footer">
			<hr>
				<p class="text">Develop by Re</p>
			</div>
			
		</div>	

</body>
</html>