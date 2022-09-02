<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Quizzapp</title>
<link
	href="https://fonts.googleapis.com/css2?family=Rowdies:wght@700&display=swap"
	rel="stylesheet">
<link
	href="https://fonts.googleapis.com/css2?family=Roboto+Slab&display=swap"
	rel="stylesheet">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" />
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"
	rel="stylesheet" />

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
body {
	background-color: #3aafa9;
	background-image:
		url("data:image/svg+xml,%3Csvg xmlns='http://www.w3.org/2000/svg' width='100%25' height='100%25' viewBox='0 0 1200 800'%3E%3Cdefs%3E%3ClinearGradient id='a' gradientUnits='userSpaceOnUse' x1='600' y1='25' x2='600' y2='777'%3E%3Cstop offset='0' stop-color='%233aafa9'/%3E%3Cstop offset='1' stop-color='%23def2f1'/%3E%3C/linearGradient%3E%3ClinearGradient id='b' gradientUnits='userSpaceOnUse' x1='650' y1='25' x2='650' y2='777'%3E%3Cstop offset='0' stop-color='%2340beb8'/%3E%3Cstop offset='1' stop-color='%23e0f4f3'/%3E%3C/linearGradient%3E%3ClinearGradient id='c' gradientUnits='userSpaceOnUse' x1='700' y1='25' x2='700' y2='777'%3E%3Cstop offset='0' stop-color='%2350c3bd'/%3E%3Cstop offset='1' stop-color='%23e2f6f5'/%3E%3C/linearGradient%3E%3ClinearGradient id='d' gradientUnits='userSpaceOnUse' x1='750' y1='25' x2='750' y2='777'%3E%3Cstop offset='0' stop-color='%2360c8c2'/%3E%3Cstop offset='1' stop-color='%23e4f8f7'/%3E%3C/linearGradient%3E%3ClinearGradient id='e' gradientUnits='userSpaceOnUse' x1='800' y1='25' x2='800' y2='777'%3E%3Cstop offset='0' stop-color='%2370cdc8'/%3E%3Cstop offset='1' stop-color='%23e7faf9'/%3E%3C/linearGradient%3E%3ClinearGradient id='f' gradientUnits='userSpaceOnUse' x1='850' y1='25' x2='850' y2='777'%3E%3Cstop offset='0' stop-color='%2380d2cd'/%3E%3Cstop offset='1' stop-color='%23e9fbfb'/%3E%3C/linearGradient%3E%3ClinearGradient id='g' gradientUnits='userSpaceOnUse' x1='900' y1='25' x2='900' y2='777'%3E%3Cstop offset='0' stop-color='%2390d7d3'/%3E%3Cstop offset='1' stop-color='%23ecfcfc'/%3E%3C/linearGradient%3E%3ClinearGradient id='h' gradientUnits='userSpaceOnUse' x1='950' y1='25' x2='950' y2='777'%3E%3Cstop offset='0' stop-color='%23a0dcd9'/%3E%3Cstop offset='1' stop-color='%23effdfd'/%3E%3C/linearGradient%3E%3ClinearGradient id='i' gradientUnits='userSpaceOnUse' x1='1000' y1='25' x2='1000' y2='777'%3E%3Cstop offset='0' stop-color='%23b0e1df'/%3E%3Cstop offset='1' stop-color='%23f3fefe'/%3E%3C/linearGradient%3E%3ClinearGradient id='j' gradientUnits='userSpaceOnUse' x1='1050' y1='25' x2='1050' y2='777'%3E%3Cstop offset='0' stop-color='%23bfe7e5'/%3E%3Cstop offset='1' stop-color='%23f6fffe'/%3E%3C/linearGradient%3E%3ClinearGradient id='k' gradientUnits='userSpaceOnUse' x1='1100' y1='25' x2='1100' y2='777'%3E%3Cstop offset='0' stop-color='%23cfeceb'/%3E%3Cstop offset='1' stop-color='%23faffff'/%3E%3C/linearGradient%3E%3ClinearGradient id='l' gradientUnits='userSpaceOnUse' x1='1150' y1='25' x2='1150' y2='777'%3E%3Cstop offset='0' stop-color='%23def2f1'/%3E%3Cstop offset='1' stop-color='%23feffff'/%3E%3C/linearGradient%3E%3C/defs%3E%3Cg %3E%3Crect fill='url(%23a)' width='1200' height='800'/%3E%3Crect fill='url(%23b)' x='100' width='1100' height='800'/%3E%3Crect fill='url(%23c)' x='200' width='1000' height='800'/%3E%3Crect fill='url(%23d)' x='300' width='900' height='800'/%3E%3Crect fill='url(%23e)' x='400' width='800' height='800'/%3E%3Crect fill='url(%23f)' x='500' width='700' height='800'/%3E%3Crect fill='url(%23g)' x='600' width='600' height='800'/%3E%3Crect fill='url(%23h)' x='700' width='500' height='800'/%3E%3Crect fill='url(%23i)' x='800' width='400' height='800'/%3E%3Crect fill='url(%23j)' x='900' width='300' height='800'/%3E%3Crect fill='url(%23k)' x='1000' width='200' height='800'/%3E%3Crect fill='url(%23l)' x='1100' width='100' height='800'/%3E%3C/g%3E%3C/svg%3E");
	background-attachment: fixed;
	background-size: cover;
	font-family: 'Roboto Slab', serif;
	font-size: 16px;
	color: solid #17252a;
}

