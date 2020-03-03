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
<%@include file="usermenu.jsp" %>


<h1 style="text-align: center; color: blue;">WELCOME TO ORDER PAGE</h1>

	<form:form method="post" action="save" modelAttribute="orderType">
  <div class="form-row">
    <div class="form-group col-md-6">
      <label for="inputEmail4">Email</label>
      <input type="email" class="form-control" id="inputEmail4">
    </div>
    <div class="form-group col-md-6">
      <label for="inputPassword4">Password</label>
      <input type="password" class="form-control" id="inputPassword4">
    </div>
  </div>
  <div class="form-group">
    <label for="inputAddress">Address</label>
    <input type="text" class="form-control" id="inputAddress" placeholder="1234 Main St">
  </div>
  <div class="form-group">
    <label for="inputAddress2">Address 2</label>
    <input type="text" class="form-control" id="inputAddress2" placeholder="Apartment, studio, or floor">
  </div>
  <div class="form-row">
    <div class="form-group col-md-6">
      <label for="inputCity">City</label>
      <input type="text" class="form-control" id="inputCity">
    </div>
    <div class="form-group col-md-4">
      <label for="inputState">State</label>
      <select id="inputState" class="form-control">
        <option selected>Choose...</option>
        <option>...</option>
      </select>
    </div>
    <div class="form-group col-md-2">
      <label for="inputZip">Zip</label>
      <input type="text" class="form-control" id="inputZip">
    </div>
  </div>
  <div class="form-group">
    <div class="form-check">
      <input class="form-check-input" type="checkbox" id="gridCheck">
      <label class="form-check-label" for="gridCheck">
        Check me out
      </label>
    </div>
  </div>
  <button type="submit" class="btn btn-primary">Sign in</button>
</form:form>
-------------------------

	<h1 style="text-align: center; color: blue;">WELCOME TO ORDER PAGE</h1>

	<form:form method="post" action="save" modelAttribute="orderType">

		<h2 style="color: green; text-align: left;">
<pre>
  Choose Order Mode  :  <form:radiobutton path="odrMode" value="sale"/>Sale
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
                        
                         <input type="submit" value="Submit">     
</pre>
		

</form:form>
	<h1>${msg }</h1>
	<script type="text/javascript">
		function ValidatePetSelection() {
			var checkboxes = document.getElementsByName("odrAccept");
			var numberOfCheckedItems = 0;
		  	for (var i = 0; i < checkboxes.length; i++) {
				if (checkboxes[i].checked)
					numberOfCheckedItems++;
			}
			if (numberOfCheckedItems > 2) {
				alert("You can't select more than two Options");
				return false;
			}
		}
	</script>


</body>
</html>