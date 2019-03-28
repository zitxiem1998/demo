<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 28/03/2019
  Time: 14:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sandwich condiments</title>
</head>
<body>
<center>
    <h1>Sandwich condiments</h1>
    <form method="post" action="condiment">
        <table>
            <tr>
                <td><input type="checkbox" name="condiment" value="Lettuce">Lettuce</td>
                <td><input type="checkbox" name="condiment" value="Tomato">Tomato</td>
                <td><input type="checkbox" name="condiment" value="Mustard">Mustard</td>
                <td><input type="checkbox" name="condiment" value="Sprouts">Sprouts</td>
            </tr>
            <hr/>
            <tr>
                <td><input type="submit" value="save"></td>
            </tr>

        </table>
    </form>
</center>
</body>
</html>
