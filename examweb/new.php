<?php
include 'connect.php';

$sql="INSERT INTO user_log(name,pass,id,gender) VALUES ('BABU','32','MALE','78787878')";

$result=mysqli_query($conn,$sql);

if($result)
{
    
    die("cannot connect");
}

else{
    
    echo"failed";
}

?>