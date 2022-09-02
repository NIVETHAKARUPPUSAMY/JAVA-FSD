<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" />
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style type="text/css">
body {
	margin: 0;
	padding: 0;
	font-family: sans-serif;
	background-color: #dab2ff;
	background-image:
		url("data:image/svg+xml,%3Csvg xmlns='http://www.w3.org/2000/svg' width='100%25' height='100%25' viewBox='0 0 1600 800'%3E%3Cg %3E%3Cpath fill='%23c2a9ff' d='M486 705.8c-109.3-21.8-223.4-32.2-335.3-19.4C99.5 692.1 49 703 0 719.8V800h843.8c-115.9-33.2-230.8-68.1-347.6-92.2C492.8 707.1 489.4 706.5 486 705.8z'/%3E%3Cpath fill='%23a99fff' d='M1600 0H0v719.8c49-16.8 99.5-27.8 150.7-33.5c111.9-12.7 226-2.4 335.3 19.4c3.4 0.7 6.8 1.4 10.2 2c116.8 24 231.7 59 347.6 92.2H1600V0z'/%3E%3Cpath fill='%238d96ff' d='M478.4 581c3.2 0.8 6.4 1.7 9.5 2.5c196.2 52.5 388.7 133.5 593.5 176.6c174.2 36.6 349.5 29.2 518.6-10.2V0H0v574.9c52.3-17.6 106.5-27.7 161.1-30.9C268.4 537.4 375.7 554.2 478.4 581z'/%3E%3Cpath fill='%236d8eff' d='M0 0v429.4c55.6-18.4 113.5-27.3 171.4-27.7c102.8-0.8 203.2 22.7 299.3 54.5c3 1 5.9 2 8.9 3c183.6 62 365.7 146.1 562.4 192.1c186.7 43.7 376.3 34.4 557.9-12.6V0H0z'/%3E%3Cpath fill='%233f85ff' d='M181.8 259.4c98.2 6 191.9 35.2 281.3 72.1c2.8 1.1 5.5 2.3 8.3 3.4c171 71.6 342.7 158.5 531.3 207.7c198.8 51.8 403.4 40.8 597.3-14.8V0H0v283.2C59 263.6 120.6 255.7 181.8 259.4z'/%3E%3Cpath fill='%235277ff' d='M1600 0H0v136.3c62.3-20.9 127.7-27.5 192.2-19.2c93.6 12.1 180.5 47.7 263.3 89.6c2.6 1.3 5.1 2.6 7.7 3.9c158.4 81.1 319.7 170.9 500.3 223.2c210.5 61 430.8 49 636.6-16.6V0z'/%3E%3Cpath fill='%236067ff' d='M454.9 86.3C600.7 177 751.6 269.3 924.1 325c208.6 67.4 431.3 60.8 637.9-5.3c12.8-4.1 25.4-8.4 38.1-12.9V0H288.1c56 21.3 108.7 50.6 159.7 82C450.2 83.4 452.5 84.9 454.9 86.3z'/%3E%3Cpath fill='%236a56ff' d='M1600 0H498c118.1 85.8 243.5 164.5 386.8 216.2c191.8 69.2 400 74.7 595 21.1c40.8-11.2 81.1-25.2 120.3-41.7V0z'/%3E%3Cpath fill='%237242ff' d='M1397.5 154.8c47.2-10.6 93.6-25.3 138.6-43.8c21.7-8.9 43-18.8 63.9-29.5V0H643.4c62.9 41.7 129.7 78.2 202.1 107.4C1020.4 178.1 1214.2 196.1 1397.5 154.8z'/%3E%3Cpath fill='%237926ff' d='M1315.3 72.4c75.3-12.6 148.9-37.1 216.8-72.4h-723C966.8 71 1144.7 101 1315.3 72.4z'/%3E%3C/g%3E%3C/svg%3E");
	background-attachment: fixed;
	background-size: cover;
}

h1 {
	color: white;
	border-bottom: 3px solid black;
}

h3 {
	color: white;
}

h3:first-letter {
	color: #99FFFF;
	font-weight: bold;
	font-size: 35px;
}

