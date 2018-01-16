
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>


<c:set var="path" value="${pageContext.request.contextPath}"/>

<html>
<head>
    <title>registracijos langas</title>

    <link rel="stylesheet" href="${path}/resources/css/style.css">
    <link rel="stylesheet" href="${path}/resources/css/bootstrap.min.css">

</head>
<body>

<div class="container">
    <div class="row">
        <div class="col-md-8 col-md-offset-2">
           <form method="post" action="${path}/login" class="form-control ${error!=null ? 'show-error' : ''}">
               <input name="username" type="text" placeholder="vartotojo vardas" autofocus="true"/>
               <input name="password" type="password" placeholder="slaptažodis"/>
               <span>${error}</span>
               <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
               <button class="btn" type="submit">Log In</button>

               <h4><a href="${path}/register" target="_self"> create new user1</a> </h4>
           </form>
        </div>
    </div>
</div>







<script type="text/javascript" src="${path}/resources/js/bootstrap.min.js"/>
<script type="text/javascript" src="${path}/resources/js/jquery.min.js"/>
</body>
</html>
