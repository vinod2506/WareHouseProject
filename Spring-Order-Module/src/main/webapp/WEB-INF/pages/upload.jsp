<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome to file Upload page</h1>
	<form action="upload" method="post" enctype="multipart/form-data">
		<pre>
Id         : <input type="text" name="fileId">
Select Doc : <input type="file" name="fileOb">
<input type="submit" value="upload">
</pre>
	</form>
	${msg}
	<br>
	<br>
	<h1>All Files Download Links</h1>
	<c:choose>
		<c:when test="${!empty list }">
			<table border="1">
				<tr>
					<th>FileId</th>
					<th>FileName</th>
					<th>Links</th>
				</tr>
				<c:forEach items="${list }" var="ob">
				<tr>
				<td>${ob[0]}</td>
				<td>${ob[1]}</td>
				<td>
				<a href="download?fid=${ob[0]}"><img src="./resources/images/down.png" width="120" height="60" ></a>
				</td>
				</tr>
				
				</c:forEach>
			</table>
		</c:when>
		<c:otherwise>21
		<h2>No Record found</h2>
		</c:otherwise>
	</c:choose>
</body>
</html>