.form-group {
	position: relative;
	margin-top: 20px;
}

.form-control {
	width: 100%;
	border: 0;
	border-bottom: 2px solid white;
	outline: 0;
	font-size: 1.3rem;
	background: transparent;
	color: white;
}

.form-control::placeholder {
	color: transparent;
}

.form-control:placeholder-shown ~.form-label {
	font-size: 1.3rem;
	cursor: text;
	top: 10px;
}

.form-label {
	position: absolute;
	color: black;
	font-size: 0.8rem;
	top: 0;
	display: block;
	transition: 0.2s;
}

.form-control:focus ~.form-label {
	position: absolute;
	top: 0;
	display: block;
	font-size: 0.8rem;
	color: black;
	transition: 0.2s;
}

#qid {
	width: 100%;
	color: black;
}

.log-out {
	margin-top: 10px;
	margin-right: 10px;
}
</style>



</head>
<body>
	<nav class="navbar navbar-default">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="/admin/quiz-control">ZONIX
					QUIZ-APP</a>
			</div>
			<ul class="nav navbar-nav">
				<li><a href="/admin/quiz-control/${quizid}/question-control">GO
						TO QUESTION CONTROL</a></li>

			</ul>

			<form class="form-inline navbar-right" action="/logout-admin"
				method="post">
				<button class="btn btn-warning log-out" type="submit">LOG
					OUT</button>
			</form>
		</div>
	</nav>
	<div class="container">
		<h1>
			QUIZ ADD FOR QUIZ-ID: <b>${quizid}</b>
		</h1>

		<form action="/admin/${quizid}/add-question/success" method="post">
			<fieldset class="form-group">
				<input type="text" name="quizid" value="${quizid}"
					disabled="disabled" class="form-control" id="qid" />
			</fieldset>

			<fieldset class="form-group">
				<input type="text" name="questionid" class="form-control" id="queid"
					placeholder="ENTER QUESTION-ID" required="required" /> <label
					for="queid" class="form-label">ENTER QUESTION ID</label>
			</fieldset>

			<fieldset class="form-group">
				<input type="text" name="questiondetails"
					placeholder="ENTER QUESTION-DETAILS" class="form-control"
					id="qdata" required="required" /> <label for="qdata"
					class="form-label">ENTER QUESTION-DETAILS</label>
			</fieldset>

			<h3>ADD OPTIONS TOO</h3>
			<fieldset class="form-group">
				<input type="text" name="option1" id="opt1"
					placeholder="ENTER OPTION-1" class="form-control"
					required="required" /> <label for="opt1" class="form-label">ENTER
					OPTION-1</label>
			</fieldset>

			<fieldset class="form-group">
				<input type="text" name="option2" id="opt2"
					placeholder="ENTER OPTION-2" class="form-control"
					required="required" /> <label for="opt2" class="form-label">ENTER
					OPTION-2</label>
			</fieldset>

			<fieldset class="form-group">
				<input type="text" name="option3" id="opt3"
					placeholder="ENTER OPTION-3" class="form-control"
					required="required" /> <label for="opt3" class="form-label">ENTER
					OPTION-3</label>
			</fieldset>

			<fieldset class="form-group">
				<input type="text" name="option4" id="opt4"
					placeholder="ENTER OPTION-4" class="form-control"
					required="required" /> <label for="opt4" class="form-label">ENTER
					OPTION-4</label>
			</fieldset>

			<h3>ALMOST THERE</h3>
			<fieldset class="form-group">
				<input type="text" name="correctans" id="opt4"
					placeholder="ENTER CORRECT ANSWER" class="form-control"
					id="corrans" aria-describedby="note" required="required" /> <label
					for="corrans" class="form-label">ENTER CORRECT ANSWER</label> <small
					id="note" class="form-text text-muted">SHOULD BE EXACT FROM
					ANY OF THE ABOVE 4 OPTIONS</small>
			</fieldset>

			<p style="color: red">${error}</p>
			<input type="submit" id="sub" class="btn btn-success" value="ADD" />
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