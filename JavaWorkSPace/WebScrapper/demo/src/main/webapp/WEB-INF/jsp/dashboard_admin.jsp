<%--
  Created by IntelliJ IDEA.
  User: skotc
  Date: 9/6/2017
  Time: 10:53 AM
  To change this template use File | Settings | File Templates.
--%>
<%--
  Created by IntelliJ IDEA.
  User1: skotc
  Date: 9/5/2017
  Time: 10:40 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <%--<link href="/webjars/bootstrap/3.3.7/css/bootstrap.css" rel="stylesheet" media="screen">--%>
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

    <title>Title</title>
</head>
<%--class ="table glyphicon-text-color"--%>
<%-- background="${url_backG4}"--%>
<body class="body2" background="">
<jsp:text>Admin's DashBoard</jsp:text>
<table  class="thead" width="80%" align="center" >
    <tr class="trow">
        <td height="80px">
            <%--header--%>
            <%--style="${url_css1}"--%>
            <jsp:include page="include/header.jsp"/>
        </td>
    </tr>
    <tr class="trow">
        <td height="25px">
            <%--meniu--%>
            <jsp:include page="include/menu.jsp"/>
        </td>
    </tr>
    <tr class="trow">
        <td height="80%">
            <%--page content--%>
            <%--for everypage this area will be different--%>

            <h1></h1>
        </td>
    </tr>
    <tr>
        <td  height="25px" class="footer">
            <%--footer--%>
            <jsp:include page="include/footer.jsp"/>
        </td>
    </tr>
</table>
<script src="/webjars/jquery/1.11.1/jquery.js"></script>
<script src="/webjars/bootstrap/3.3.7/js/bootstrap.js"></script>
</body>
</html>

