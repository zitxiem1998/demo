<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 26/03/2019
  Time: 16:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Product Form</title>
</head>

<body>
<div id="global">
    <form action="/save-product" method="post">
        <fieldset>
            <legend>Add a product</legend>
            <label for="name">Product name: </label>
            <input type="text" name="name" id="name" value="" tabindex="1"/>
            <label for="description">Description: </label>
            <input type="text" id="description" name="description" tabindex="2"/>
            <label for="price">Price: </label>
            <input type="text" id="price" name="price" tabindex="3"/>
            <div id="buttons">
                <input type="reset" id="reset" tabindex="4"/>
                <input type="submit" id="submit" value="Add Product" tabindex="5"/>
            </div>
        </fieldset>
    </form>
</div>
</body>
</html>


