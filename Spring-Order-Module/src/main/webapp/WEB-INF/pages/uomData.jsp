<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
	<c:set var="root" value="${pageContext.request.contextPath }"></c:set>
</head>
<body>
<div class="container">
<a href="${root}/uom/register" class="btn btn-outline-danger">Uom Register</a>
<a href="${root}/shipment/register" class="btn btn-outline-primary">Shipment Register</a>
<a href="${root}/order/register" class="btn btn-outline-dark">Order Register</a>
<h1 class="text-center text-success text-uppercase font-weight-bold">Welcome to UomType Page</h1>
	<c:choose>
		<c:when test="${!empty list }">
			<table border="1" class="table table-hover table-success">
				<tr>
					<th>UomId</th>
					<th>uomType</th>
					<th>uomModel</th>
					<th>uomDesc</th>
					<th>Opration</th>
				</tr>
				<c:forEach items="${list }" var="ob">
					<tr>
						<td>${ob.uomId }</td>
						<td>${ob.uomType }</td>
						<td>${ob.uomModel }</td>
						<td>${ob.uomDesc }</td>
						<td><a href="edit?uid=${ob.uomId }" class="btn btn-warning">Edit</a> <a
							href="delete?uid=${ob.uomId}" class="btn btn-danger">Delete</a> <a
							href="view?uid=${ob.uomId }" class="btn btn-info">View</a>
					   </td>
					</tr>
				</c:forEach>
			</table>
		</c:when>
	</c:choose>
</div>
</body>
</html>