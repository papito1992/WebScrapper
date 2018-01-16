<%--
  Created by IntelliJ IDEA.
  User: skotc
  Date: 9/13/2017
  Time: 11:01 PM
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

<body>
<table border="2px" width="80%" align="center" >
    <tr >
        <td height="80px">
            <%--header--%>
            <%--style="${url_css1}"--%>
            <%--<jsp:include page="include/header.jsp"/>--%>
        </td>
    </tr>
    <tr >
        <td height="25px">
            <%--meniu--%>
            <%--<jsp:include page="include/menu.jsp"/>--%>
        </td>
    </tr>
    <div >
        <tr >
            <td height="350px" align="top">
                <%--page content--%>
                <%--for everypage this area will be different--%>

                <%--<s:url var="url_delKeyword" value="/delkeywordId"/>--%>

                <%--<form:form action="${url_delKeyword}" >--%>


                    <%--<table align="center" style="height: 30%">--%>
                       <%--<div>--%>
                           <%--<td><h2>Keyword del with name</h2></td>--%>
                           <%--<td><form:input path="keywords"/></td>--%>
                           <%--<td><form:input path="id"/></td>--%>
                           <%--</tr>--%>
                           <%--<tr>--%>
                               <%--<td colspan="5" align="right">--%>
                                   <%--<button class="btn-group-lg">Delete By Key ir Id</button>   </br>--%>
                                   <%--<br/>--%>
                               <%--</td>--%>
                           <%--</tr>--%>
                       <%--</div>--%>
VVEIKIA

                    <%--</table>--%>
                <%--</form:form>--%>
                    <form method="post" action="/delkeywordId">
                        <input name="id">
                        <input name="keyword">
                        <input type="submit" value="Save">


                    </form>
                    <form method="post" action="/delLinkId">
                        <input name="id">
                        <input name="links">
                        <input type="submit" value="Save">


                    </form>
                    <form method="post" action="/delSendRequestId">
                        <input name="id">
                      <input type="submit" value="Save">


                    </form>

            </td>
        </tr>
    </div>

    <tr>
        <td  height="25px" class="footer">
            <%--footer--%>
            <%--<jsp:include page="include/footer.jsp"/>--%>
        </td>
    </tr>
</table>
<script src="/webjars/jquery/1.11.1/jquery.js"></script>
<script src="/webjars/bootstrap/3.3.7/js/bootstrap.js"></script>


</body>
</html>
