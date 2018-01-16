<%--
  Created by IntelliJ IDEA.
  User: skotc
  Date: 9/5/2017
  Time: 10:40 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <link href="/webjars/bootstrap/3.3.7/css/bootstrap.css" rel="stylesheet" media="screen">
    <link href="../../staticResources/css/style69.css" rel="stylesheet" type="text/css"/>
    <%@taglib prefix="s" uri="http://www.springframework.org/tags" %>
    <s:url  value="/staticResources/css/style.css" var="url_css"/>
    <s:url value="/staticResources/css/stylesheet1.css" var="url_css1"/>
    <%--<s:url value="/staticResources/images/1.jpg" var="url_backG"/>--%>
    <%--<s:url value="/staticResources/images/2.jpg" var="url_backG2"/>--%>
    <%--<s:url value="/staticResources/images/4.jpg" var="url_backG4"/>--%>
    <%--<s:url value="/staticResources/images/5.jpg" var="url_backG5"/>--%>
    <%--<s:url value="/staticResources/images/6.jpg" var="url_backG6"/>--%>
    <%--<s:url value="/staticResources/images/7.jpg" var="url_backG7" />--%>
    <link href="${url_css}" rel="stylesheet" type="text/css"/>
    <link href="${url_css1}" rel="stylesheet" type="text/css"/>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

    <title>Title</title>
</head>
<%--class ="table glyphicon-text-color"--%>
<%-- background="${url_backG4}"--%>
<body class="body">
<jsp:text>Register for a personal Book Keeper</jsp:text>
<table class="trow" width="80%" align="center" >
    <tr class="trow">
        <td height="80px">
            <%--header--%>
            <%--style="${url_css1}"--%>

        </td>
    </tr>
    <tr class="trow">
        <td height="25px">
            <%--meniu--%>
            <%--<jsp:include page="include/menu.jsp"/>--%>
        </td>
    </tr>
    <div >
        <tr class="body2">
            <td class="border" height="350px" align="top">
                <%--page content--%>
                <%--for everypage this area will be different--%>
                <jsp:text>User Registration</jsp:text>
                <c:if test="${err!=null}">
                    <p class="error"> Name Taken ${err}</p>
                </c:if>


                <s:url var="url_reg" value="/register"/>
                <%--@elvariable id="<command>" type=""--%>
                <form:form action="${url_reg}" modelAttribute="command">

                    <table id="fonterino" align="center">
                        <td><h2>name</h2></td>
                        <td><form:input path="user1.name"/></td>

                        <td><h2>Phone</h2></td>
                        <td><form:input path="user1.phone"/></td>

                        <td><h2>Email</h2></td>
                        <td><form:input path="user1.email"/></td>

                        <td><h2>Address</h2></td>
                        <td><form:input path="user1.address"/></td>


                        <td><h2>Username</h2></td>
                        <td><form:input path="user1.loginname"/></td>


                        </tr>
                        <tr><td><h2>Password</h2></td>
                            <td><form:password path="user1.password"/></td>
                        </tr>

                        <tr>
                            <td colspan="5" align="right">
                                <button class="btn-group-lg">Submit</button>   </br>
                                <br/>
                            </td>


                        </tr>

                    </table>
                </form:form>


            </td>
        </tr>
    </div>

    <tr>
        <td  height="25px" class="footer">
            <%--footer--%>

        </td>
    </tr>
</table>
<script src="/webjars/jquery/1.11.1/jquery.js"></script>
<script src="/webjars/bootstrap/3.3.7/js/bootstrap.js"></script>
</body>
</html>
