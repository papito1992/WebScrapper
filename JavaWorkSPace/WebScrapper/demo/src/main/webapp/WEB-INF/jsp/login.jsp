<%--
  Created by IntelliJ IDEA.
  User: Domas
  Date: 2017.09.13
  Time: 12:57
  To change this template use File | Settings | File Templates.
--%>

<div class="wrapper" id="divLogin">
    <form class="form-signin">
        <h2 class="form-signin-heading">Please login</h2>
        <input type="text" class="form-control" name="username" placeholder="Email Address" required="" autofocus="" />
        <input type="password" class="form-control" name="password" placeholder="Password" required=""/>
        <label class="checkbox">
            <input style="color: yellow" type="checkbox" value="remember-me" id="rememberMe" name="rememberMe"> Remember me
        </label>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Login</button>
        <a href="/register" style="color: orangered">Create new user1</a>
    </form>
        <s:url var="url_login" value="/login"/>
        <form:form action="${url_login}" >

            <table id="fonterino" align="center">

                <td><h2>Username</h2></td>
                <td><form:input path="loginname"/></td>


                </tr>
                <tr><td><h2>Password</h2></td>
                    <td><form:password path="password"/></td></tr>
                <tr>
                    <td colspan="5" align="right">
                        <button class="btn-group-lg">Login</button>   </br>
                        <br/>
                        <a href="reg_form.jsp" style="color: #ffc420"><h3>New User Registration</h3></a>
                    </td>


                </tr>

            </table>
        </form:form>

</div>

