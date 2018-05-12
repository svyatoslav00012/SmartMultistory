<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
</head>

<body>
<h2>${msg}</h2>

<script>
    var html;

    $(document).ready(function(){
        $("#button1").click(function(){
            $.ajax({url: "http://localhost:8080/api/notes", success: function(result){
                responce = result;

                $.each(result, function(index, val) {
                    console.log(val.id);
                    $("#div1").append("<h2>" + val.topic + " <br> " + val.content + " </h2>");
                });
            }});
        });
    });

</script>


<script>
    var html;

    $(document).ready(function(){
        $("#button2").click(function(){

            var note = {};

            note.topic = $('#topic').val();
            note.content = $('#content').val();

            $.ajax({
                type:"POST",
                url:"api/note",
                contentType: 'application/json',
                data: JSON.stringify(note)
            })

        });
    });





</script>

<div id="div1"><h2>Let jQuery AJAX Change This Text</h2></div>


Topic: <input type="text" id="topic">
Content: <input type="text" id="content">
<button id="button2">Post</button>
<button id="button1">Fetch</button>

</body>
</html>