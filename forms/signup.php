<?php
	
	$id=$_POST['idd'];
	$first=$_POST['first'];
	$last=$_POST['last'];
	$address=$_POST['address'];
	$city=$_POST['city'];
	$gender=$_POST['gender'];
	$birthday=$_POST['birthday'];
	$identification=$_POST['identification'];
	$phone=$_POST['phone'];
	$email=$_POST['email'];
	$password=$_POST['password'];
	$name=$first." ".$last;



	
	$conn=mysqli_connect("localhost","root","0000","hospital");
	$query = "INSERT INTO users VALUES ('".$id."','".$first."','".$last."','".$address."','".$city."','".$gender."','".$birthday."','".$identification."','".$phone."','".$email."','".$password."')";
	mysqli_query($conn,$query);
	header("location:../index.php");
		
?>