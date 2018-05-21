
<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<html>
<head>
	<meta charset="UTF-8">

	<link rel="stylesheet"  href="notice_page/styles/template_notice_page.css">
	<link rel="stylesheet"  href="notice_page/styles/blocks.css">


	<title>NoticeBoard</title>
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

	<div class="basis">  <!-- ТІНЬ -->


							         <!---------------------------- РЕДАГУВАТИ ТІЛЬКИ ЦЮ ЧАСТИНУ ------------------------->





																	
				<div class="board_scroll">  <!-- БОРДЕР З КНОПКАМИ -->
						<div class="left_button">
							<a href="#openModal"><font>Add alert</font></a>
						</div>   <!-- КНОПКА ДОДАТИ ОГОЛОШЕННЯ(ПРИ НАТИСКУ ГЕНЕРУЄТЬСЯ БЛОК З КЛАСОМ  advertisement , МОЖЕШ ДО НЬОГО ДОДАТИ ID) -->
						<div class="right_button">Clear board</div>    <!-- КНОПКА ВИДАЛИТИ УСІ ОГОЛОШЕННЯ(ПРИ НАТИСКУ ВИДАЛЯЮТЬСЯ УСІ ОГОЛОШЕННЯ З КЛАСОМ advertisement АБО ТВОЇМ ID) -->
				</div>



				<div id="openModal" class="modalDialog">
					<div>
						<input class="input_style1" style="	margin-top:2vw;" type="text" name="" required placeholder="Write a notification header" pattern="[A-Za-zА-Яа-яЁё]" maxlength="35">
						<textarea  class="input_style2" style="	margin-top: 7vw;" type="text" name="" required placeholder="Describe your notification"  pattern="[A-Za-zА-Яа-яЁё0-9]" maxlength="300"></textarea>
						<input class="input1" type="submit" value="Save" alt="Input">
						<input class="input2" type="submit" value="Close" alt="Input">
					</div>
				</div>



		<div class="scroll_block">   <!-- БЛОК В ЯКОМУ САМЕ БУДУТЬ ПОЯВЛЯТИСЬ САМЕ ЦІ ПОВІДОМЛЕННЯ З КЛАСОМ advertisement  АБО ТВОЇМ ID  -->
					

						<div class="advertisement" id=""> <!--   ОСЬ БЛОК З КЛАСОМ advertisement (ТИ МОЖЕШ В НЬОМУ ВКАЗАТИ  ID ДЛЯ СКРИПТІВ) САМЕ ЙОГО ТРЕБА ГЕНЕРУВАТИ ПРИ НАЖАТІ НА КНОПКУ  -->
							 	<div class="title">INTRODUCTION TEXT FOR THE TITLE</div>  <!-- БЛОК В ЯКИЙ МАЄШ ЗАЛИТИ ЗАГОЛОВОК ПІСЛЯ ВВЕДЕНЯ  -->
							 	<div class="text">INTRODUCTION TEXT FOR THE MESSAGE</div>    <!-- БЛОК В ЯКИЙ МАЄШ ЗАЛИТИ ТЕКСТ ОГОЛОШЕННЯ ПІСЛЯ ВВЕДЕНЯ  -->
							 	<div class="delete">Delete this notice</div>    <!-- КНОПКА ДЛЯ ВИДАЛЕННЯ САМЕ ЦЬОГО БЛОКУ, А НЕ УСІХ ВІДРАЗУ -->
						</div>


			</div>
	</div>
			



						<!-- -------------------------------------------------------------------------------------------- -->








<!-- 
			<div class="notice_board">
				<div class="text_button"><span>Notice board</span></div>
				<div class="make_button"><span>Make a notice</span></div>
			</div>

			<div class="one_board">
				<div class="one_board_ener">
					<div class="one_board_icone"></div>
				</div>
			</div>


			<div class="two_board">
				<div class="two_board_ener">
					<div class="two_board_icone_one"></div>
					<div class="two_board_icone_two"></div>
					<div class="two_board_icone_tree"></div>

				</div>
			</div>


			<div class="tree_board">
				<div class="tree_board_ener">
					<div class="tree_board_icone"></div>
				</div>
			</div> -->

			<div class="retreat"></div>


	<div class="left_border">
			
			<div class="icone_left_border"></div>



			<div class="one block_for_emblem">
				<a href="chat_page"></a>
			</div>
			<div class="two"></div>
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