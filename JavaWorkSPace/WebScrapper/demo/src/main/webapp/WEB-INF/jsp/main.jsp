<%--
  Created by IntelliJ IDEA.
  User: Domas
  Date: 2017.09.13
  Time: 09:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <style>
        body {
            background-image: url(http://www.wallpaperup.com/uploads/wallpapers/2014/09/02/433893/76e44c0b72f91b0e842dd03c4ac7cbdb.jpg);
            moz-background-size: cover;
            -webkit-background-size: cover;
            background-size: cover;
            background-position: top center !important;
            background-repeat: no-repeat !important;
            background-attachment: fixed;
        margin:0;
        padding:0;
        height:100%;
            font-family: "Times New Roman";


            text-align: left;


    }
    #container {
        min-height:100%;
        position:relative;
    }
    #header {
        background:#ff0;
        padding:10px;
    }
    #body {
        padding:10px;
        padding-bottom:60px;   /* Height of the footer */
    }
    #footer {
        position:absolute;
        bottom:0;
        width:100%;
        height:60px;
        background-color: #bd4147;


    }</style>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Your personal Data Detective</title>

    <!-- Bootstrap core CSS -->
    <link href="startbootstrap-shop-homepage-gh-pages/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="startbootstrap-shop-homepage-gh-pages/css/shop-homepage.css" rel="stylesheet">
    <script type="text/javascript" src="webjars/jquery/3.2.1/jquery.js"></script>

    <script type="text/javascript" src="js/main.js">

    </script>
</head>

<body >

<!-- Navigation -->
<nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
    <div class="container">
        <a class="navbar-brand" href="#">Data Detective</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarResponsive">
            <ul class="navbar-nav ml-auto">
                <li class="nav-item active">
                    <a class="nav-link" href="main">Home
                        <span class="sr-only">(current)</span>
                    </a>
                </li>
                <li class="nav-item" id="loginLink">
                    <a class="nav-link" href="#">Login</a>
                </li>
                <li class="nav-item" id="logoutLink">
                    <a class="nav-link" href="#">Logout</a>
                </li>
                <li class="nav-item" id="registerMain">
                    <a class="nav-link" href="#">Register</a>
                </li>
                <li class="nav-item" id="viewkeys">
                    <a class="nav-link" href="#">View Keywords</a>
                </li>
                <li class="nav-item" id="viewLinks">
                    <a class="nav-link" href="#">Links</a>
                </li>
                <li class="nav-item" id="results">
                    <a class="nav-link" href="#">Results</a>
                </li>
            </ul>
        </div>
    </div>
</nav>

<!-- Page Content -->
<div class="container">

    <div style="color: orangered" class="row">

        <div  class="col-lg-3">

            <h1 style="padding-top: 20px" >About Data Detective</h1>
            <div style="" class="list-group">
                <a href="#" style="background-color: rgba(128,128,128,0.5); color: orangered; " class="list-group-item">Purpose</a>
                <a href="#" style="background-color: rgba(128,128,128,0.5); color: orangered;"class="list-group-item">Current abilities</a>
                <a href="#" style="background-color: rgba(128,128,128,0.5); color: orangered; "class="list-group-item">Creators Vision</a>
            </div>

        </div>
        <!-- /.col-lg-3 -->

        <div style="color: orangered" class="col-lg-9">

            <div id="carouselExampleIndicators" class="carousel slide my-4" data-ride="carousel">
                <ol class="carousel-indicators">
                    <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
                    <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
                    <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
                </ol>
                <div class="carousel-inner" role="listbox">
                    <div  class="carousel-item active">
                        <img class="d-block img-fluid" src="img/4.jpg" alt="First slide">
                    </div>
                    <div class="carousel-item">
                        <img class="d-block img-fluid" src="img/5.jpg" alt="Second slide">
                    </div>
                    <div  class="carousel-item">
                        <img class="d-block img-fluid" src="img/6.jpg" alt="Third slide">
                    </div>
                </div>
                <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
                    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                    <span class="sr-only">Previous</span>
                </a>
                <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
                    <span class="carousel-control-next-icon" aria-hidden="true"></span>
                    <span class="sr-only">Next</span>
                </a>
            </div>

            <div class="row" id="choose">


                <div style="alignment: right;" class="col-lg-4 col-md-6 mb-4" id="divComp">
                    <div class="card h-100">
                        <a href="https://www.youtube.com/watch?v=OwWT43Eb3IM&t=1s"><img class="card-img-top" target="_blank" src="https://s-media-cache-ak0.pinimg.com/originals/36/5f/84/365f844c9b4971cae1a0312b55b30ce8.jpg" alt=""></a>
                        <div style="background-color: #282828; color: orangered" class="card-body">
                            <h4 class="card-title">
                                <a target="_blank" href="https://www.youtube.com/watch?v=OwWT43Eb3IM&t=1s">Play</a>
                            </h4>
                            <p class="card-text">Some music While You work</p>
                        </div>
                 </div>
                </div>
            </div>
            <!-- /.row -->

        </div>
        <!-- /.col-lg-9 -->

    </div>
    <!-- /.row -->

</div>
<!-- /.container -->

<!-- Footer -->
<footer id="footer">
    <div class="container">
        <p class="m-0 text-center text-white">Copyright &copy; <a href="https://www.facebook.com/paulius.maciukevicius.37">Papito</a></p>
    </div>
    <!-- /.container -->
</footer>

<!-- Bootstrap core JavaScript -->
<script src="startbootstrap-shop-homepage-gh-pages/vendor/jquery/jquery.min.js"></script>
<script src="startbootstrap-shop-homepage-gh-pages/vendor/popper/popper.min.js"></script>
<script src="startbootstrap-shop-homepage-gh-pages/vendor/bootstrap/js/bootstrap.min.js"></script>

</body>

</html>

