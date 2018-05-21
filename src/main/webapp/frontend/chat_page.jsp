
<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
	<meta charset="UTF-8">

	<link rel="stylesheet"  href="chat_page/styles/template_chat_page.css">
	<link rel="stylesheet"  href="chat_page/styles/blocks_chat_page.css">


	<title>ChatBoard</title>
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

			<div class="icone_board"></div>

			<div class="members_block">
				<div class="members_board">Members of chat</div></div>
				<div class="block one_b"></div>
				<div class="block two_b"></div>
				<div class="block three_b"></div>

			<div class="chat_block">
				<div class="chat_border">Chat</div>
				<div class="input_border">
					<input class="write" type="text" name="print_text"  placeholder="Write..." >
					<input class="button" type="submit" name="button_send" value="Send">
					<div class="sent"></div>
				</div>
			</div>



			<div class="retreat"></div>


	<div class="left_border">
			
			<div class="icone_left_border"></div>



			<div class="one"></div>

			<div class="two block_for_emblem">
				<a href="notice_page"></a>
			</div>
			
			<div class="tree block_for_emblem">
				<a href="tracking_page"></a>
			</div>
			<div class="four block_for_emblem">
				<a href="counters_page"></a>
			</div>
			<div class="five block_for_emblem">
				<a href="brief_page"></a>
			</div>

	</div>






			<div class="border">

				<div class="under_home">
						<div class="icone_home"></div>
						<div class="home">
							<a href="home_page"><font>HOME</font></a>
						</div>
					</div>
																		
					<div class="under_logout">
						<div class="icone_logout"></div>
						<div class="logout">
							<a href="presentation_page"><font>LOG OUT</font></a>
						</div>
					</div>


			</div>


	

</body>
</html>