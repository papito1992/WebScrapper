<%--
  Created by IntelliJ IDEA.
  User: Domas
  Date: 2017.09.13
  Time: 14:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link rel="stylesheet" href="webjars/bootstrap/4.0.0-beta/css/bootstrap.css">

    <script type="text/javascript" src="webjars/jquery/3.2.1/jquery.js"></script>
    <script type="text/javascript" src="webjars/bootstrap/4.0.0-beta/js/bootstrap.js"></script>
    <script type="text/javascript" src="../../js/links.js"></script>

    <title>Admin Page</title>

</head>
<body>
    <div class="container" style="margin-top: 10px">

            <div class="col-lg-9">
        <table class="table" id="admintable">
            <thead class="table-inverse">
            <tr>
                <th>Id</th>
                <th>Keyword</th>
                <th>Link</th>
                <th>Resulting Title</th>
                <th>Resulting Link</th>

            </tr>
            </thead>
            <tbody class="table">
                <c:forEach var="results" items="${reslist}">
                    <tr>
                        <td>${results.id}</td>
                        <td>${results.insertedKeyword}</td>
                        <td><a href="${results.scrappedLink}">${results.scrappedLink}</a> </td>
                        <td>${results.resultingFullTitle}</td>
                        <td><a href="${results.resultingLink}">${results.resultingLink}</a> </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
            </div>
    </div>

    </div>
</body>
</html>
