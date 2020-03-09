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

				<h1>All Part DataPage</h1>
			</div>
			<div class="card-body">
				<div class="row">
					<div class="col-4">
					<a href="pdf" class="btn btn-info">Pdf Download</a>
					<a href="excel" class="btn btn-warning">Excel Download</a>

					</div>
				</div>
				<c:choose>
					<c:when test="${!empty list }">
						<table class="table thead table-hover">
							<thead class="thead-light">
								<tr>
									<th>pid</th>
									<th>code</th>
									<th>width</th>
									<th>length</th>
									<th>height</th>
									<th>baseCost</th>
									<th>baseCurrency</th>
									<th>uom</th>
									<th>Order</th>
									<th>descp</th>
									<th colspan="3" align="center">Operation</th>
								</tr>
							</thead>
							<c:forEach items="${list }" var="ob">
								<tbody>
									<tr>
										<td scope="row">${ob.pid }</td>
										<td>${ob.code }</td>
										<td>${ob.width }</td>
										<td>${ob.length }</td>
										<td>${ob.height }</td>
										<td>${ob.baseCost }</td>
										<td>${ob.baseCurrency }</td>
										<td>${ob.uom.uomModel }</td>
										<td>${ob.odr.odrMode }</td>
										<td>${ob.descp }</td>
										<td><a href="delete?pid=${ob.pid }"
											class="btn btn-danger">Delete</a></td>
										<td><a href="Edit?pid=${ob.pid }" class="btn btn-primary">Edit</a></td>
										<td><a href="View?pid=${ob.pid }" class="btn btn-warning">View</a></td>

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
			<c:if test="${delete==true }">
				<div class="card-footer">
					<div class="text-success text-center font-weight-bold">${msg}</div>
				</div>
			</c:if>
		</div>

	</div>
</body>
</html>