<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE HTML>
<html lang="en">

<head>
	<title>Pruduct Management System</title>
	<!-- Meta-Tags -->
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta charset="utf-8">
	<meta name="keywords" content="">
<!--	<script>-->
<!--		addEventListener("load", function () {-->
<!--			setTimeout(hideURLbar, 0);-->
<!--		}, false);-->

<!--		function hideURLbar() {-->
<!--			window.scrollTo(0, 1);-->
<!--		}-->
<!--	</script>-->
	<!-- //Meta-Tags -->
	<!-- Stylesheets -->
	<link href="../../css/font-awesome.css" rel="stylesheet">
	<link href="../../css/style.css" rel='stylesheet' type='text/css' />
	<!--// Stylesheets -->
	<!--fonts-->
	<!-- title -->
	<!-- body -->
	<link href="//fonts.googleapis.com/css?family=Poppins:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i&amp;subset=devanagari,latin-ext" rel="stylesheet">
	<!--//fonts-->
</head>

<body>
	<h1>W E L C O M E </h1>
	<div>
		<font size="5" color="white">${errinfo}</font>
	</div>
	<div class="w3ls-login box box--big">
		<!-- form starts here -->
		<form action="/login.do" method="post">
			<div class="agile-field-txt">
				<label>
					<i class="fa fa-user" aria-hidden="true"></i> Username </label>
				<input type="text" name="name" placeholder="Enter your name " required="" value="QC_quality" />
			</div>
			<div class="agile-field-txt">
				<label>
					<i class="fa fa-envelope" aria-hidden="true"></i> password </label>
				<input type="password" name="password" placeholder="Enter your password " required="" id="myInput" value="QC_quality"/>
				<div class="agile_label">
					<input id="check3" name="check3" type="checkbox" value="show password" onclick="myFunction()">
					<label class="check" for="check3">Show password</label>
				</div>
			</div>
			<!-- script for show password -->
<!--			<script>-->
<!--				function myFunction() {-->
<!--					var x = document.getElementById("myInput");-->
<!--					if (x.type === "password") {-->
<!--						x.type = "text";-->
<!--					} else {-->
<!--						x.type = "password";-->
<!--					}-->
<!--				}-->
<!--			</script>-->
			<!-- //script ends here -->
			<div class="w3ls-bot">
				<div class="form-end">
					<input type="submit" value="LOGIN">
				</div>
<!--				<div class="clearfix"></div>-->
			</div>
		</form>
	</div>
	<!-- //form ends here -->
	<!--copyright-->
	<div class="copy-wthree">
		<p>© 2020 liufuyu. All Rights Reserved  |  Only For Firends
		</p>
	</div>
	<!--//copyright-->
</body>

</html>