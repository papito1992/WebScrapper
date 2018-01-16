<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <link rel="stylesheet" href="webjars/bootstrap/4.0.0-beta/css/bootstrap.css">

    <script type="text/javascript" src="webjars/jquery/3.2.1/jquery.js"></script>

    <script type="text/javascript" href="webjars/bootstrap/4.0.0-beta/css/bootstrap.css"></script>
</head>
<body>
<div class="container" >
    <input id="test" type="text">
    <button onclick="add()">Add a Link</button>
    <table class="table table-striped table-inverse" >
        <thead>
        <tr><th>Id</th>
            <th>Link</th>
        </tr>
        </thead>
        <tbody>
        <tr>
        </tr>
        <c:forEach var="s" items="${linklist}">
                <tr id="tr-${s.id}">
                <th scope="row">${s.id}</th>
                <td><input id="input${s.id}" value="${s.links}"></td>
                <td> <button value="update2" onclick="update69('${s.id}')" >Update69</button> </td>
                <td> <button value="delete2" onclick="delete2(${s.id})" >Delete</button> </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
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
            url:"delLinkId?id="+id,
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
