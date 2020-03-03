<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@include file="usermenu.jsp"%>
</head>
<body>
	<div class="container">
		<div class="card">
			<div class="card-header text-center bg-secondary text-white text-uppercase" >
				<h1>All Shipment Records</h1>

			<a href="${root }/shipment/excel"><img
				src="../resources/images/Excel.PNG" width="100" height="70"></a> <a
				href="${root }/shipment/pdf"><img
				src="../resources/images/pdf-download-button.png" width="100"
				height="70"></a>
			</div>
			<div class="card-body">
			<c:choose>
				<c:when test="${!empty list }">
					<table class="table thead table-hover">
						<thead class="thead-light">
							<tr>
								<th scope="col">ShipId</th>
								<th scope="col">shipMode</th>
								<th scope="col">shipCode</th>
								<th scope="col">enableShipment</th>
								<th scope="col">shipGrade</th>
								<th scope="col">description</th>
								<th scope="col" colspan="3">OPERATION</th>
							</tr>
						</thead>
						<c:forEach items="${list }" var="ob">
							<tbody>
								<tr>
									<td scope="row">${ob.sid }</td>
									<td>${ob.shipMode }</td>
									<td>${ob.shipCode }</td>
									<td>${ob.enableShipment }</td>
									<td>${ob.shipGrade }</td>
									<td>${ob.description }</td>
									<td><a href="edit?sid=${ob.sid }"><img
											src="../resources/images/edit.jpg" width="70" height="40"></a></td>
				
									<td><a href="view?sid=${ob.sid }"><img
											src="../resources/images/viewd.jpg" width="70" height="50"></a></td>
									<td><a href="delete?sid=${ob.sid }"><img
											src="../resources/images/delete.png" width="70" height="50"></a></td>
								</tr>
							</tbody>

						</c:forEach>
					</table>

				</c:when>
				<c:otherwise>
					<h1>No Records Found</h1>
				</c:otherwise>
			</c:choose>
			</div>
		</div>
	</div>
</body>
</html>