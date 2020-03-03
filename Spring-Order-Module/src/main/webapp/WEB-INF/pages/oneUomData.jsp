<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>UOM DATA</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
	<c:set var="root" value="${pageContext.request.contextPath }"></c:set>
</head>
<body>
	<div class="container">
	<a href="${root}/uom/all" class="btn btn-warning">Uom HomePage</a>
		<h1 class="text-center text-success text-uppercase font-weight-bold">UomType ${uom.uomId} Record</h1>
		<table class="table table-bordered table-hover">
			<tr>
				<th>UOmId</th>
				<td>${uom.uomId}</td>
			</tr>

			<tr>
				<th>UOMType</th>
				<td>${uom.uomType}</td>
			</tr>

			<tr>
				<th>uomModel</th>
				<td>${uom.uomModel}</td>
			</tr>
			<tr>
				<th>uomDesc</th>
				<td>${uom.uomDesc}</td>
			</tr>
		</table>
	</div>
</body>
</html>