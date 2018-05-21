<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<html>
<head>
    <meta charset="UTF-8">
    <%--<c:url value="/webapp/frontend" var="root" />--%>
    <%--<c:set var="url">${pageContext.request.requestURL}</c:set>--%>
    <%--<base href="${fn:substring(url, 0, fn:length(url) - fn:length(pageContext.request.requestURI))}${pageContext.request.contextPath}/" />--%>
    <%--<script>var base = document.getElementsByTagName("base")[0].href;</script>--%>

    <link rel="stylesheet" href="notice_page/styles/template_notice_page.css">
    <link rel="stylesheet" href="notice_page/styles/blocks.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

    <title>NoticeBoard</title>
    <meta name="description" content="Every user will have a page, visible to all neighbors, which will contain a short list
of his contact information ( email, phone number, social network page etc.)">
    <meta name="keywords"
          content="Smart house, Smart home, Smart house systems, Smart home systems, Comfort house, House management, House monitoring, Apartment control,Apartment monitoring">
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


    <script>


        function updateNotes() {

            $(".scroll_block").empty();

            $.get("/api/notes", function (notes) {
                $.each(notes, function (index, note) {

                    console.log(note);
                    $("#scrl").append("<div class=\"one_board\">"
                          + note.topic + "<br>" + note.content
                        + "<div class=\"one_board_ener\">"
                        + "<div class=\"one_board_icon\"> </div>"
                        + "</div>"
                        + "</div>");
                });
            });



        }

        $(document).ready(updateNotes());

//        $("button").click(function () {
//            $.get("demo_test.asp", function (data, status) {
//                alert("Data: " + data + "\nStatus: " + status);
//            });
//        });

    </script>


    <div class="board_scroll">  <!-- БОРДЕР З КНОПКАМИ -->
        <div class="left_button">Add alert</div>
        <!-- КНОПКА ДОДАТИ ОГОЛОШЕННЯ(ПРИ НАТИСКУ ГЕНЕРУЄТЬСЯ БЛОК З КЛАСОМ  ____, МОЖЕШ ДО НЬОГО ДОДАТИ ID) -->
        <div class="right_button">Clear board</div>
        <!-- КНОПКА ВИДАЛИТИ УСІ ОГОЛОШЕННЯ(ПРИ НАТИСКУ ВИДАЛЯЮТЬСЯ УСІ ОГОЛОШЕННЯ З КЛАСОМ ____ АБО ТВОЇМ ID) -->
    </div>


    <div id="scrl" class="scroll_block">
        <!-- БЛОК В ЯКОМУ САМЕ БУДУТЬ ПОЯВЛЯТИСЬ САМЕ ЦІ ПОВІДОМЛЕННЯ З КЛАСОМ ____ АБО ТВОЇМ ID  -->


        <%--<div class="one_board" style="top:25vw;">--%>
            <%--<div class="one_board_ener">--%>
                <%--<div class="one_board_icone"></div>--%>
            <%--</div>--%>
        <%--</div>--%>


        <%--<div class="one_board" style="top:45vw;">--%>
            <%--<div class="one_board_ener">--%>
                <%--<div class="one_board_icone"></div>--%>
            <%--</div>--%>
        <%--</div>--%>
    <%--</div>--%>
</div>


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