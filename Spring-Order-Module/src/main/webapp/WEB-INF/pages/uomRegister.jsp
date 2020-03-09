<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>UomType Module</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<style type="text/css">
.my {
	color: blue;
	text-align: center;
}
</style>
</head>

<body>
	<div class="container">
		<div class="row">
			<div class="col-12">
				<a href="view" class="align-items-center">view All</a>
			</div>
		</div>
	</div>
	<form:form action="save" method="post" modelAttribute="uomType">
		<pre>
Enter Uom Type      :  <form:select path="uomType">
                            <form:option value="">--Select--</form:option>
                            <form:option value="Packing">Packing</form:option>
                            <form:option value="No Packing">No Packing</form:option>
                            <form:option value="NA">-NA-</form:option>
                         </form:select>
Enter Uom Model    :  <form:input path="uomModel" /> 
Enter Uom Desc      :  <form:input path="uomDesc" />
<input type="submit" value="Create Uom">
</pre>

	</form:form>
	${msg}
</body>
</html>