<?php
include 'connect.php';

$sql3="UPDATE user_log SET name='sam'  WHERE id=12 ";
$result=mysqli_query($conn,$sql3);

if($result)
{
echo"one row updated";
}
else
{
echo"nothing happend";
}
?>