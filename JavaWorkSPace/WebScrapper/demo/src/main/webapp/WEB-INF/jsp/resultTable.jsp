<%--
  Created by IntelliJ IDEA.
  User: skotc
  Date: 9/15/2017
  Time: 10:53 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
  <link rel="stylesheet" href="webjars/bootstrap/4.0.0-beta/css/bootstrap.css">

  <script type="text/javascript" src="webjars/jquery/3.2.1/jquery.js"></script>

  <script type="text/javascript" href="webjars/bootstrap/4.0.0-beta/css/bootstrap.css"></script>
  <title>Title</title>
</head>
<body>

<div class="container">


  <table class="table table-striped table-inverse">
    <thead>
    <tr><th>Id</th>
      <th>Inserted Keyword</th>
      <th>Scanned Link</th>
      <th>Resulting Title</th>
      <th>Resulting Link</th>
    </tr>
    </thead>
    <tbody>
    <tr>


    </tr>
    <c:forEach var="s" items="${list1}">
      <tr>

      </tr>
      <tr id="tr-${s.id}">
        <th scope="row">${s.id}</th>

        <td><a href="${s.resultingLink}">${s.resultingLink}</a></td>

        <td><"${s.insertedKeyword}"></td>
        <td><a href="${s.scrappedLink}">${s.scrappedLink}</a></td>
        <td><"${s.resultingFullTitle}"></td>
        <td><a href="${s.resultingLink}">${s.resultingLink}</a></td>
        <td> <button value="delete2" onclick="delete2(${s.id})" >Delete</button> </td>
      </tr>
    </c:forEach>
    </tbody>
  </table>
</div>
<%--<input id="test" type="text">--%>
<%--<button onclick="add()">Add Keyword</button>--%>
<script>
    function add() {
        var input = document.getElementById('test').value;
        $.post("addLink?links="+input,function (data) {

            alert(data)
        });

    }

</script>

<script>


    function update69(id) {
        var input = document.getElementById('input'+id).value;
        $.post("updateLink?links="+input+"&id="+id,function (data) {

            alert(data)
        });

    }

</script>
<script>





    function delete2(id) {

        $.ajax({
            url:"delSendRequestId?id="+id,

            type:"get",

            success:function (data, status) {
                alert(data);
                $("#tr-"+id).hide();
            }
        });


    }
</script>

<script type="text/javascript" src="webjars/jquery/1.11.1/jquery.js"/>
<script type="text/javascript" src="webjars/bootstrap/4.0.0-alpha.6-1/js/bootstrap.js"/>
</body>
</html>
