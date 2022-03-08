<?php
include "connect.php";

$name=$_POST["name"];
$password=$_POST["pass"];
$studentid=$_POST["id"];
$gender=$_POST["gender"];

$sql="INSERT INTO user_log (name,pass,id,gender) VALUES('$name','$password','$studentid','$gender')";
$result=mysqli_query($conn,$sql);
if($result)
{
echo"inserted";
}
$sql2="SELECT * FROM user_log WHERE id=7";

$result=mysqli_query($conn,$sql2);

echo"<table border='1'>
<tr>

<th>name</th>

<th>id</th>

<th>password</th>

<th>gender</th>

</tr>";

while($row=mysqli_fetch_array($result))
{
echo"<tr>";
echo"<td>". $row[0]."</td>";
echo"<td>". $row[1]."</td>";
echo"<td>" .$row[2]."</td>";
echo"<td>". $row[3]."</td>";
echo"</tr>";
}

echo"</table>";








?>