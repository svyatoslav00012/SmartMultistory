
<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
	<meta charset="UTF-8">

    <link rel="stylesheet"
          href="/resources/brief_page/styles/template_brief_page.css">
    <link rel="stylesheet"
          href="/resources/brief_page/styles/blocks_brief_page.css">


	<title>BriefBoard</title>
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

			<div class="brief_border">
				<span class="first_phrase">Last check:</span>
				<div class="num_ago">15</div>
				<span class="second_phrase">min ago</span>
			</div>

			<div class="status_board">
				<span class="text">State:</span>
				<div class="status">reseived</div>
			</div>

			<div class="data_board">
				<div class="frame">
					<span class="phrase">Mail</span>
					<input class="button" type="reset" value="Clear table" name="">
				</div>
			</div>

				<div class="table_frame">
					<div class="time_frame">Time</div>
					<div class="date_frame">Date</div>
					<div class="state_frame">State</div>
				</div>






         <div class="frame_generation">  <!--  РАМКА, В ЯКУ НАКИДУЮТЬСЯ БЛОКИ -->




  <!------------------------------------------------------------- EDIT ONLY THIS -------------------------------------------------------------->



               <!-----------------------	GENERATE THIS -------------------------->
 
				<!--  <div class="block_for_generation"> -->    <!-- САМА ОСНОВА БЛОКУ(МІСТИТЬ ПІДБЛОКИ: ЧАС, ДАТА, СТАТУС )  -->
					<!-- <div class="time_generation"></div>	 -->	<!-- В ЦЕЙ БЛОК ЗАЛИВАТИ ЧАС  -->
					<!-- <div class="date_generation"></div> -->		<!-- В ЦЕЙ БЛОК ЗАЛИВАТИ ДАТУ -->
					<!-- <div class="state_generation"></div> -->	<!-- В ЦЕЙ БЛОК ЗАЛИВАТИ СТАТУС(ПУСТО, ОТРИМАНО)  -->
				<!-- </div>	 -->

					<!-- ------------------------------------------------------ -->



				<!-------------------  DELETE THIS(EXAMPLE) ------------------------>

				

				<div class="block_for_generation">
					<div class="time_generation">15:27</div>
					<div class="date_generation">17.05.2018</div>
					<div class="state_generation">recived</div>
				</div>


				<div class="block_for_generation">
					<div class="time_generation">12:00</div>
					<div class="date_generation">17.05.2018</div>
					<div class="state_generation">empty</div>
				</div>

				<div class="block_for_generation">
					<div class="time_generation">09:15</div>
					<div class="date_generation">17.05.2018</div>
					<div class="state_generation">empty</div>
				</div>


			</div>

			<!-- --------------------------------------------------------->
		</div>




<!-- -------------------------------------------------------------------------------------------------------------------------------------- -->



			<div class="retreat"></div>





	<div class="left_border">
			
			<div class="icone_left_border"></div>

			<div class="one block_for_emblem">
                <a href="chat"></a>
			</div>
			<div class="two block_for_emblem">
                <a href="notice"></a>
			</div>
			<div class="tree block_for_emblem">
                <a href="tracking"></a>
			</div>
			<div class="four block_for_emblem">
                <a href="counters"></a>
			</div>
			<div class="five"></div>

	</div>






			<div class="border">
																		<!-- ВСТАВИТИ СИЛКУ -->

					<div class="under_home">
						<div class="icone_home"></div>
						<div class="home">
                            <a href="home><font>HOME</font></a>
						</div>
					</div>
																		
					<div class=" under_logout">
						<div class="icone_logout"></div>
						<div class="logout">
                            <a href="presentation><font>LOG OUT</font></a>
						</div>
					</div>


			</div>


	

</body>
</html>