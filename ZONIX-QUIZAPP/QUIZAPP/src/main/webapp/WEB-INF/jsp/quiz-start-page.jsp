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

#nav-list li a:hover {
	background-color: #3aafa9;
	color: #17252a;
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
	border: solid #17252a;
	padding: 10px;
	border-radius: 15px 15px 15px;
	width: fit-content;
	margin: auto;
	font-size: 1.2em;
	font-weight: bold;
	margin-bottom: 15px;
}

hr {
	border-top: 1px dashed #17252a;
}

div.intro {
	text-align: left;
}

.card-body a {
	background-color: #17252a;
	color: #feffff;
}

.card-body a:hover {
	background-color: #2b7a78;
}

.panel-footer {
	box-sizing: border-box;
	width: 100%;
	background-color: #2b7a78;
	height: 50px;
	padding: 15px;
	text-align: center;
	font-weight: bold;
	margin-bottom: 1opx;
}

section a {
	color: #17252a;
}

section a:hover, section a:focus {
	text-decoration: none;
	color: #feffff;
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
						<li class="visible-xs"><a
							href="/user/previous-attempts"><span
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
			<name>${username}</name>
		</div>

		<div class="card text-center">
			<div class="card-header">
				Quiz Name:<span>${quizdetails.getQuizname()}</span>
			</div>
			<div class="card-body">
				<h5 class="card-title">
					Quiz id:<span>${quizdetails.getQuizid()}</span>
				</h5>
				<hr>
				<p class="card-text">Rules and Regulations</p>
				<div class="intro">
					Welcome to Zonix Quizapp. Please go through our rules before
					starting the quiz.
					<ul>
						<li>You cannot revert back once the quiz is started.</li>
						<li>You can change your response multiple times before going
							to the next question</li>
						<li>You cannot go to previous question once you have moved to
							the next question.</li>
						<li>Your results will be displayed after you have completed
							the whole quiz.</li>
						<li class="optional">Quiz duration:<span class="time">00:00</span>
						</li>
					</ul>
				</div>
				<a href="/user/${quizdetails.getQuizid()}/${first.getQuestionid()}"
					class="btn btn-primary">Start</a>
			</div>
		</div>
	</div>
	<!--main-content-->

	<div class="push"></div>

	<footer class="panel-footer">
		<div class="container-fluid">
			<section>
				<a href="/user/contact"><span class="glyphicon glyphicon-send"></span>
					Contact Us.</a>
			</section>
		</div>
	</footer>


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
