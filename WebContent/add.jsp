<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>

	<div class="header">
	
	
		<a href="home">Home</a> <a href="add">Add</a> <a
			href="search">Dashboard</a>
			<hr>
	</div>


	<div class="add-form">
		<h3><% Object message = request.getAttribute("message");%>
			<%= message %>	</h3>
		<h2>Enter your event</h2>
		<form action="add" method="post">
			<table class="add-table">
				<tr>
					<td>Title:</td>
					<td><input type="text" name="title"></td>
				</tr>
				<tr>
					<td>Description:</td>
					<td><textarea name="description" cols="22" rows="10"></textarea>
					</td>
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
					<td><input type="checkbox" name="available"></td>
				</tr>
				<tr>
					<td>Day:</td>
					<td><input type="date" name="date"></td>
				</tr>
				<tr>
					<td>Time:</td>
					<td><input type="time" name="time"></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="SAVE" class="save-button" ></td>
				</tr>


			</table>
		</form>

	</div>



	<div class="footer">
		<p>Develop by Re</p>
	</div>

</body>
</html>