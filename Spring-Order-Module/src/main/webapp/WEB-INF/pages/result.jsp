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
<%@include file="usermenu.jsp" %>

	<h1>All Placed Order</h1>
	<h3><a href="${root }/order/excel">Export excel</a></h3>
	<h3><a href="${root }/order/pdf">Export Pdf</a></h3>
	<img src="../resources/images/OrderPie.jpg">
	<img src="../resources/images/OrderBar.jpg">
	<c:choose>
		<c:when test="${!empty listorder }">
			<table border="1">
				<tr>
					<th>Oid</th>
					<th>OMODE</th>
					<th>OCODE</th>
					<th>ODRMethod</th>
					<th>ODRAccept</th>
					<th>DESCription</th>
					<th colspan="3">OPERATION</th>
				</tr>
				<c:forEach items="${listorder }" var="bo">
              <tr>
              <td>${bo.oid}</td>
              <td>${bo.odrMode}</td>
              <td>${bo.odrCode}</td>
              <td>${bo.odrMethod}</td>
              <td>${bo.odrAccept}</td>
              <td>${bo.odrDescp}</td>
            
            
             <td> <a href="delete?oid=${bo.oid}">DELETE</a></td>
              <td> <a href="edit?oid=${bo.oid}">Edit</a></td>
              <td><a href="view?oid=${bo.oid }">View</a></td>
              </tr>
				</c:forEach>
			</table>
		</c:when>
		<c:otherwise>
		<h2>No Records Found</h2>
		</c:otherwise>
	</c:choose>
</body>
</html>
