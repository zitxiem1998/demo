<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 27/03/2019
  Time: 17:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User</title>
</head>
<body>
<fieldset>
    <legend>User Information</legend>
    <table>
        <tr>
            <td>User: </td>
            <td>${user.user}</td>
        </tr>
        <tr>
            <td>Name: </td>
            <td>${user.name}</td>
        </tr>
        <tr>
            <td>Email: </td>
            <td>${user.email}</td>
        </tr>
        <tr>
            <td>Age: </td>
            <td>${user.age}</td>
        </tr>
    </table>
</fieldset>
</body>
</html>
