
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html lang="en">

<head>


<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Uom Type Form Page</title>
<%@include file="usermenu.jsp"%>
<!-- CSS -->
<link rel="stylesheet"
	href="http://fonts.googleapis.com/css?family=Roboto:400,100,300,500">
<link rel="stylesheet" href="../resources/assets/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet"
	href="../resources/assets/font-awesome/css/font-awesome.min.css">
<link rel="stylesheet" href="../resources/assets/css/form-elements.css">
<link rel="stylesheet" href="../resources/assets/css/style.css">

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
            <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
            <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->

<!-- Favicon and touch icons -->
<link rel="shortcut icon" href="../resources/assets/ico/favicon.png">
<link rel="apple-touch-icon-precomposed" sizes="144x144"
	href="../resources/assets/ico/apple-touch-icon-144-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="114x114"
	href="../resources/assets/ico/apple-touch-icon-114-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="72x72"
	href="../resources/assets/ico/apple-touch-icon-72-precomposed.png">
<link rel="apple-touch-icon-precomposed"
	href="../resources/assets/ico/apple-touch-icon-57-precomposed.png">

</head>

<body>

	<!-- Top menu -->
	<nav class="navbar navbar-inverse navbar-no-bg" role="navigation">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#top-navbar-1">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				
			</div>
			<!-- Collect the nav links, forms, and other content for toggling -->
			<div class="collapse navbar-collapse" id="top-navbar-1">
				<ul class="nav navbar-nav navbar-right">
					<li><span class="li-text"> Put some text or </span> <a
						href="#"><strong>links</strong></a> <span class="li-text">
							here, or some icons: </span> <span class="li-social"> <a href="https://facebook.com"><i
								class="fa fa-facebook"></i></a> <a href="https://twitter.com"><i
								class="fa fa-twitter"></i></a> <a href="https://gmail.com"><i
								class="fa fa-envelope"></i></a> <a href=""><i
								class="fa fa-skype"></i></a>
					</span></li>
				</ul>
			</div>
		</div>
	</nav>

	<!-- Top content -->
	<div class="top-content">

		<div class="inner-bg">
			<div class="container">
				<div class="row">
					<div class="col-sm-7 text">
						<h1>
							<strong>Uom Type</strong> Registration Form
						</h1>
						<div class="description">
							<p>
								This is a free responsive registration form made with Bootstrap.
								Download it on <a href="http://azmind.com"><strong>AZMIND</strong></a>,
								customize and use it as you like!
							</p>
						</div>
						<div class="top-big-link">
							<a class="btn btn-link-1" href="#">Button 1</a> <a
								class="btn btn-link-2" href="#">Button 2</a>
						</div>
					</div>

	
					
					<div class="col-sm-5 form-box">
						<div class="form-top">
							<div class="form-top-left">
								<h3>Uom Type Registration</h3>
								<p>Fill in the form below to get instant access:</p>
							</div>
							<div class="form-top-right">
								<i class="fa fa-pencil"></i>
							</div>
						</div>
						<div class="form-bottom">
							<form:form action="save" method="post" modelAttribute="uomType"
								cssClass="registration-form">

								<div class="form-group">
									<label for="uomType">Select Uom Type</label>
									<form:select path="uomType" cssClass="form-control">
										<form:option value="">--Select--</form:option>
										<form:option value="Packing">Packing</form:option>
										<form:option value="No Packing">No Packing</form:option>
										<form:option value="NA">-NA-</form:option>
									</form:select>
								</div>
								<div class="form-group">
									<label for="uomModel">Enter Uom Model</label> 
									<form:input path="uomModel" cssClass="form-control"/> 
								
								</div>
								<div class="form-group">
									<label for="uomDesc">Enter Uom Desc</label> 
								    <form:input path="uomDesc" cssClass="form-control"  />
								</div>
								
								<button type="submit" class="btn">Create Uom!</button>
							</form:form>
							${msg}
						</div>
					</div>
				</div>
			</div>
		</div>

	</div>


	<!-- Javascript -->
	<script src="../resources/assets/js/jquery-1.11.1.min.js"></script>
	<script src="../resources/assets/bootstrap/js/bootstrap.min.js"></script>
	<script src="../resources/assets/js/jquery.backstretch.min.js"></script>
	<script src="../resources/assets/js/retina-1.1.0.min.js"></script>
	<script src="../resources/assets/js/scripts.js"></script>

	<!--[if lt IE 10]>
            <script src="assets/js/placeholder.js"></script>
        <![endif]-->

</body>

</html>