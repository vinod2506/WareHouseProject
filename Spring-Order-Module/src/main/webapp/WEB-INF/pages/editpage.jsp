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
<%@include file="menu.jsp" %>
	<h1 style="text-align: center; color: blue;">WELCOME TO Order Type Edit PAGE</h1>

	<form:form method="post" action="update" modelAttribute="orderType">

		<h2 style="color: green; text-align: left;">
<pre>
  Order Id           :  <form:input path="oid" readonly="true"/>
  Choose Order Mode  :   <form:radiobutton path="odrMode" value="sale"/>Sale
                         <form:radiobutton path="odrMode" value="purchase" />Purchase 
                      
  Choose Code        :   <form:input path="odrCode" />
  Choose OrderMethod :   <form:select path="odrMethod">
                         <form:option value="">--select</form:option>
                         <form:option value="Fifo">FIFO</form:option>
                         <form:option value="LIFO">LIFO</form:option>
                         <form:option value="FELO">FELO</form:option>
                         </form:select>
                         <fieldset>
                         <legend>Please select only two options</legend>
  Choose OrderAccept :   <form:checkbox path="odrAccept"
						value="Multi_model" onclick="return ValidatePetSelection();" />Multi-Model 
                         <form:checkbox path="odrAccept"
						value="Accept Return" onclick="return ValidatePetSelection();" />Accept Return
                         </fieldset>
  Description        :  
                          <form:textarea path="odrDescp" rows="7"
					cols="25" />
               <input type="submit" value="Update">
                         
</pre>
		

</form:form>
	<h1>${msg }</h1>
	


</body>
</html>