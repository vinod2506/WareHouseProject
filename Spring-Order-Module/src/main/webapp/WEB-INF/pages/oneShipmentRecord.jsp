<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Based on Shipment Id records</h1>
	<a href="pdf?id=${result.sid }">Export Pdf</a>
	<table border="1">

		<tr>
			<th>ShipMentId</th>
			<td>${result.sid }</td>
		</tr>
		<tr>
			<th>ShipMentMode</th>
			<td>${result.shipMode }</td>
		</tr>
		<tr>
			<th>ShipMentCode</th>
			<td>${result.shipCode }</td>
		</tr>
		<tr>
			<th>EnableShipMent</th>
			<td>${result.enableShipment}</td>
		</tr>
		<tr>
			<th>ShipMentGrade</th>
			<td>${result.shipGrade}</td>
		</tr>
		<tr>
			<th>Description</th>
			<td>${result.description}</td>
		</tr>

	</table>
</body>
</html>