.site-container {
	display: flex;
	flex-direction: column;
	min-height: 100vh;
}

#header-nav {
	background-color: #17252a;
	border-radius: 0;
	border: 0;
}

.navbar-brand {
	padding-top: 10px;
}

.navbar-brand h1 {
	color: #3aafa9;;
	text-transform: uppercase;
	margin-top: 0;
	margin-bottom: 0;
	line-height: .75;
	font-family: 'Rowdies', cursive;
	text-shadow: 1px 1px 1px #feffff;
}

#dropdownMenu {
	margin-top: 10px;
}

#dropdownMenu span {
	font-family: 'Roboto Slab', serif;
	color: #feffff;
	font-size: 1.2em;
}

.dropdown-menu {
	background-color: #3aafa9;
	font-family: 'Roboto Slab', serif;
	color: #17252a;
}

.dropdown-menu li a:hover {
	background: #2b7a78;
	color: #feffff;
}

.navbar-header button.navbar-toggle, .navbar-header .icon-bar {
	border: 1px solid #feffff;
}

#nav-list li {
	text-align: center;
	color: #feffff;
	font-family: 'Roboto Slab', serif;
	font-size: 1.2em;
}

#nav-list li a {
	color: #feffff;
}

#main-content {
	flex: 1;
}

#xs-welcome {
	font-size: 1.5em;
	font-weight: bold;
	text-shadow: 1px 1px 1px #feffff;
}

.card {
	box-sizing: border-box;
	padding: 10px;
	margin-bottom: 20px;
	border-radius: 15px;
	box-shadow: 2px 2px 1px #2b7a78;
	border: solid #17252a;
	font-weight: bold;
}

.card-header {
	font-size: 1.5em;
}

hr {
	border-top: 1px dashed #17252a;
}

.card-body a {
	color: #17252a;
	font-size: 1.5em;
	padding: 10px;
}

.card-body a:hover, .card-body a:hover {
	text-decoration: none;
}

.lgot {
	font-family: 'Roboto Slab', serif;
	position: relative;
	left: 60px;
	background: transparent;
	border-style: none;
	color: #17252a;
	font-size: 1.1em;
}

.lgot:hover {
	font-family: 'Roboto Slab', serif;
	position: relative;
	left: 60px;
	background: #2b7a78;
	color: #feffff;
	background: #2b7a78;
}

.lgotcl {
	font-family: 'Roboto Slab', serif;
	background: transparent;
	color: #feffff;
	border-style: none;
	font-size: 1.1em;
}

.lgotcl:hover {
	font-family: 'Roboto Slab', serif;
	background-color: #3aafa9;
	color: #17252a;
}
</style>

</head>

