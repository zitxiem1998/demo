<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 20/03/2019
  Time: 16:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<form method="post" action="calculate">
    <h1>Simple Calculator</h1>
    <fieldset>
        <legend>Calculator</legend>
        <table>
            <tr>
                <td>First Operand:</td>
                <td><input type="text" name="firstOperand"></td>
            </tr>
            <tr>
                <td>Operator</td>
                <td>
                    <select name="operator">
                        <option value="+">Addition</option>
                        <option value="-">Subtraction</option>
                        <option value="*">Multiplication</option>
                        <option value="/">Division</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td>Second Operand:</td>
                <td><input type="text" name="secondOperand"></td>
            </tr>
            <tr>
                <td><input type="submit" value="calculate"></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
