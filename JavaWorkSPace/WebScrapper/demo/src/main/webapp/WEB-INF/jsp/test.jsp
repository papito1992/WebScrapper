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
   <%--<input id="newtext" type="text">--%>

    <%--<button value="addkeyword" onclick="addkey2(document.getElementById('newtext')).value()">Add Keyword</button>--%>
    <%--<button value="addkeyword" onclick="add(document.getElementById('newtext')).value()">Add Keyword</button>--%>
    <input id="test" type="text">
    <button onclick="add22()">Add Keyword</button>
    <table class="table table-striped table-inverse">
        <thead>
        <tr><th>Id</th>
            <th>Keyword</th>
        </tr>
        </thead>
        <tbody>
        <tr>
        </tr>
        <c:forEach var="s" items="${keylist}">
            <tr>
            </tr>
            <tr id="tr-${s.id}">
                <th scope="row">${s.id}</th>
                <td><input id="input${s.id}" value="${s.keywords}"></td>
                <td> <button value="update2" onclick="update69('${s.id}')" >Update69</button> </td>
                <td> <button value="delete2" onclick="delete2(${s.id})" >Delete</button> </td>
            </tr>

        </c:forEach>
        </tbody>
    </table>
</div>

<%--<input id="test" type="text">--%>
<%--<button onclick="add()">Add Keyword</button>--%>


<script>


    function update69(id) {
        var input = document.getElementById('input'+id).value;
        $.post("updateKey?keyword="+input+"&id="+id,function (data) {
            alert(data)
        });

    }

    function delete2(id) {

        $.ajax({
            url:"delkeywordId?id="+id,
            type:"get",

            success:function (data, status) {
                alert(data);
                $("#tr-"+id).hide();
            }
        });


    }
    function add2() {
        var input = document.getElementById('test').value;
        $.ajax({

            url:"addkeyword?keyword="+input,
            type:"post",

            success:function (data, status) {
               location.reload();

            }
        });


    }
    function add22() {
        var input = document.getElementById('test').value;
        $.ajax({

            url:"addkeyword?keyword="+input,
            type:"post",
            success:function (data, status) {
                if(data.success==true){
                    location.reload(true)
                }


            }
        });


    }
    function add() {

        var input = document.getElementById('test').value;

        $.post("addkeyword?keyword="+input,function (data) {

           location.reload();
        });

    }
</script>
<%--<input type="hidden" id="currentRow"/>--%>
<%--<script>--%>
    <%--function dddd() {--%>

            <%--$(document).on('click', 'span.editrow', function () {--%>
                <%--$("#currentRow").val($(this).closest("tr").attr("id"));--%>
            <%--})--%>
        <%--$("button#savebutton").click(function(){--%>
            <%--if($("#currentRow").val()){--%>
                <%--var row = $("table tbody").find('#'+$("#currentRow").val());--%>
                <%--// var updated_row = //Updated template of the existing row--%>
                <%--row.replaceWith (updated_row);--%>
                <%--$("#currentRow").val("");--%>
            <%--}--%>
        <%--});--%>
    <%--}--%>

<%--</script>--%>



<%--//     function addkey2(keywords) {--%>
<%--////         $.ajax({--%>
<%--////             url:"addkeyword?keyword="+keywords,--%>
<%--////             type:"get",--%>
<%--////--%>
<%--////             success:function (data, status) {--%>
<%--////                 alert(data);--%>
<%--//////                 $("#tr-"+id).();--%>
<%--////             }--%>
<%--////         });--%>
<%--//         $.post("addkeyword?keyword="+keywords,function (data) {--%>
<%--//alert(data)--%>
<%--//         });--%>
<%--//     }--%>
<%--//    function update2(id, keywords) {--%>
<%--//--%>
<%--//        $.ajax({--%>
<%--//            url:"updateKey?id="+id+"&keyword="+keywords,--%>
<%--//            method:"POST",--%>
<%--//contentType:"application/json",--%>
<%--//            success:function (data, status) {--%>
<%--//                alert(data);--%>
<%--//            }--%>
<%--//        });--%>
<%--//--%>
<%--//--%>
<%--//    }--%>








<script type="text/javascript" src="webjars/jquery/1.11.1/jquery.js"/>
<script type="text/javascript" src="webjars/bootstrap/4.0.0-alpha.6-1/js/bootstrap.js"/>
</body>
</html>
