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
	<%@include file="usermenu.jsp"%>

	<div class="container">
		<div class="card">
			<div
				class="card-header text-center bg-success text-white text-uppercase">
				<h1>All Order Records</h1>

				<h3>
					<a href="${root }/order/excel" class="btn btn-warning">Export excel</a>
				</h3>
				<h3>
					<a href="${root }/order/pdf" class="btn btn-danger">Export Pdf</a>
				</h3>
			</div>
			<div class="card-body">
				<c:choose>
					<c:when test="${!empty listorder }">
						<table class="table thead table-hover">
							<thead class="thead-light">
								<tr>
									<th scope="col">Oid</th>
									<th scope="col">OMODE</th>
									<th scope="col">OCODE</th>
									<th scope="col">ODRMethod</th>
									<th scope="col">ODRAccept</th>
									<th scope="col">DESCription</th>
									<th colspan="3">OPERATION</th>
								</tr>
							</thead>
							<c:forEach items="${listorder }" var="bo">
								<tbody>
									<tr>
										<td>${bo.oid}</td>
										<td>${bo.odrMode}</td>
										<td>${bo.odrCode}</td>
										<td>${bo.odrMethod}</td>
										<td>${bo.odrAccept}</td>
										<td>${bo.odrDescp}</td>


										<td><a href="delete?oid=${bo.oid}" class="btn btn-primary">DELETE</a></td>
										<td><a href="edit?oid=${bo.oid}" class="btn btn-success">Edit</a></td>
										<td><a href="view?oid=${bo.oid }" class="btn btn-dark">View</a></td>
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


	
