<html>
<head>
	<title>Registration</title>
	<?php include 'js.php'; include 'style.php'; ?>
	<link rel="stylesheet" type="text/css" href="css/reg-style.css">
	<link rel="stylesheet" type="text/css" href="css/login.css">
</head>
<body>
	<div class="container">
		<h1 class="well">Registration Form</h1>
		<form method="post" action="forms/signup.php" role="form">
			<div class="col-lg-12 well">
				<div class="row">
					<form>
						<div class="col-sm-12">
							<?php 
							$conn=mysqli_connect("localhost","root","","hospital");
							$query = "SELECT id FROM users ORDER BY id DESC LIMIT 1";
							$result=mysqli_query($conn,$query);
							foreach ($result as $key) {
								$num=$key['id'];
							}
							?>
							<div class="form-group">
								<label>ID</label>
								<input type="text" name="idd" id="id" placeholder=<?php echo $num+1;?> value=<?php echo $num+1;?>  class="form-control"  readonly>
							</div>
							<div class="row">
								<div class="col-sm-6 form-group">
									<label>First Name</label>
									<input type="text" placeholder="Enter First Name Here.." class="form-control" name="first" id="first" required>
								</div>
								<div class="col-sm-6 form-group">
									<label>Last Name</label>
									<input type="text" placeholder="Enter Last Name Here.." class="form-control" name="last" id="last" required>
								</div>
							</div>					
							<div class="form-group">
								<label>Address</label>
								<textarea placeholder="Enter Address Here.." rows="3" class="form-control" name="address" id="address" required></textarea>
							</div>	
							<div class="row">
								<div class="col-sm-6 form-group">
									<label>City</label>
									<input type="text" placeholder="Enter City Name Here.." class="form-control" name="city" id="city" required>
								</div>	
								<div class="col-sm-6 form-group">
									<label>Gender</label><br>
									<select name="gender" required class="form-control" id="gender" required>
										<option value="">-------</option>
										<option value="male">Male</option>
										<option value="Female">Female</option>
									</select>
								</div>		
							</div>
							<div class="row">
								<div class="col-sm-6 form-group">
									<label>Birth Date</label>
									<input type="Date" placeholder="Enter Birth Date Here.." class="form-control" name="birthday" id="birthday" required>
								</div>		
								<div class="col-sm-6 form-group">
									<label>Identification Number</label>
									<input type="text" placeholder="Enter Identification Number Here.." class="form-control" name="identification" id="identification" required>
								</div>	
							</div>						
							<div class="form-group">
								<label>Phone Number</label>
								<input type="text" placeholder="Enter Phone Number Here.." class="form-control" name="phone" id="phone" required>
							</div>		
							<div class="form-group">
								<label>Email Address</label>
								<input type="email" placeholder="Enter Email Address Here.." class="form-control" name="email" id="email" required>
							</div>
							<div class="form-group">
								<label>Password</label>
								<input type="password" placeholder="Enter Password Here.." class="form-control" name="password" id="password" required>
							</div>	
							<button type="Submit" class="btn btn-lg btn-info" id="signup_btn">Submit</button>					
						</div>
					</form> 
				</div>
			</div>
		</form>
	</div>
</body>
</html>