<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">

<title>user and admin</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<style type="text/css">
body {
	margin: 0;
	padding: 0;
	background:
		url("https://i.pinimg.com/originals/33/f3/bd/33f3bda341b51f505bb54f10b5e83b2f.jpg");
	background-size: cover;
}

.container {
	margin-top: 10%;
	margin-left: 17%;
}

.card:hover {
	-webkit-box-shadow: -1px 9px 40px -12px rgba(0, 0, 0, 0.75);
	-moz-box-shadow: -1px 9px 40px -12px rgba(0, 0, 0, 0.75);
	box-shadow: -1px 9px 40px -12px rgba(0, 0, 0, 0.75);
}

em {
	color: white;
	border-bottom: 3px;
}
</style>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>
<body>


	<h5>
		<em>${logout}</em>
	</h5>
	<div class="container">
		<div class="row">
			<div class="col-4-lg ml-5">
				<div class="card" style="width: 18rem;">
					<div class="card-body">
						<img
							src="https://www.clipartkey.com/mpngs/m/237-2374286_administrator-network-icons-system-avatar-computer-admin-icon.png"
							alt="" class="img-fluid rounded-circle w-50 mb-3">





						<h5 class="card-title">Admin</h5>
						<p class="card-text">if you are a admin and you know it hit
							the box below</p>
						<a href="/login" class="btn btn-primary">click here</a>
					</div>
				</div>
			</div>
			<div class="col-4-lg ml-5">
				<div class="card" style="width: 18rem;">
					<div class="card-body">
						<img
							src="https://upload.wikimedia.org/wikipedia/commons/thumb/1/12/User_icon_2.svg/768px-User_icon_2.svg.png"
							alt="" class="img-fluid rounded-circle w-50 mb-3">





						<h5 class="card-title">User</h5>
						<p class="card-text">only if you are a sexy user hit the box
							below</p>
						<a href="/login" class="btn btn-primary">Click here</a>


					</div>
				</div>

			</div>
		</div>
	</div>

	<script>
		$(document).ready(function() {
			$('.col-4-lg').hover(function() {
				$(this).animate({
					marginTop : "-=1%"
				}, 200);
			}, function() {
				$(this).animate({
					marginTop : "0%"
				}, 200);
			});
		});
	</script>

	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>


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