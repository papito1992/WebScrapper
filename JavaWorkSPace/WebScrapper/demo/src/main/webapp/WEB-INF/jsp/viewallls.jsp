<%--
  Created by IntelliJ IDEA.
  User: skotc
  Date: 9/15/2017
  Time: 10:36 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title></title>
  </head>
  <body>
  <c:forEach items="${resultmap}" var="entry">
    Key = ${entry.key}, value = ${entry.value}<br>
  </c:forEach>
  </body>
</html>
