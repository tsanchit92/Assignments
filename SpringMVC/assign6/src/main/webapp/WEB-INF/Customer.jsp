<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="/assign6/submitregistration" method="post">
		<table>
			<tr>
				<td>Username:<input type="text" name="Username" /></td>
			</tr>
			<tr>
				<td>Password:<input type="text" name="Password" /></td>
			</tr>
			<tr>
				<td>Email:<input type="text" name="Email" /></td>
			</tr>
			<tr>
				<td>Contact:<input type="number" name="Contact" /></td>
			</tr>
			<tr>
				<td>City:<select name="city" size="1"
					onchange="makeSubmenu(this.value)">
						<option value="" selected="selected">Choose City</option>
						<option value="Mumbai">O</option>
						<option value="Hyderbad">M</option>
						<option value="Kolkata">K</option>
				</select></td>
			</tr>
			<tr>
				<td>Zipcode:<input type="text" name="Zipcode" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Register" /></td>
			</tr>
		</table>
	</form>
</body>
</html>