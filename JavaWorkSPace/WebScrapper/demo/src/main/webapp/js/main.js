$(document).ready(function () {
    $("#loginLink").click(function () {
        $.ajax({
            type:"GET",
            contentType:"text/html; charset=utf-8",
            url:"/login",
            success:function (data) {
                alert("hello");
                $("#choose").replaceWith(data);

            }
        });
     });

    $("#registerMain").click(function () {

        // $("#choose").replaceWith("<div class='container' id=\"divRegister\">")

            $.ajax({
                type:"GET",
                contentType:"text/html; charset=utf-8",
                url:"/register",
                success:function (data) {
                    alert("hello");
                    $("#choose").replaceWith(data);
                }
            });

    })
    $("#results").click(function () {

        // $("#choose").replaceWith("<div class='container' id=\"divRegister\">")

        $.ajax({
            type:"GET",
            contentType:"text/html; charset=utf-8",
            url:"/res",
            success:function (data) {
                alert("hello");
                $("#choose").replaceWith(data);
            }
        });

    })

    $("#viewkeys").click(function () {

        // $("#choose").replaceWith("<div class='container' id=\"divRegister\">")

        $.ajax({
            type:"GET",
            contentType:"text/html; charset=utf-8",
            url:"/keywords",
            success:function (data) {
                alert("hello");
                $("#choose").replaceWith(data);
            }
        });

    })

    $("#viewLinks").click(function () {

        // $("#choose").replaceWith("<div class='container' id=\"divRegister\">")

        $.ajax({
            type:"GET",
            contentType:"text/html; charset=utf-8",
            url:"/getLinks",
            success:function (data) {
                alert("hello");
                $("#choose").replaceWith(data);
            }
        });

    })
    // $("#register69").click(function () {
    //
    //     $.ajax({
    //         type:"GET",
    //         contentType:"text/html; charset=utf-8",
    //         url:"/register",
    //         success:function (data) {
    //             alert(data);
    //             $("#register69").replaceWith(data);
    //         }
    //     });
    // });

});

