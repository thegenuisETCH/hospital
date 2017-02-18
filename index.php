<html>
<head>
	<title>Doctor Website Template | Home </title>
	<?php include 'js.php'; include 'style.php'; include 'js-index.php' ?>
</head>
<body>
<div id="home" class="header">
		<div class="top-header">
			<div class="container">
				<div class="logo">
					<a href="#"><img src="images/logo.png" title="doctor" /></a>
				</div>
				<nav class="top-nav">
					<ul class="top-nav">
						<li class="active"><a href="#home" class="scroll">Home </a></li>
						<li><a href="#about" class="scroll">About us</a></li>
						<li><a href="#services" class="scroll">our services</a></li>
						<li><a href="#team" class="scroll">our team</a></li>
						<li><a href="#contact" class="scroll">Contact</a></li>
					</ul>
					<a href="#" id="pull"><img src="images/menu-icon.png" title="menu" /></a>
				</nav>
				<div class="clearfix"> </div>
			</div>
		</div>
	</div>
	<script>
		$(function () {
			$("#slider4").responsiveSlides({
				auto: true,
				pager: true,
				nav: true,
				speed: 500,
				namespace: "callbacks",
				before: function () {
					$('.events').append("<li>before event fired.</li>");
				},
				after: function () {
					$('.events').append("<li>after event fired.</li>");
				}
			});

		});
	</script>
	<div  id="top" class="callbacks_container">
		<ul class="rslides" id="slider4">
			<li>
				<img src="images/slide1.jpg" alt="">
				<div class="caption">
					<div class="slide-text-info">
						<h1>providing</h1>
						<label>highquality service for men & women</label>
						<a class="slide-btn" href="#">learn more</a>
					</div>
				</div>
			</li>
			<li>
				<img src="images/slide1.jpg" alt="">
				<div class="caption">
					<div class="slide-text-info">
						<h1>providing</h1>
						<label>highquality service for men & women</label>
						<a class="slide-btn" href="#">learn more</a>
					</div>
				</div>
			</li>
			<li>
				<img src="images/slide1.jpg" alt="">
				<div class="caption">
					<div class="slide-text-info">
						<h1>providing</h1>
						<label>highquality service for men & women</label>
						<a class="slide-btn" href="#">learn more</a>
					</div>
				</div>
			</li>
		</ul>
	</div>
	<div class="clearfix"> </div>
	<div id="about" class="about">
		<div class="container">
			<div class="header about-header text-center">
				<h2>about us</h2>
				<p>Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled</p>
			</div>
			<div class="about-grids">
				<div class="col-md-4">
					<div class="about-grid">
						<img src="images/img1.jpg" title="name" />
						<span class="t-icon1"> </span>
						<div class="about-grid-info text-center">
							<h3><a href="#">Children's specialist</a></h3>
							<p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer.</p>
						</div>
					</div>
				</div>
				<div class="col-md-4">
					<div class="about-grid n-about-grid n-about-grid1">
						<img src="images/img2.jpg" title="name" />
						<span class="t-icon1"> </span>
						<div class="about-grid-info text-center">
							<h3><a href="#">Women's specialist</a></h3>
							<p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer.</p>
						</div>
					</div>
				</div>
				<div class="col-md-4">
					<div class="about-grid n-about-grid n-about-grid2">
						<img src="images/img3.jpg" title="name" />
						<span class="t-icon2"> </span>
						<div class="about-grid-info text-center">
							<h3><a href="#">men's specialist</a></h3>
							<p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer.</p>
						</div>
					</div>
				</div>
				<div class="clearfix"> </div>
			</div>

		</div>

	</div>
	<div id="services" class="services">
		<div class="container">
			<div class="header services-header text-center">
				<h2>our services</h2>
				<p>Lorem Ipsum has been the industry's standard dummy text ever since the 1500s</p>
			</div>
			<div class="service-grids">
				<div class="col-md-3">
					<div class="service-grid text-center">
						<a href="#"><span class="s1-icon"> </span></a>
						<h3><a href="#">Heart problem</a></h3>
					</div>
				</div>
				<div class="col-md-3">
					<div class="service-grid text-center">
						<a href="#"><span class="s2-icon"> </span></a>
						<h3><a href="#">brain problem</a></h3>
					</div>
				</div>
				<div class="col-md-3">
					<div class="service-grid text-center">
						<a href="#"><span class="s3-icon"> </span></a>
						<h3><a href="#">knee problem</a></h3>
					</div>
				</div>
				<div class="col-md-3">
					<div class="service-grid text-center">
						<a href="#"><span class="s4-icon"> </span></a>
						<h3><a href="#">human bones problem</a></h3>
					</div>
				</div>
				<div class="clearfix"> </div>
			</div>

		</div>

	</div>
	<div id="team" class="team">
		<div class="container">
			<div class="header team-head text-center">
				<h2>our team</h2>
				<p>Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled</p>
			</div>
			<div class="team-member-grids">
				<div class="team-member-grid">
					<img src="images/t1.jpg" title="name" />
					<div class="team-member-info bottom-t-info">
						<span> </span>
						<h3><a href="#">Dr. Keith M. Weiner, M.D.</a></h3>
						<p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. when an unknown printer took a galley of type Lorem Ipsum is simply dummy text.is simply dummy text..is simply dummy text.</p>
					</div>
				</div>
				<div class="team-member-grid">
					<div class="team-member-info bottom-t-info bottom-t-info-b">
						<span> </span>
						<h3><a href="#">Dr. Danielle, M.D.</a></h3>
						<p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. when an unknown printer took a galley of type Lorem Ipsum is simply dummy text.is simply dummy text..is simply dummy text..is simply dummy text.</p>
					</div>
					<img src="images/t2.jpg" title="name" />
				</div>
				<div class="team-member-grid">
					<img src="images/t3.jpg" title="name" />
					<div class="team-member-info bottom-t-info">
						<span> </span>
						<h3><a href="#">Dr. Joseph, M.D.</a></h3>
						<p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. when an unknown printer took a galley of type Lorem Ipsum is simply dummy text.is simply dummy text..is simply dummy text.</p>
					</div>
				</div>
				<div class="team-member-grid">
					<div class="team-member-info bottom-t-info bottom-t-info-b">
						<span> </span>
						<h3><a href="#">Dr. Caitlin, M.D.</a></h3>
						<p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. when an unknown printer took a galley of type Lorem Ipsum is simply dummy text.is simply dummy text..is simply dummy text..is simply dummy text.</p>
					</div>
					<img src="images/t4.jpg" title="name" />
				</div>
				<div class="team-member-grid">
					<img src="images/t5.jpg" title="name" />
					<div class="team-member-info bottom-t-info">
						<span> </span>
						<h3><a href="#">Dr. Michael, M.D.</a></h3>
						<p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. when an unknown printer took a galley of type Lorem Ipsum is simply dummy text.is simply dummy text..is simply dummy text.</p>
					</div>
				</div>
				<div class="clearfix"> </div>
			</div>

		</div>
	</div>
	<div id="contact" class="contact">
		<div class="map">
			<div class="contact-info">
				<div class="container">
					<div class="contact-grids">
						<h3>contact us</h3>
						<div class="col-md-5 contact-grid-left">
							<h4>contact information</h4>
							<ul>
								<li><span class="cal"> </span><label>Monday - Friday :</label><small>9:30 AM to 6:30 PM</small></li>
								<li><span class="pin"> </span><label>Address :</label><small>123 Some Street , London, UK, CP 123</small></li>
								<li><span class="phone"> </span><label>Phone :</label><small>(032) 987-1235</small></li>
								<li><span class="fax"> </span><label>Fax :</label><small>(123) 984-1234</small></li>
								<li><span class="mail"> </span><label>Email :</label><small> info@doctor.com</small></li>
							</ul>
						</div>
						<div class="col-md-7 contact-grid-right">
							<h4>leave us a message</h4>
							<form>
								<input type="text" value="Name:" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Name:';}">
								<input type="text" value="Email:" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Email:';}">
								<input type="text" value="Phone No:" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Phone No:';}">
								<textarea rows="2" cols="70" onfocus="if(this.value == 'Message:') this.value='';" onblur="if(this.value == '') this.value='Message:';">Message:</textarea>
								<input type="submit" value="SEND MESSAGE" />
							</form>
						</div>
						<div class="clearfix"> </div>
					</div>
					
				</div>
			</div>
		</div>
	</div>
	<div class="clearfix"> </div>
	<div class="copy-right">
		<div class="container">
			<div class="copy-right-left">
				<script type="text/javascript">
					$(document).ready(function() {

						$().UItoTop({ easingType: 'easeOutQuart' });

					});
				</script>
				<a href="#" id="toTop" style="display: block;"> <span id="toTopHover" style="opacity: 1;"> </span></a>
			</div>
		</div>
	</div>

</body>
</html>