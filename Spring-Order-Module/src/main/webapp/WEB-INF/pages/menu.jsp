<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<c:set var="root" value="${pageContext.request.contextPath }"></c:set>
<h1>Order Module</h1>

<b><a href="${root}/show">Upload</a>|</b>
<b><a href="${root}/order/all">View All</a>|</b><b><a href="${root}/order/register">Register</a></b>
<h1>Shipment Module</h1>
<b><a href="${root}/shipment/all">View All</a>|</b><b><a href="${root}/shipment/register">Register</a></b>
</body>
</html>