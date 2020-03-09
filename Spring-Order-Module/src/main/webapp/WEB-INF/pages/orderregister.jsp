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
			<div class="card-header">
				<h1 style="text-align: center; color: blue;">WELCOME TO ORDER
					PAGE</h1>

			</div>
			<div class="card-body">
				<form:form method="post" action="save" modelAttribute="orderType">

					<div class="row">
						<div class="col-4">
							<label for="odrMode">Choose Order Mode </label>
						</div>
						<div class="col-4">
							<form:radiobutton path="odrMode" value="sale" />
							Sale
							<form:radiobutton path="odrMode" value="purchase" />
							Purchase

						</div>
						<div class="col-4">
							<!--   error message -->
						</div>
					</div>

					<div class="row">
						<div class="col-4">
							<label for="odrCode">Choose Code</label>
						</div>
						<div class="col-4">
							<form:input path="odrCode" cssClass="form-control" />

						</div>
						<div class="col-4">
							<!--   error message -->
						</div>
					</div>



					<div class="row">
						<div class="col-4">
							<label for="odrCode">Choose OrderMethod</label>
						</div>
						<div class="col-4">
							<form:select path="odrMethod" cssClass="form-control">
								<form:option value="">--select</form:option>
								<form:option value="Fifo">FIFO</form:option>
								<form:option value="LIFO">LIFO</form:option>
								<form:option value="FELO">FELO</form:option>
							</form:select>
						</div>
						<div class="col-4">
							<!--   error message -->
						</div>
					</div>

					<div class="row">
						<div class="col-4">
							<label for="odrAccept">Choose OrderAccept</label>
						</div>
						<div class="col-4">
							<form:checkbox path="odrAccept" value="Multi_model" />
							Multi-Model
							<form:checkbox path="odrAccept" value="Accept Return"  />
							Accept Return

						</div>
						<div class="col-4">
							<!--   error message -->
						</div>
					</div>


					<div class="row">
						<div class="col-4">
							<label for="odrDescp">Description</label>
						</div>
						<div>
							<form:textarea path="odrDescp" rows="7" cols="25" cssClass="form-control" />
						</div>
						<div class="col-4">
							<!--   error message -->
						</div>
					</div>
					<div class="row">
						<div class="col-4"></div>
						<div class="2">
							<button type="submit" class="btn btn-success">Create
								Order</button>

						</div>
						<div>
							<button type="reset" class="btn btn-warning" >Clear Order</button>

						</div>
					</div>
				</form:form>
			</div>
			<c:if test="${clickSave==true }">
				<div class="card-footer  bg-dark">
					<div class="row">
						<div class="col-4"></div>
						<div class="font-weight-bold text-primary">${msg }</div>
					</div>
				</div>
			</c:if>
		</div>
	</div>
</body>
</html>