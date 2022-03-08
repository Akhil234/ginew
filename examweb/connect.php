<?php
$ser="localhost";
$user="root";
$password="";
$dbname="akhil234";
$conn=mysqli_connect($ser,$user,$password,$dbname);
if(!$conn)
{
echo"connection failed";
}
else
{
echo"connection success";
}
?>