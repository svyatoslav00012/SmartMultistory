
<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
	<meta charset="UTF-8">

	<link rel="stylesheet"  href="home_page/styles/home.css">
	<link rel="stylesheet"  href="home_page/styles/func_border.css">
	

	<title>HomePage</title>
	<meta name="description" content="Every user will have a page, visible to all neighbors, which will contain a short list
of his contact information ( email, phone number, social network page etc.)">
	<meta name="keywords" content="Smart house, Smart home, Smart house systems, Smart home systems, Comfort house, House management, House monitoring, Apartment control,Apartment monitoring">
	<meta name="viewport" content="width=device-width, initial-scale=1">
</head>



<!-- 
@media only screen and (max-width : 1920px) and (min-width : 800px){}
@media only screen and (max-width : 800px) and (min-width : 600px){}
@media only screen and (max-width : 600px) and (min-width : 176px){} -->




<body>

	<div class="background"></div>
	<div class="houses"></div>
	<div class="block_of_text"><span class="text_on_block">Home</span></div>
<div class="block_home">
	<div class="container">
		<input class="input_style" src="images/Untitled85-17.png" style="	margin-top: 0.5vw;" type="text" name="" required placeholder="Name" autocomplete="on" pattern="[A-Za-zА-Яа-яЁё]">
		<input class="input_style" style="	margin-top: 2.5vw;" type="text" name="" required placeholder="Surname" autocomplete="on" pattern="[A-Za-zА-Яа-яЁё]">
		<input class="input_style" style="	margin-top: 4.5vw;" type="text" name="" placeholder="Name" autocomplete="on" pattern="[A-Za-zА-Яа-яЁё]">
		<input class="input_style" style="	margin-top: 6.5vw;" type="text" name="" required placeholder="Email" autocomplete="on" pattern="[A-Za-z0-9]">
		<input class="input_style" style="	margin-top: 8.5vw;" type="text" name="" placeholder="Phone number" autocomplete="on" pattern="[0-9]">
		<input class="input_style" style="	margin-top: 10.5vw;" type="text" name="" required placeholder="Flat" autocomplete="on" pattern="[0-9]">
		<input class="input_style" style="	margin-top: 12.5vw;" type="text" name="" required placeholder="House ID" autocomplete="on" pattern="[A-Za-z0-9]">
		<input class="input_style" style="	margin-top: 14.5vw;" type="password" name="" required placeholder="Password" autocomplete="on" pattern="[A-Za-z0-9] {6,12}">
		<input class="input_style" style="	margin-top: 16.5vw;" type="password" name="" required placeholder="Write password again" autocomplete="on" pattern="[A-Za-z0-9] {6,12}">
		<input class="register" type="submit" value="Save" alt="Register">
		<div class="circle" style="top: 0.9vw;"></div>
		<div class="circle" style="top: 2.9vw;"></div>
		<div class="circle" style="top: 6.9vw;"></div>
		<div class="circle" style="top: 10.9vw;"></div>
		<div class="circle" style="top: 12.9vw;"></div>
		<div class="circle" style="top: 14.9vw;"></div>
		<div class="circle" style="top: 16.9vw;"></div> 
	</div>
	<div class="photo_position background_photo">Photo</div>
	<div class="photo_position download_image"></div>
</div>

<div class="right_line">
	<div class="appearance one">
		<a href="chat_page"></a>
	</div>
	<div class="appearance two">
		<a href="notice_page"></a>
	</div>
	<div class="appearance three">
		<a href="tracking_page"></a>
	</div>
	<div class="appearance four">
		<a href="counters_page"></a>
	</div>
	<div class="appearance five">
		<a href="brief_page"></a>
	</div>
</div>


</body>
</html>