<body class="site-container">
	<header>
		<nav id="header-nav" class="navbar navbar-default">
			<div class="container-fluid">
				<div class="navbar-header">
					<div class="navbar-brand">
						<h1>ZONIX QUIZAPP</h1>
					</div>
					<button type="button" class="navbar-toggle " data-toggle="collapse"
						data-target="#collapsable-nav" aria-expanded="false">
						<span class="sr-only">Toggle navigation</span> <span
							class="icon-bar"></span> <span class="icon-bar"></span> <span
							class="icon-bar"></span>
					</button>
				</div>
				<!-- navbar-header -->

				<div class="dropdown pull-right hidden-xs">
					<div id="dropdownMenu" class="dropdown-toggle"
						data-toggle="dropdown" role="button" aria-haspopup="true"
						aria-expanded="false">
						<span class="name"> ${username}</span> <span class="caret"></span>
					</div>
					<ul class="dropdown-menu">
						<li class="active="><a href="/user/index"><span
								class="glyphicon glyphicon-home"></span>Dashboard</a></li>
						<li role="separator" class="divider"></li>
						<li><a href="/user/previous-attempts"><span
								class="glyphicon glyphicon-stats"></span>View Previous attempts</a></li>
						<li role="separator" class="divider"></li>
						<li><form action="/logout" method="post">
								<button type="submit" class="btn btn-danger lgot">
									<span class="glyphicon glyphicon-log-out"></span> Logout
								</button>
							</form></li>
					</ul>
				</div>

				<div id="collapsable-nav" class="collapse navbar-collapse">
					<ul id="nav-list" class="nav navbar-nav navbar-right">
						<li class="visible-xs"><a href="/user/index"><span
								class="glyphicon glyphicon-home"></span> Dashboard</a></li>
						<li class="visible-xs"><a href="/user/previous-attempts"><span
								class="glyphicon glyphicon-stats"></span>View Previous attempts</a></li>
						<li class="visible-xs"><form action="/logout" method="post">
								<button type="submit" class="btn btn-danger lgotcl">
									<span class="glyphicon glyphicon-log-out"></span> Logout
								</button>
							</form></li>

					</ul>
				</div>
				<!--collapsable-nav-->


			</div>
			<!--container-->
		</nav>
	</header>

	<div id="main-content" class="container">
		<div id="xs-welcome" class="text-center visible-xs">
			Welcome,<br>
			<name>${username}</name>
		</div>

		<div id="home-tiles" class="row">
			<div class="col-md-4 col-sm-6 col-xs-12">
				<div class="card">
					<div class="card-header">Anik Chatterjee </div>
					<div class="card-header">(Frontend Developer) </div>
					<div class="card-body">
						<hr>
						<p class="card-text">
							<span class="glyphicon glyphicon-education"></span> B.tech in
							Computer Science & Engineering<br>(2018-2022)<br>M.A.K.A.U.T
						</p>
						<a href="https://github.com/starboi2000"><span class="fa fa-github"></span> </a> <a href=" https://twitter.com/Anikcha66632890?s=09"><span
							class="fa fa-twitter"></span> </a> <a href="https://www.linkedin.com/in/anik-chatterjee-257a82182"><span
							class="fa fa-linkedin"></span> </a> <a href="https://www.facebook.com/anik.chatterjee.146"><span
							class="fa fa-facebook"></span> </a> <a href="http://instagram.com/anik222_"><span
							class="fa fa-instagram"></span> </a>
					</div>
				</div>
			</div>
			<div class="col-md-4 col-sm-6 col-xs-12">
				<div class="card">
					<div class="card-header">Chandrachur Chatterjee </div>
					<div class="card-header">(Frontend Developer) </div>
					<div class="card-body">
						<hr>
						<p class="card-text">
							<span class="glyphicon glyphicon-education"></span> B.tech in
							Computer Science & Engineering<br>(2018-2022)<br>M.A.K.A.U.T
						</p>
						<a href="https://github.com/chandrachur-chatterjee"><span class="fa fa-github"></span> </a> <a href="https://twitter.com/Chan_Jee_7"><span
							class="fa fa-twitter"></span> </a> <a href="https://www.linkedin.com/in/chandrachur-chatterjee-83145b166/"><span
							class="fa fa-linkedin"></span> </a> <a href="https://www.facebook.com/chandrachur.bhattacharya.5"><span
							class="fa fa-facebook"></span> </a> <a href="https://instagram.com/the_ambivert.me?igshid=1unlobt1pzl5n"><span
							class="fa fa-instagram"></span> </a>
					</div>
				</div>
			</div>
			<div class="col-md-4 col-sm-6 col-xs-12">
				<div class="card">
					<div class="card-header">Anik Chakraborty</div>
					<div class="card-header">(Backend Developer)</div>
					<div class="card-body">
						<hr>
						<p class="card-text">
							<span class="glyphicon glyphicon-education"></span> B.tech in
							Computer Science & Engineering<br>(2016-2020)<br>M.A.K.A.U.T
						</p>
						<a href="https://github.com/anik2131"><span class="fa fa-github"></span> </a> <a href="#"><span
							class="fa fa-twitter"></span> </a> <a href="https://www.linkedin.com/in/anik-chakraborty-5373b2193/"><span
							class="fa fa-linkedin"></span> </a> <a href="https://www.facebook.com/anik.chakraborty.733"><span
							class="fa fa-facebook"></span> </a> <a href="https://www.instagram.com/kgzanik2131/"><span
							class="fa fa-instagram"></span> </a>

					</div>
				</div>
			</div>



		</div>
		<!--home-tiles-->
	</div>
	<!--main-content-->




</body>

</html>
