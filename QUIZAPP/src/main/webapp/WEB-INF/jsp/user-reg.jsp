<!DOCTYPE html>
<html lang="en" dir="ltr">
<head>
<meta charset="utf-8">
<title></title>
<style type="text/css">
@import "https://use.fontawesome.com/releases/v5.5.0/css/all.css";

body {
	margin: 0;
	padding: 0;
	font-family: sans-serif;
	background-image:
		url("https://i.pinimg.com/originals/33/f3/bd/33f3bda341b51f505bb54f10b5e83b2f.jpg");
	background-size: cover;
}

.login-box {
	width: 280px;
	position: absolute;
	top: 50%;
	left: 50%;
	transform: translate(-50%, -50%);
	color: white;
}

.login-box h1 {
	float: left;
	font-size: 30px;
	border-bottom: 6px solid #0066FF;
	margin-bottom: 50px;
	padding: 13px 0;
}

.textbox {
	width: 100%;
	overflow: hidden;
	font-size: 20px;
	padding: 8px 0;
	margin: 8px 0;
	border-bottom: 1px solid #0066FF;
}

.textbox i {
	width: 26px;
	float: left;
	text-align: center;
}

.textbox input {
	border: none;
	outline: none;
	background: none;
	color: white;
	font-size: 18px;
	width: 80%;
	float: left;
	margin: 0 10px;
}

.btn {
	width: 100%;
	background: none;
	border: 2px solid #0066FF;
	color: white;
	padding: 5px;
	font-size: 18px;
	cursor: pointer;
	margin: 12px 0;
}

a:visited {
	color: red;
	font-weight: bold;
}

a:hover {
	color: yellow;
}
</style>
</head>
<body>
	<div class="login-box">
		<h1>Create Account (Users only)</h1>
		<form action="/registration-success" method="post">
			<div class="textbox">
				<i class="fas fa-id-card"></i> <input type="text" name="userid"
					placeholder="UserId" required="required">
			</div>

			<div class="textbox">
				<i class="fas fa-user"></i> <input type="text" name="username"
					placeholder="Username" required="required">
			</div>

			<div class="textbox">
				<i class="fa fa-envelope"></i> <input type="text" name="useremail"
					placeholder="User Email ID" required="required">
			</div>

			<div class="textbox">
				<i class="fas fa-phone"></i> <input type="number" name="userphone"
					placeholder="User Phone Number" required="required">
			</div>

			<div class="textbox">
				<i class="fas fa-lock"></i> <input type="password" name="pass"
					placeholder="Password" required="required">
			</div>

			<div class="textbox">
				<i class="fas fa-lock"></i> <input type="password" name="repass"
					placeholder="Re-Enter Password" required="required">
			</div>
			<p>
				<b>${error}</b>
			</p>
			<a href="/login" style="color: orange">Already a User? SIGN
				IN</a><br> <input type="submit" class="btn" value="Create Account">
		</form>
	</div>

	<script type="text/javascript">
		function preventBack() {
			window.history.forward();
		}
		setTimeout("preventBack()", 0);
		window.onload = function() {
			null
		};
	</script>
</body>
</html>