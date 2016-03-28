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
					<a href="search">Dashboard</a>
					<hr>
			</div>
			<div class = "aside">
				<h2 class="text">My right col</h2>
			</div>
		
			<div class="content">
					
					<h2 class="text">Enter your event</h2>
							<p><% Object message = request.getAttribute("message");%>
							<% if(message==null)
								{
								message = "";
								}%>
							<%= message %>	</p>
					
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
										<option name="first">Первый</option>
										<option name="second">Второй</option>
										<option name="thirth">Третий</option>
			
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