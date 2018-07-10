<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>



<head>
    <link rel="stylesheet"
          href="resources/presentation_page_new/styles/start_line.css">
    <link rel="stylesheet"
          href="resources/presentation_page_new/styles/start_menu.css">
    <link rel="stylesheet"
          href="resources/presentation_page_new/styles/reflection.css">

    <link rel="stylesheet"
          href="resources/presentation_page_new/styles/gray_block.css">
    <link rel="stylesheet"
          href="resources/presentation_page_new/styles/pink_block.css">
    <link rel="stylesheet"
          href="resources/presentation_page_new/styles/blue_block.css">
    <link rel="stylesheet"
          href="resources/presentation_page_new/styles/green_block.css">
    <link rel="stylesheet"
          href="resources/presentation_page_new/styles/purple_block.css">
    <link rel="stylesheet"
          href="resources/presentation_page_new/styles/light_blue_block.css">

    <link rel="stylesheet"
          href="resources/presentation_page_new/styles/registration_block.css">

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

	<meta charset="UTF-8">
	<title>SmartMultistory</title>
	<meta name="description" content="Comfort and organized life. Keep everything under control with SmartMultistory Monitoring  and Control system in your house. Live in future today and enjoy.">
	<meta name="keywords" content="Smart house, Smart home, Smart house systems, Smart home systems, Comfort house, House management, House monitoring, Apartment control,Apartment monitoring">
	<meta name="viewport" content="width=device-width">


    <style>
        #toTop {
            display: none;
            position: fixed;
            right: 3vw;
            bottom: 2vw;
            width: 5vw;
            height: 5vw;
            border: none;
            outline: none;
            cursor: pointer;
            z-index: 99;
            background: rgba(100, 100, 100, 0.2) url("resources/presentation_page_new/image/attachments/upCircle.png");
            background-position: center;
            background-size: 100%;
            background-repeat: no-repeat;
            border-radius: 50px;
        }

        #toTop:hover {
            background: rgba(100, 100, 100, 0.5) url("resources/presentation_page_new/image/attachments/upCircle.png");
            background-position: center;
            background-size: 100%;
            background-repeat: no-repeat;
        }

    </style>
</head>


<!-- 
@media only screen and (max-width : 1920px) and (min-width : 800px){}
@media only screen and (max-width : 800px) and (min-width : 600px){}
@media only screen and (max-width : 600px) and (min-width : 176px){} -->


<body>

<script>

    function scrollToTop() {
        $('html, body').animate({
            scrollTop: 0
        }, 700);
    }

    window.onscroll = function () {
        scrollFunction()
    };

    function scrollFunction() {
        if (document.body.scrollTop > 20 || document.documentElement.scrollTop > 20) {
            document.getElementById("toTop").style.display = "block";
        } else {
            document.getElementById("toTop").style.display = "none";
        }
    }

    $(document).ready(function () {
        setTimeout(function () {
            window.scrollTo(0, 0);
        }, 1);
        $(".message_placing").click(function () {
            $('html, body').animate({
                scrollTop: $("#gray").offset().top
            }, 700);
        });
        $(".notification_placing").click(function () {
            $('html, body').animate({
                scrollTop: $("#pink").offset().top
            }, 700);
        });
        $(".tracking_placing").click(function () {
            $('html, body').animate({
                scrollTop: $("#blue").offset().top
            }, 700);
        });
        $(".mensuration_placing").click(function () {
            $('html, body').animate({
                scrollTop: $("#green").offset().top
            }, 800);
        });

        $(".alarms_placing").click(function () {
            $('html, body').animate({
                scrollTop: $("#purple").offset().top
            }, 900);
        });
        $(".mail_placing").click(function () {
            $('html, body').animate({
                scrollTop: $("#light_blue").offset().top
            }, 900);
        });

    });
</script>

<div class="start_background_line">
		<div class="houses">
			<div class="frame_for_menu">
				<div class="block_for_photo">
					
					<div class = "imgs imgs_placing message message_placing"><a href="#gray"></a></div>
					<div class = "imgs imgs_placing tracking tracking_placing"><a href="#blue"></a></div>
					<div class = "imgs imgs_placing mensuration mensuration_placing"><a href="#green"></a></div>	
					<div class = "imgs imgs_placing notification notification_placing"><a href="#pink"></a></div>
					<div class = "imgs imgs_placing alarms alarms_placing"><a href="#purple"></a></div>
					<div class = "imgs imgs_placing mail mail_placing"><a href="#light_blue"></a></div>
					

					<div class = "main_text main_text_placing">
						<span>SMARTMULTISTORY</span>
					</div>
					<div class = "small_text small_text_placing">
						<span>MONITORING AND CONTROL</span>
					</div>	

				</div>
			</div>
		</div>
	</div>

