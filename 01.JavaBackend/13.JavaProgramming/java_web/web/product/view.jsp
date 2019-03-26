<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 26/03/2019
  Time: 14:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View Product</title>
</head>
<body>
<center>
<h1>View Product</h1>
<p>
    <a href="/products">Back to Product List</a>
</p>
<table border="1">
    <tr>
        <td>Name: </td>
        <td>${requestScope["product"].getName()}</td>
    </tr>
    <tr>
        <td>Price: </td>
        <td>${requestScope["product"].getPrice()}</td>
    </tr>
    <tr>
        <td>Describe: </td>
        <td>${requestScope["product"].getDescribe()}</td>
    </tr>
    <tr>
        <td>Producer :</td>
        <td>${requestScope["product"].getProducer()}</td>
    </tr>
</table>
</center>
</body>
</html>
