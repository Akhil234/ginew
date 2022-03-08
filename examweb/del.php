<?php
include 'connect.php';

$sql3="DELETE FROM user_log  WHERE id=12 ";
$result=mysqli_query($conn,$sql3);

if($result)
{
echo"one row del";
}
else
{
echo"nothing happend";
}
?>