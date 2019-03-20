<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 20/03/2019
  Time: 16:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product_Discount_Calculator</title>
</head>
<body>
<form method="post" action="display-discount">
    <h1>Product_Discount_Calculator</h1>
    <h2><input type="text" name="productDescription" placeholder="Product Description"></h2>
    <h3><input type="text" name="listPrice" size="30" placeholder="List Price"></h3>
    <h4><input type="text" name="discountPercent" placeholder="Discount Percent"></h4>
    <h5><input type="submit" value="Calculate Discount"></h5>
</form>
</body>
</html>
