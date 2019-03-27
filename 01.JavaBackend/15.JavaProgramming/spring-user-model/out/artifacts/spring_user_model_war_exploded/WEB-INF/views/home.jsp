<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 27/03/2019
  Time: 17:02
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<center>
    <form method="post" action="login" modelAttribute="login">
        <fieldset>
            <legend>Login Information</legend>
            <table>
                <tr>
                    <td>User:</td>
                    <td><input type="text" name="user" id="user"></td>
                </tr>
                <tr>
                    <td>Password:</td>
                    <td><input type="password" name="password" id="password"></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Login"></td>
                    <td><input type="reset" value="Reset"></td>
                </tr>
            </table>
        </fieldset>
    </form>
</center>
</body>
</html>
