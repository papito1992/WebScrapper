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

<div class="container" id="divRegister">
  <div class="row">
    <div class="col-md-8 col-md-offset-2">

      <%--@elvariable id="user1Form" type=""--%>
      <form:form method="post" modelAttribute="user1Form" cssClass="formdesign">

        <spring:bind path="name">
          <form:input type="text" path="name" placeholder="vartotojo vardas" autofocus="true" ></form:input>
          <form:errors path="name"></form:errors>
        </spring:bind>
        <spring:bind path="phone">
          <form:input type="text" path="phone" placeholder="phone"></form:input>
          <form:errors path="phone"></form:errors>
        </spring:bind>
        <spring:bind path="email">
          <form:input type="text" path="email" placeholder="email"></form:input>
          <form:errors path="email"></form:errors>
        </spring:bind>
        <spring:bind path="address">
          <form:input type="text" path="address" placeholder="address"></form:input>
          <form:errors path="address"></form:errors>
        </spring:bind>
        <spring:bind path="loginname">
        <form:input type="text" path="loginname" placeholder="Login name"></form:input>
        <form:errors path="loginname"></form:errors>
      </spring:bind>
        <spring:bind path="password">
          <form:input type="password" path="password" placeholder="enter password"></form:input>
          <form:errors path="password"></form:errors>
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