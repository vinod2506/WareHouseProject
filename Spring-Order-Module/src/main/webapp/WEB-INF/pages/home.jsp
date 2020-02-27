<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!--    shipment register page -->
<c:if test="${shipmentRegister==true }">
	<%@include file="shipmentRegister.jsp"%>
</c:if>

<!--  save shipment type -->
<c:if test="${save==true }">
	<%@include file="shipmentRegister.jsp"%>
</c:if>


<c:if test="${delete==true }">
	<% response.sendRedirect("all");%>
</c:if>

<c:if test="${all==true }">
	<%@include file="allShipment.jsp"%>
</c:if>

<c:if test="${view==true }">
	<%@include file="oneShipmentRecord.jsp"%>
</c:if>



<c:if test="${edit==true }">
	<%@include file="editShipment.jsp"%>
</c:if>


<c:if test="${update==true }">
	<%@include file="editShipment.jsp"%>
</c:if>










