<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false" isELIgnored="false" %>

<html>
<body>
	<h2>Employee Database</h2>
	<form action="sendData" method ="Post" >
		<table>
			<tr>
				<td>Employee Name:</td>
				<td><input type="text" name="empName">
			</tr>

			<tr>
				<td>Designation:</td>
				<td><input type="text" name="empDesig">
			</tr>
			<tr>
				<td><input type="submit" value="send"></td>
			</tr>
		</table>
	</form>
		<table class="tg" border="1">
			<tr>
				<th width="80">Employee Name</th>
				<th width="120">Designation</th>
				<th width="120">Posted Date</th>

			</tr>
			<c:forEach items="${employees}" var="employee">
				<tr>
					<td>${employee.empName}</td>
					<td>${employee.empDesig}</td>
					<td>${employee.postedDate}</td>
					
				</tr>
			</c:forEach>
		</table>
</body>
</html>
