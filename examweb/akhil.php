<?php
 include 'connect.php';

$sql="INSERT INTO user_log (name,pass) VALUES('AKHIL','123');";
$sql.="INSERT INTO user_log (name,pass) VALUES('SAM','123');";
$sql.="INSERT INTO user_log (name,pass) VALUES('ROCKY','123');";
if(mysqli_multi_query($conn,$sql))
{
echo " one row inserted successfully";
}
else
{
echo"failed";
}



?>