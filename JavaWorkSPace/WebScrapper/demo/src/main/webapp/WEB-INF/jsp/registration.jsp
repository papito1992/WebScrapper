
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

            <form:form method="post" modelAttribute="userForm" cssClass="formdesign">

                <spring:bind path="username">
                <form:input type="text" path="username" placeholder="vartotojo vardas" autofocus="true" ></form:input>
                <form:errors path="username"></form:errors>
                </spring:bind>
                <spring:bind path="password">
                <form:input type="password" path="password" placeholder="slaptažodis"></form:input>
                <form:errors path="password"></form:errors>
                </spring:bind>
                <spring:bind path="passwordConfirm">
                <form:input type="password" path="passwordConfirm" placeholder="pakartok slaptažodį"></form:input>
                <form:errors path="passwordConfirm"></form:errors>
                </spring:bind>
                <button type="submit" class="btn">save </button>
            </form:form>
        </div>
    </div>
</div>








<script type="text/javascript" src="${path}/resources/js/bootstrap.min.js"/>
<script type="text/javascript" src="${path}/resources/js/jquery.min.js"/>
</body>
</html>
