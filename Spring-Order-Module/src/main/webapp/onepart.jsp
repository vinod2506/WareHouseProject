<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file="usermenu.jsp" %>
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
