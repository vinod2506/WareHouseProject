<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
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
			<div class="card-header text-center p-3 bg-primary text-white">
				<h1>Welcome Shipment Register Page</h1>

			</div>
			<div class="card-body table">
				<form:form action="save" method="post" modelAttribute="shipmentType" >

					<div class="row">
						<div class="col-4">
							<label for="shipMode">ShimentMode </label>
						</div>
						<div class="col-4">
							<form:select path="shipMode" cssClass="form-control">
								<form:option value="">-select-</form:option>
								<form:option value="Air">Air</form:option>
								<form:option value="Truck">Truck</form:option>
								<form:option value="Ship">Ship</form:option>
								<form:option value="Train">Train</form:option>
							</form:select>
						</div>
						<div class="col-4">
							<!-- error msg -->
						</div>
					</div>
					<div class="row">
						<div class="col-4">
							<label for="shipCode">ShipmentCode</label>
						</div>
						<div class="col-4">
							<form:input path="shipCode" cssClass="form-control" />
						</div>
						<div class="col-4">
							<!-- Error msg -->
						</div>
					</div>
					<div class="row">
						<div class="col-4">
							<label for="enableShipment">Enable Shipment</label>
						</div>
						<div class="col-4">
							<form:select path="enableShipment" cssClass="form-control ">
								<form:option value="">-select-</form:option>
								<form:option value="Yes">Yes</form:option>
								<form:option value="No">No</form:option>
							</form:select>
						</div>
						<div class="col-4">
							<!-- Error msg -->
						</div>
					</div>
					<div class="row">
						<div class="col-4">
							<label for="shipGrade">ShipmentGrade</label>
						</div>
						<div class="col-4">
							<form:checkbox path="shipGrade" value="A" />
							A
							<form:checkbox path="shipGrade" value="B" />
							B
							<form:checkbox path="shipGrade" value="C"/>
							C
						</div>
						<div class="col-4">
							<!-- Error msg -->
						</div>
					</div>
					<div class="row">
						<div class="col-4">
							<label for="description">Description</label>
						</div>
						<div class="col-4">
							<form:textarea path="description" cssClass="form-control"/>
						</div>
						<div class="col-4">
							<!-- Error msg -->
						</div>
					</div>

					<div class="row">
						<div class="col-4"></div>
						<div class="col-2">
							<input type="submit" value="Create Shipment" class="form-control btn btn-success">
						</div>
						<div class="col-2">
					<input type="reset" value="Clear Shipment" class="form-control btn btn-danger">
						</div>
						<div class="col-4">
							<!-- Error msg -->
						</div>
					</div>

				</form:form>
			</div>
			<!-- card body -->
			<c:if test="${save==true }">
			<div class="card-footer">
				
					<div class="text-success text-center font-weight-bold">${msg}</div>
			
			</div>
			</c:if>
		</div>
		<!-- card end -->
	</div> 
	<!-- container end -->
</body>
</html>