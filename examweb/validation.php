<?php
include "connect.php";

$name=$_POST['name'];
$password=$_POST['pass'];
if (password_verify($_POST['pass'], $password)) 
{
		session_regenerate_id();
		$_SESSION['loggedin'] = TRUE;
		$_SESSION['name'] = $_POST['name'];
		$_SESSION['id'] = $id;
		echo 'Welcome ' . $_SESSION['name'] . '!';
} 
else 
{
		// Incorrect password
		echo 'Incorrect username and/or password!';
	
}

?>