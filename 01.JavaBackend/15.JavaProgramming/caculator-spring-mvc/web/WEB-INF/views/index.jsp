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
    <title>Calculator</title>
  </head>
  <body>
  <center>
    <form method="post" action="calculator">
    <h1>Calculator</h1>
    <fieldset>
      <legend>Calculator information</legend>
      <table>
        <tr>
          <td>First operand: </td>
          <td><input type="text" name="firstOperand" id="firstOperand" value="${firstOperand}"></td>
        </tr>
        <tr>
          <td>Second operand: </td>
          <td><input type="text" name="secondOperand" id="secondOperand" value="${secondOperand}"></td>
        </tr>
      </table>
      <input type="submit" value="Addition" name="calculator" formmethod="post">
      <input type="submit" value="Subtraction" name="calculator"  formmethod="post">
      <input type="submit" value="Multiplication" name="calculator"  formmethod="post">
      <input type="submit" value="Division" name="calculator"  formmethod="post">
    </fieldset>
    </form>
    <h2>Result ${calculator}:  ${result}</h2>
  </center>
  </body>
</html>
