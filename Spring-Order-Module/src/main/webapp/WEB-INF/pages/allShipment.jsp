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
<%@include file="menu.jsp" %>
<h1>All Shipment Records</h1>
<h1><a href="${root }/shipment/excel">Export Excel</a></h1>
<h1><a href="${root }/shipment/pdf">Export Pdf</a></h1>
	<c:choose>
		<c:when test="${!empty list }">
			<table border="1">
				<tr>
					<th>ShipId</th>
					<th>shipMode</th>
					<th>shipCode</th>
					<th>enableShipment</th>
					<th>shipGrade</th>
					<th>description</th>
					<th colspan="3">OPERATION</th>
				</tr>
			<c:forEach items="${list }" var="ob">
				<tr>
					<td>${ob.sid }</td>
					<td>${ob.shipMode }</td>
					<td>${ob.shipCode }</td>
					<td>${ob.enableShipment }</td>
					<td>${ob.shipGrade }</td>
					<td>${ob.description }</td>
					<td><a href="edit?sid=${ob.sid }">Edit</a></td>
					<td><a href="view?sid=${ob.sid }">View</a></td>
					<td><a href="delete?sid=${ob.sid }">Delete</a></td>
				</tr>
			</c:forEach>
			</table>
		</c:when>
		<c:otherwise>
		<h1>No Records Found</h1>
		</c:otherwise>
	</c:choose>
</body>
</html>