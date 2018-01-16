<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User1: Domas
  Date: 2017.09.13
  Time: 14:20
  To change this template use File | Settings | File Templates.
--%>

<div class="container">
  <div class="row centered-form">
    <div class="col-xs-12 col-sm-8 col-md-4 col-sm-offset-2 col-md-offset-4">
      <div class="panel panel-default">
        <div class="panel-heading">
        </div>
        <div class="panel-body">
          <s:url var="url_reg" value="/register"/>
          <form:form action="${url_reg}" modelAttribute="command">

            <table id="fonterino" align="center">
              <td><h2>name</h2></td>
              <td><form:textarea path="user1.name"/></td>

              <td><h2>Phone</h2></td>
              <td><form:textarea path="user1.phone"/></td>

              <td><h2>Email</h2></td>
              <td><form:textarea path="user1.email"/></td>

              <td><h2>Address</h2></td>
              <td><form:textarea path="user1.address"/></td>


              <td><h2>Username</h2></td>
              <td><form:textarea path="user1.loginname"/></td>


              </tr>
              <tr><td><h2>Password</h2></td>
                <td><form:textarea path="user1.password"/></td>
              </tr>
              <tr>
                <td colspan="5" align="right">
                  <button class="btn-group-lg">Submit</button>   </br>
                  <br/>
                </td>
              </tr>
            </table>
          </form:form>
        </div>
      </div>
    </div>
  </div>
</div>
