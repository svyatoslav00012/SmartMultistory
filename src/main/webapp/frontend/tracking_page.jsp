
<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
	<meta charset="UTF-8">

    <link rel="stylesheet"
          href="/resources/tracking_page/styles/template_tracking_page.css">
    <link rel="stylesheet"
          href="/resources/tracking_page/styles/blocks_tracking_page.css">


	<title>TrackinBoard</title>
	<meta name="description" content="Every user will have a page, visible to all neighbors, which will contain a short list
of his contact information ( email, phone number, social network page etc.)">
	<meta name="keywords" content="Smart house, Smart home, Smart house systems, Smart home systems, Comfort house, House management, House monitoring, Apartment control,Apartment monitoring">
	<meta name="viewport" content="width=device-width, initial-scale=1">
</head>



<!-- 
@media only screen and (max-width : 1920px) and (min-width : 800px){}
@media only screen and (max-width : 800px) and (min-width : 600px){}
@media only screen and (max-width : 600px) and (min-width : 176px){} -->

<style>
/*#container {
    margin: 0px auto;
}*/
/*#videoElement {
    width: 500px;
    height: 375px;
    background-color: #666;
}*/
</style>


<body>

	<div class="background"></div>

		<div class="icone_board"></div>

		<div class="shadow"></div>
		<div class="shadow1"></div>
		<div class="staircase_line"><span>Staircase</span></div>
		<div class="staircase_block" id="container">
			    <video autoplay="true" id="videoElement"> </video>
		</div>
		<div class="entrance_line"><span>Entrance</span></div>
		<div class="entrance_block"></div>
		<div class="retreat"></div>



		


	<div class="left_border">
			
			<div class="icone_left_border"></div>



			<div class="one block_for_emblem">
                <a href="chat"></a>
			</div>
			<div class="two block_for_emblem">
                <a href="notice"></a>
			</div>
			<div class="tree"></div>
			<div class="four block_for_emblem">
                <a href="counters"></a>
			</div>
			<div class="five block_for_emblem">
                <a href="brief"></a>
			</div>

	</div>






			<div class="border">

					<div class="under_home">
						<div class="icone_home"></div>
						<div class="home">
                            <a href="home"><font>HOME</font></a>
						</div>
					</div>
																		
					<div class="under_logout">
						<div class="icone_logout"></div>
						<div class="logout">
                            <a href="presentation"><font>LOG OUT</font></a>
						</div>
					</div>


			</div>
			

<script>
	var video = document.querySelector("#videoElement");
 
navigator.getUserMedia = navigator.getUserMedia
 || navigator.webkitGetUserMedia || navigator.mozGetUserMedia
 || navigator.msGetUserMedia || navigator.oGetUserMedia;
 
if (navigator.getUserMedia) {       
    navigator.getUserMedia({video: true}, handleVideo, videoError);
}
 
function handleVideo(stream) {
    video.src = window.URL.createObjectURL(stream);
}
 
function videoError(e) {
    // do something
}
</script>