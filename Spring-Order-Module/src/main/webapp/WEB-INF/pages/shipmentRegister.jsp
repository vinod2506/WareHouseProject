<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file="menu.jsp" %>
<h1>Welcome Shipment Register Page</h1>
<form:form action="save" method="post" modelAttribute="shipmentType">
<h2>
<pre>
ShimentMode    :<form:select path="shipMode">
                   <form:option value="">-select-</form:option>
                   <form:option value="Air">Air</form:option>
                   <form:option value="Truck">Truck</form:option>
                   <form:option value="Ship">Ship</form:option>
                   <form:option value="Train">Train</form:option>
                </form:select>
ShipmentCode   :<form:input path="shipCode"/>      
Enable Shipment:<form:select path="enableShipment">
                <form:option value="">-select-</form:option>
                <form:option value="Yes">Yes</form:option>
                <form:option value="No">No</form:option>
                </form:select>    
ShipmentGrade  :<form:checkbox path="shipGrade" value="A"/>A      
                <form:checkbox path="shipGrade" value="B"/>B     
                <form:checkbox path="shipGrade" value="C"/>C    
Description    :<form:textarea path="description"/> 

<input type="submit" value="Create Shipment">
</pre>
</h2>
</form:form>
${msg}
</body>
</html>