<button id="toTop" onclick="scrollToTop()"></button>


	<div class="reflection_background">
		<div class="reflection_houses">
			<div class="reflection_text reflection_text_placing">New look on life in multi storeys</div>
		</div>
	</div>


	<div class="gray_background_block">
		<div id="gray" style="position: absolute; width: 1vw; height: 1vw;"></div>
		<div class="gray_icons_placing gray_icons"></div>
		<div class="gray_underscore gray_underscore_placing"></div>
		<div class="gray_text gray_text_placing">Chat with your neighbour</div>
		<div class="gray_lateral_line gray_lateral_line_placing"></div>

		<div class="gray_frame gray_position"></div>
		<div class="gray_form gray_position"></div>
		<div class="gray_emblem gray_position"></div>

	</div>


	<div class="pink_background_block">

		<div id="pink" style="position: absolute; width: 1vw; height: 1vw;"></div>
		<div class="pink_icons_placing pink_icons"></div>
		<div class="pink_underscore1 pink_underscore1_placing"></div>
		<div class="pink_underscore2 pink_underscore2_placing"></div>
		<div class="pink_text pink_text_placing">Distribute ads </br></br>for whole home</div>
		<div class="pink_lateral_line pink_lateral_line_placing"></div>

		<div class="pink_frame pink_position"></div>
		<div class="pink_form pink_position"></div>
		<div class="pink_emblem pink_position" "></div>

	</div>



	<div class="blue_background_block">

		<div id="blue" style="position: absolute; width: 1vw; height: 1vw;"></div>
		<div class="blue_icons1_placing blue_icons1"></div>
		<div class="blue_icons2_placing blue_icons2"></div>
		<div class="blue_underscore1 blue_underscore1_placing"></div>
		<div class="blue_underscore2 blue_underscore2_placing"></div>
		<div class="blue_text blue_text_placing">Monitor the staircase and the entrance</div>
		<div class="blue_lateral_line blue_lateral_line_placing"></div>

		<div class="blue_frame blue_position"></div>
		<div class="blue_form blue_position"></div>
		<div class="blue_emblem blue_position"></div>

	</div>


	<div class="green_background_block">

		<div id="green" style="position: absolute; width: 1vw; height: 1vw;"></div>
		<div class="green_icons_placing green_icons"></div>
		<div class="green_underscore2 green_underscore2_placing"></div>
		<div class="green_text green_text_placing"><p>Quick view of</br></br>&emsp;&emsp;all counters</p></div>
		<div class="green_lateral_line green_lateral_line_placing"></div>

		<div class="green_frame green_position"></div>
		<div class="green_form green_position"></div>
		<div class="green_emblem green_position"></div>

	</div>



	<div class="purple_background_block">

		<div id="purple" style="position: absolute; width: 1vw; height: 1vw;"></div>
		<div class="purple_underscore purple_underscore_placing"></div>
		<div class="purple_icons1_placing purple_icons1"></div>
		<div class="purple_icons2_placing purple_icons2"></div>
		<div class="purple_text purple_text_placing">Alarm notifications</div>
		<div class="purple_lateral_line purple_lateral_line_placing"></div>

		<div class="purple_frame purple_position"></div>
		<div class="purple_form purple_position"></div>
		<div class="purple_emblem purple_position"></div>

	</div>


	<div class="light_blue_background_block">

		<div id="light_blue" style="position: absolute; width: 1vw; height: 1vw;"></div>
		<div class="light_blue_underscore1 light_blue_underscore1_placing"></div>
		<div class="light_blue_icons_placing light_blue_icons"></div>
		<div class="light_blue_text light_blue_text_placing">Notification of receiving mail 
		</div>
		<div class="light_blue_lateral_line light_blue_lateral_line_placing"></div>

		<div class="light_blue_frame light_blue_position"></div>
		<div class="light_blue_form light_blue_position"></div>
		<div class="light_blue_emblem light_blue_position"></div>

	</div>


	<div class="registration_background">
		<div class="registration_houses">

            <div class="button"><a
                    href="howToJoin"><span>Join us in one click</span></a></div>
            <div class="home"><a href="login"><span>Home</span></a></div>
            <div class="connect"><a href="??????"><span>Contact us</span></a>
            </div>
			<div class="help"><a href="??????"><span>Help</span></a></div> 
			<div class="frame"></div>
			<div class="inscription"><a href="presentation_page"><span>SmartMultistory</span></a></div>
            <div class="home_icon"></div>
            <div class="connect_icon"></div>
            <div class="help_icon"></div>
			<div class="line"></div>

		</div>
	</div>

</body>
</html>