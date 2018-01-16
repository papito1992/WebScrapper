<%--
  Created by IntelliJ IDEA.
  User: skotc
  Date: 9/13/2017
  Time: 10:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<html>
<head>
    <link href="/webjars/bootstrap/3.3.7/css/bootstrap.css" rel="stylesheet" media="screen">
    <link href="../../staticResources/css/style69.css" rel="stylesheet" type="text/css"/>
    <%@taglib prefix="s" uri="http://www.springframework.org/tags" %>
    <s:url  value="/staticResources/css/style.css" var="url_css"/>
    <s:url value="/staticResources/css/stylesheet1.css" var="url_css1"/>
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
        <tr>
            <td class="border" height="350px" align="top">
                <%--page content--%>
                <%--for everypage this area will be different--%>
                <jsp:text>Add a Keyword</jsp:text>
                <c:if test="${err!=null}">
                    <p class="error"> Name Taken ${err}</p>
                </c:if>


                <%--<s:url var="url_addKeyword" value="/addkeyword"/>--%>

                <%--<form:form action="${url_addKeyword}" modelAttribute="addkey">--%>

                    <%--<table  align="center">--%>
                        <%--<td><h2>Keyword</h2></td>--%>
                        <%--<td><form:input path="keywords"/></td>--%>

                       <%--</tr>--%>

                        <%--<tr>--%>
                            <%--<td colspan="5" align="right">--%>
                                <%--<button class="btn-group-lg">Save</button>   </br>--%>
                                <%--<br/>--%>
                            <%--</td>--%>


                        <%--</tr>--%>



                    <%--</table>--%>

                <%--</form:form>--%>


                    <form method="post" action="/addkeyword">
                        <input name="id">
                        <input name="keyword">
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
