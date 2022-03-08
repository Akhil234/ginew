<?php
include "connect.php";

$sql="CREATE TABLE order(
orderid int,
order number int,
FOREIGN KEY(id) REFERENCES user_log(id)
)";
 $result=mysqli_query($conn,$sql);

if($result)
{
echo"foreign created";
}
else
{
echo"not created";
}
?>
