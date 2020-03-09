<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Part Module</title>
<%@include file="usermenu.jsp"%>
</head>
<body>
<c:if test="${edit==true}"> 
	<div class="container">
		<div class="card">
			<div class="card-header text-center p-3 bg-primary text-white">
				<h1>Welcome to Part Edit page</h1>
			</div>
			<div class="card-body table">
				
				 <form:form action="update" method="post" modelAttribute="part"> 
			
					<div class="row">
						<div class="col-4">
							<label for="code">Enter Code</label>
						</div>
						<div class="col-4">
							<form:input path="code" cssClass="form-control"></form:input>
						</div>
						<div>
							<!-- error msg -->
						</div>
					</div>

					<div class="row">
						<div class="col-4">
							<label for="width">Enter width</label>
						</div>
						<div class="col-4">
							<form:input path="width" cssClass="form-control"></form:input>
						</div>
						<div>
							<!-- error msg -->
						</div>
					</div>

					<div class="row">
						<div class="col-4">
							<label for="length">Enter length</label>
						</div>
						<div class="col-4">
							<form:input path="length" cssClass="form-control"></form:input>
						</div>
						<div>
							<!-- error msg -->
						</div>
					</div>

					<div class="row">
						<div class="col-4">
							<label for="height">Enter height</label>
						</div>
						<div class="col-4">
							<form:input path="height" cssClass="form-control"></form:input>
						</div>
						<div>
							<!-- error msg -->
						</div>
					</div>

					<div class="row">
						<div class="col-4">
							<label for="baseCost">Enter Base Cost</label>
						</div>
						<div class="col-4">
							<form:input path="baseCost" cssClass="form-control"></form:input>
						</div>
						<div>
							<!-- error msg -->
						</div>
					</div>

					<div class="row">
						<div class="col-4">
							<label for="baseCurrency">Enter Base Currency</label>
						</div>
						<div class="col-4">
							<form:select path="baseCurrency" cssClass="form-control">
							<form:option value="">--select--</form:option>
							<form:option value="INR">INR</form:option>
							<form:option value="USD">USD</form:option>
							<form:option value="AUS">AUS</form:option>
							</form:select>
						</div>
						<div>
							<!-- error msg -->
						</div>
					</div>

					<div class="row">
						<div class="col-4">
							<label for="baseCurrency">Select Uom</label>
						</div>
						<div class="col-4">
							<form:select path="uom.uomId" cssClass="form-control">
								<form:option value="">--select--</form:option>
								<form:options items="${uomMap }"/>
							</form:select>
						</div>
						<div>
							<!-- error msg -->
						</div>
					</div>
					
						<div class="row">
						<div class="col-4">
							<label for="odr.oid">Order Method Mode(Based on sale)</label>
						</div>
						<div class="col-4">
							<form:select path="odr.oid" cssClass="form-control" >
								<form:option value="">--select--</form:option>
								<form:options items="${odrsaleMap }"/>
							</form:select>
						</div>
						<div>
							<!-- error msg -->
						</div>
					</div>
					
						<div class="row">
						<div class="col-4">
							<label for="odr.oid">Order Method Mode(Based on Purchase)</label>
						</div>
						<div class="col-4">
							<form:select path="odr.oid" cssClass="form-control">
								<form:option value="">--select--</form:option>
								<form:options items="${odrPurMap }"/>
							</form:select>
						</div>
						<div>
							<!-- error msg -->
						</div>
					</div>
					

					<div class="row">
						<div class="col-4">
							<label for="descp">Enter Description</label>
						</div>
						<div class="col-4">
							<form:input path="descp" cssClass="form-control"></form:input>
						</div>
						<div>
							<!-- error msg -->
						</div>
					</div>
					<div class="row">
						<div class="col-4"></div>
						<div class="col-4">
							<input type="submit" value="Create" class="btn btn-success">
							<input type="reset" value="Clear" class="btn btn-danger">
						</div>


					</div>

				
			 </form:form> 
				<c:if test="${save==true }">
					<div class="card-footer">

						<div class="text-success text-center font-weight-bold">${msg}</div>

					</div>
				
	     	</c:if>
 
			</div>

		</div>

	</div>
	</c:if>
	<c:if test="${register==true }">
	<div class="container">
		<div class="card">
			<div class="card-header text-center p-3 bg-primary text-white">
				<h1>Welcome to Part Registration page</h1>
			</div>
			<div class="card-body table">
				
				 
				<form:form action="save" method="post" modelAttribute="part">
					<div class="row">
						<div class="col-4">
							<label for="code">Enter Code</label>
						</div>
						<div class="col-4">
							<form:input path="code" cssClass="form-control"></form:input>
						</div>
						<div>
							<!-- error msg -->
						</div>
					</div>

					<div class="row">
						<div class="col-4">
							<label for="width">Enter width</label>
						</div>
						<div class="col-4">
							<form:input path="width" cssClass="form-control"></form:input>
						</div>
						<div>
							<!-- error msg -->
						</div>
					</div>

					<div class="row">
						<div class="col-4">
							<label for="length">Enter length</label>
						</div>
						<div class="col-4">
							<form:input path="length" cssClass="form-control"></form:input>
						</div>
						<div>
							<!-- error msg -->
						</div>
					</div>

					<div class="row">
						<div class="col-4">
							<label for="height">Enter height</label>
						</div>
						<div class="col-4">
							<form:input path="height" cssClass="form-control"></form:input>
						</div>
						<div>
							<!-- error msg -->
						</div>
					</div>

					<div class="row">
						<div class="col-4">
							<label for="baseCost">Enter Base Cost</label>
						</div>
						<div class="col-4">
							<form:input path="baseCost" cssClass="form-control"></form:input>
						</div>
						<div>
							<!-- error msg -->
						</div>
					</div>

					<div class="row">
						<div class="col-4">
							<label for="baseCurrency">Enter Base Currency</label>
						</div>
						<div class="col-4">
							<form:select path="baseCurrency" cssClass="form-control">
							<form:option value="">--select--</form:option>
							<form:option value="INR">INR</form:option>
							<form:option value="USD">USD</form:option>
							<form:option value="AUS">AUS</form:option>
							</form:select>
						</div>
						<div>
							<!-- error msg -->
						</div>
					</div>

					<div class="row">
						<div class="col-4">
							<label for="baseCurrency">Select Uom</label>
						</div>
						<div class="col-4">
							<form:select path="uom.uomId" cssClass="form-control">
								<form:option value="">--select--</form:option>
								<form:options items="${uomMap }"/>
							</form:select>
						</div>
						<div>
							<!-- error msg -->
						</div>
					</div>
					
						<div class="row">
						<div class="col-4">
							<label for="odr.oid">Order Method Mode(Based on sale)</label>
						</div>
						<div class="col-4">
							<form:select path="odr.oid" cssClass="form-control" >
								<form:option value="">--select--</form:option>
								<form:options items="${odrsaleMap }"/>
							</form:select>
						</div>
						<div>
							<!-- error msg -->
						</div>
					</div>
					
						<div class="row">
						<div class="col-4">
							<label for="odr.oid">Order Method Mode(Based on Purchase)</label>
						</div>
						<div class="col-4">
							<form:select path="odr.oid" cssClass="form-control">
								<form:option value="">--select--</form:option>
								<form:options items="${odrPurMap }"/>
							</form:select>
						</div>
						<div>
							<!-- error msg -->
						</div>
					</div>
					

					<div class="row">
						<div class="col-4">
							<label for="descp">Enter Description</label>
						</div>
						<div class="col-4">
							<form:input path="descp" cssClass="form-control"></form:input>
						</div>
						<div>
							<!-- error msg -->
						</div>
					</div>
					<div class="row">
						<div class="col-4"></div>
						<div class="col-4">
							<input type="submit" value="Create" class="btn btn-success">
							<input type="reset" value="Clear" class="btn btn-danger">
						</div>


					</div>

				</form:form>
			
				<c:if test="${save==true }">
					<div class="card-footer">

						<div class="text-success text-center font-weight-bold">${msg}</div>

					</div>
				
	     	</c:if>
 
			</div>

		</div>

	</div>
	</c:if>
</body>
</html>