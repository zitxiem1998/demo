<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 28/03/2019
  Time: 16:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Email Validation</title>
</head>
<body>
<center>
    <form method="post" action="validate">
        <h1>Email Validation</h1>
        <h2 style="color: red">${message}</h2>
        <fieldset>
            <legend>Email</legend>
            <table>
                <tr>
                    <td>Email: </td>
                    <td><input type="text" name="email" value="${email}"></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Validate"></td>
                </tr>
            </table>
        </fieldset>
    </form>
</center>
</body>
</html>
