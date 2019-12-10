<?php
	$link = mysqli_connect('localhost', 'id8732496_admin', 'Alex2001', 'id8732496_gb');
	
	if (mysqli_connect_errno()) {
		echo 'Bad request: ' . mysqli_connect_error();
		exit();
	}
	
	$query = "SELECT * FROM users";
	
	$result = mysqli_query($link, $query);
	
	$users = mysqli_fetch_all($result, MYSQLI_ASSOC);
	
	if (!empty($_POST)) {
		foreach ($users as $user) {
			if ($user['user_login'] == $_POST['user'] && $user['user_password'] == $_POST['password']) {
				echo "<strong style='margin: auto'><h2> Вы в системе. </h2></strong><br>";
				echo "<strong style='margin: auto'><h2> Приветствуем вас!!! </h2></strong><br>";
				echo "<strong style='margin: auto'><h1><a href='index.html'> На главную</a></h1></strong>";		
				exit();
			}
		}
		echo "<strong> Access denied </strong>";
	}
?>