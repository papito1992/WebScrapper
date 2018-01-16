$(document).ready(function () {
   $("#orderlink").click(function () {
       $.ajax({
           type:'GET',
           contentType:"text/html; charset=utf-8",

           url:'/orders',
           success:function (data) {
            $("#admintable").html(data);
           }
       });
   });

   $("#computerlink").click(function () {
       $.ajax({
           type:'GET',
           contentType:"text/html; charset=utf-8",
           url:'/computers',
           success:function (data) {
               $("#admintable").html(data);
           }
       });
   });
    $("#proclink").click(function () {
        $.ajax({
            type:'GET',
            contentType:"text/html; charset=utf-8",
            url:'/processors',
            success:function (data) {
                $("#admintable").html(data);
            }
        });
    });
    $("#gpulink").click(function () {
        $.ajax({
            type:'GET',
            contentType:"text/html; charset=utf-8",
            url:'/gpu',
            success:function (data) {
                $("#admintable").html(data);
            }
        });
    });
    $("#ramlink").click(function () {
        $.ajax({
            type:'GET',
            contentType:"text/html; charset=utf-8",
            url:'/ram',
            success:function (data) {
                $("#admintable").html(data);
            }
        });
    });
    $("#mblink").click(function () {
        $.ajax({
            type:'GET',
            contentType:"text/html; charset=utf-8",
            url:'/motherboard',
            success:function (data) {
                $("#admintable").html(data);
            }
        });
    });
    // $("#reglink").click(function () {
    //     $.ajax({
    //         type:'GET',
    //         contentType:"text/html; charset=utf-8",
    //         url:'/keywords',
    //         success:function (data) {
    //             $("#admintable").html(data);
    //         }
    //     });
    // });
});