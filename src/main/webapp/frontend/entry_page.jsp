<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <meta charset="UTF-8">

    <link rel="stylesheet" href="/resources/entry_page/styles/entry.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

    <title>EnterHome</title>
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

<script>

    //    function login() {
    //
    //        var account = {};
    //
    //        account.email = $('#email').val();
    //        account.password = $('#password').val();
    //        account.remember = $('#rememberMe').val();
    //
    //        $.ajax({
    //            type: "GET",
    //            url: "api/account/login",
    //            contentType: 'application/json',
    //            data: JSON.stringify(account)
    //        });
    //    }

    function home() {
        window.location.replace("/")
    }

</script>

<div class="background"></div>
<div class="houses"></div>
<div class="block_of_text" onclick="home()"><span class="text_on_block">SmartMultistory</span>
</div>
<div class="container">

    <div style="margin-left: 10vw">
        <c:if test="${logout == true}">
            <div>You've been successfully logged out</div>
        </c:if>
        <c:if test="${error == true}">
            <div>Wrong email or password</div>
        </c:if>
        <form method="post">
            <input name="${_csrf.parameterName}" value="${_csrf.token}"
                   type="hidden">
            <input id="email" class="input_style" src="images/Untitled85-17.png"
                   style="margin-top: 0.5vw;" type="text" name="username"
                   required placeholder="email" autocomplete="on">
            <input id="password" class="input_style" style="margin-top: 2.5vw;"
                   type="password" name="password" required
                   placeholder="password" autocomplete="on">
            <input id="rememberMe" type="checkbox" id="scales" name="feature"
                   value="scales" style="margin-top: 4.5vw; font-size: 20px;"
                   checked/>
            <label for="scales">Remember me</label>
            <div><a href="/howToJoin">Don't have our system in your
                building?</a></div>
            <input class="enter" type="submit" name="submit" value="Login"
                   src="resources/join_page/images/Untitled78-1-1.png"
                   alt="LogIn"/>
        </form>
    </div>
</div>


</body>
</html>