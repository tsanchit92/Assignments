<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
	<h1>Employees List</h1>
	<table>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Salary</th>
		</tr>
		<c:forEach var="emp" items="${msg}">
			<tr>
				<td>${emp.id}</td>
				<td>${emp.name}</td>
				<td>${emp.salary}</td>
			</tr>
		</c:forEach>
	</table>
	<br />
	<a href="/Springmvc9/viewemp/1">1</a>
	<a href="/Springmvc9/viewemp/2">2</a>
	<a href="/Springmvc9/viewemp/3">3</a>
</body>
</html>
