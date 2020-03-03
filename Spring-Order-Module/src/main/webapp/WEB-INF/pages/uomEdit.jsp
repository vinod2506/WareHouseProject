<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Uom Update</title>
<c:set var="root" value="${pageContext.request.contextPath }"></c:set>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
</head>
<body>
<a href="${root}/uom/all" class="btn btn-info">Uom HomePage</a>
	<div class="container">
<h1 class="text-center text-success text-uppercase font-weight-bold">Welcome to UomType Update Page</h1>

		<form:form action="update" method="post" modelAttribute="uomType">
			<div class="row">
				<div class="col-4">
					<label for="uomId" class="card-link">Uom Id</label>
				</div>
				<div class="col-4">
					<form:input path="uomId" readonly="true" cssClass="form-control" />
				</div>
				<div class="col-4">
					<!--error msg -->
				</div>
			</div>

			<div class="row">
				<div class="col-4">
					<label for="uomType">Select UomType</label>
				</div>
				<div class="col-4">
					<form:select path="uomType" cssClass="form-control">
						<form:option value="">--Select--</form:option>
						<form:option value="Packing">Packing</form:option>
						<form:option value="No Packing">No Packing</form:option>
						<form:option value="NA">-NA-</form:option>
					</form:select>
				</div>
				<div class="col-4">
					<!-- error msg -->
				</div>
			</div>

			<div class="row">
				<div class="col-4">
					<label for="uomModel">Enter Order Model</label>
				</div>
				<div class="col-4">
					<form:input path="uomModel" cssClass="form-control" />
				</div>
				<div class="col-4">
					<!-- error msg -->
				</div>
			</div>

			<div class="row">
				<div class="col-4 ">
					<label for="uomDesc">Enter Order Desc</label>
				</div>
				<div class="col-4">
					<form:input path="uomDesc" cssClass="form-control" />
				</div>
				<div class="col-4">
					<!-- error msg -->
				</div>
			</div>

			<div class="row">
				<div class="col-4"></div>
				<div class="col-4">
					<input type="submit" value="Update Uom" class="btn btn-success"> <input
						type="reset" value="Clear Uom" class="btn btn-danger">
				</div>

			</div>	
		</form:form>
		${msg}
	</div>
</body>
</html>